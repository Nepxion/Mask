package com.nepxion.mask.entity;

/**
 * <p>Title: Nepxion Mask</p>
 * <p>Description: Nepxion Mask</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

public class MobileMask extends Mask {
    private static final long serialVersionUID = 1189902073978874993L;

    private static MobileMask instance = new MobileMask();

    public static MobileMask instance() {
        return instance;
    }

    private MobileMask() {
        super(3, 4, 0);
    }
}