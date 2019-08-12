package com.nepxion.mask.entity;

/**
 * <p>Title: Nepxion Mask</p>
 * <p>Description: Nepxion Mask</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.io.Serializable;

import com.nepxion.mask.util.MaskUtil;

public class Mask implements Serializable {
    private static final long serialVersionUID = -2960566323941316411L;

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

    public Mask(int before, int after, int mask) {
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
            return MaskUtil.EMPTY_CHARS;
        }

        return internalMask(text);
    }

    protected char[] internalMask(String text) {
        return MaskUtil.maskToChars(text, before, after, mask);
    }
}