package com.nepxion.mask.entity;

/**
 * <p>Title: Nepxion Mask</p>
 * <p>Description: Nepxion Mask</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

public class IdCardMask extends Mask {
    private static final long serialVersionUID = -1788599350301335670L;

    private static IdCardMask instance = new IdCardMask();

    public static IdCardMask instance() {
        return instance;
    }

    private IdCardMask() {
        super(2, 2, 0);
    }
}