package com.nepxion.mask.entity;

/**
 * <p>Title: Nepxion Mask</p>
 * <p>Description: Nepxion Mask</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import com.nepxion.mask.util.MaskUtil;

public class EmailMask extends Mask {
    private static final long serialVersionUID = -1716288434067457562L;

    private static EmailMask instance = new EmailMask();

    public static EmailMask instance() {
        return instance;
    }

    private EmailMask() {
        super(0, 0, 0);
    }

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
        chars[1] = chars[2] = chars[3] = MaskUtil.MASK_CHAR;

        System.arraycopy(charArray, index - 1, chars, 4, length);

        return chars;
    }
}