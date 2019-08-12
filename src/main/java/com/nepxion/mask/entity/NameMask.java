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

public class NameMask extends Mask {
    private static final long serialVersionUID = 2689683569240982116L;

    private static NameMask instance = new NameMask();

    public static NameMask instance() {
        return instance;
    }

    private NameMask() {
        super(0, 0, 0);
    }

    @Override
    protected char[] internalMask(String text) {
        char[] charArray = text.toCharArray();
        charArray[0] = MaskUtil.MASK_CHAR;

        return charArray;
    }
}