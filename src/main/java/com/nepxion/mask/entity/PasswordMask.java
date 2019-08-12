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

public class PasswordMask extends Mask {
    private static final long serialVersionUID = -2002856803756293940L;

    private static PasswordMask instance = new PasswordMask();

    public static PasswordMask instance() {
        return instance;
    }

    private PasswordMask() {
        super(0, 0, 0);
    }

    @Override
    protected char[] internalMask(String text) {
        return MaskUtil.MASK_6;
    }
}