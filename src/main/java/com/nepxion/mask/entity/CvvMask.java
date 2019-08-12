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

public class CvvMask extends Mask {
    private static final long serialVersionUID = 133870946589470992L;

    private static CvvMask instance = new CvvMask();

    public static CvvMask instance() {
        return instance;
    }

    private CvvMask() {
        super(0, 0, 0);
    }

    @Override
    protected char[] internalMask(String text) {
        return MaskUtil.MASK_3;
    }
}