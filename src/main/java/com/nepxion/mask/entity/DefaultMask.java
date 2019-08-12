package com.nepxion.mask.entity;

/**
 * <p>Title: Nepxion Mask</p>
 * <p>Description: Nepxion Mask</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

public class DefaultMask extends Mask {
    private static final long serialVersionUID = -1207036305758150185L;

    private static DefaultMask instance = new DefaultMask();

    public static DefaultMask instance() {
        return instance;
    }

    private DefaultMask() {
        super(5, 5, 3);
    }
}