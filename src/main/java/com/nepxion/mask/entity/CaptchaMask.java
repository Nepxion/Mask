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

public class CaptchaMask extends Mask {
    private static final long serialVersionUID = -2194235760154043576L;

    private static CaptchaMask instance = new CaptchaMask();

    public static CaptchaMask instance() {
        return instance;
    }

    private CaptchaMask() {
        super(0, 0, 0);
    }

    @Override
    protected char[] internalMask(String text) {
        return MaskUtil.MASK_6;
    }
}