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

public class ExpMask extends Mask {
    private static final long serialVersionUID = -7179637852631456931L;

    private static ExpMask instance = new ExpMask();

    public static ExpMask instance() {
        return instance;
    }

    private ExpMask() {
        super(0, 0, 0);
    }

    @Override
    protected char[] internalMask(String text) {
        return MaskUtil.MASK_4;
    }
}