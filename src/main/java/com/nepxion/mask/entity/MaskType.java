package com.nepxion.mask.entity;

/**
 * <p>Title: Nepxion Mask</p>
 * <p>Description: Nepxion Mask</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

import java.util.regex.Pattern;

import com.nepxion.mask.core.Mask;

public enum MaskType {
    /**
     * 默认的掩码类型
     */
    DEFAULT(5, 5, 3),

    /**
     * 手机号码
     */
    MOBILE(3, 4, 0),

    /**
     * 银行卡号
     */
    BANK_CARD(6, 4, 0),

    /**
     * 身份证号
     */
    ID_CARD(2, 2, 0),

    /**
     * 姓名
     */
    NAME(0, 0, 0) {
        @Override
        protected char[] internalMask(String text) {
            char[] charArray = text.toCharArray();
            charArray[0] = Mask.MASK_CHAR;

            return charArray;
        }
    },

    /**
     * 信用卡 CVV
     */
    CVV(0, 0, 0) {
        @Override
        protected char[] internalMask(String text) {
            return Mask.MASK_3;
        }
    },

    /**
     * 信用卡有效期
     */
    CREDIT_EXP(0, 0, 0) {
        @Override
        protected char[] internalMask(String text) {
            return Mask.MASK_4;
        }
    },

    /**
     * 密码
     */
    PASSWORD(0, 0, 0) {
        @Override
        protected char[] internalMask(String text) {
            return Mask.MASK_6;
        }
    },

    /**
     * 验证码
     */
    CAPTCHA(0, 0, 0) {
        @Override
        protected char[] internalMask(String text) {
            return Mask.MASK_6;
        }
    },

    /**
     * 地址
     */
    ADDRESS(0, 0, 0) {
        private final Pattern PATTERN = Pattern.compile("[0-9一二三四五六七八九十百千万]++|[A-Za-z]+(?=\\s*[座区])");
        private final String mask = new String(Mask.MASK_3);

        @Override
        protected char[] internalMask(String text) {
            return PATTERN.matcher(text).replaceAll(mask).toCharArray();
        }
    },

    /**
     * 邮件
     */
    EMAIL(0, 0, 0) {
        @Override
        protected char[] internalMask(String text) {
            char[] charArray = text.toCharArray();
            int index = text.indexOf('@');
            if (index < 2) {
                return charArray;
            }

            int length = charArray.length - index + 1;

            char[] chars = new char[length + 4];
            chars[0] = charArray[0];
            chars[1] = chars[2] = chars[3] = Mask.MASK_CHAR;

            System.arraycopy(charArray, index - 1, chars, 4, length);

            return chars;
        }
    },

    /**
     * IP
     */
    IP_ADDRESS(0, 0, 0) {
        @Override
        protected char[] internalMask(String text) {
            char[] charArray = text.toCharArray();
            boolean isMask = false;
            int offset = 0;
            for (int i = 0, d = 0; i < charArray.length; i++) {
                if (charArray[i] == '.') {
                    charArray[offset++] = charArray[i];
                    d++;
                    isMask = true;
                    continue;
                }
                if (d == 0 || d > 2) {
                    charArray[offset++] = charArray[i];
                    continue;
                }
                if (isMask) {
                    charArray[offset++] = Mask.MASK_CHAR;
                    isMask = false;
                }
            }

            char[] chars = new char[offset];

            System.arraycopy(charArray, 0, chars, 0, chars.length);

            return chars;
        }
    },

    GUESS(0, 0, 0) {
        @Override
        protected char[] internalMask(String text) {
            if (text.indexOf('@') >= 0) {
                return EMAIL.internalMask(text);
            }

            if (text.indexOf('.') >= 0) {
                return IP_ADDRESS.internalMask(text);
            }

            if (text.indexOf('号') >= 0) {
                return ADDRESS.internalMask(text);
            }

            switch (text.length()) {
                case 3:
                    return CVV.internalMask(text);
                case 4:
                    return CREDIT_EXP.internalMask(text);
                case 6:
                    return CAPTCHA.internalMask(text);
                case 11:
                    return MOBILE.internalMask(text);
                case 18:
                    return ID_CARD.internalMask(text);
            }

            return DEFAULT.internalMask(text);
        }
    };

    /**
     * 掩码时开始需要保留的字符数量
     */
    private int before;

    /**
     * 掩码时结尾需要保留的字符数量
     */
    private int after;

    /**
     * 掩码字符的数量，若小于等于 0，则掩码字符的数量与原文数量一致
     */
    private int mask;

    private MaskType(int before, int after, int mask) {
        this.before = before;
        this.after = after;
        this.mask = mask;
    }

    /**
     * 对数据进行掩码
     * @param text 待掩码的原文字符串
     * @return 掩码后的字符串
     */
    public final String mask(String text) {
        if (text == null || text.length() == 0) {
            return text;
        }

        return new String(internalMask(text));
    }

    /**
     * 对数据进行掩码
     * @param text 待掩码的原文字符串
     * @return 掩码后的字节数组
     */
    public final char[] maskToChars(String text) {
        if (text == null) {
            return null;
        }

        if (text.length() == 0) {
            return Mask.EMPTY_CHARS;
        }

        return internalMask(text);
    }

    protected char[] internalMask(String text) {
        return Mask.maskToChars(text, before, after, mask);
    }
}