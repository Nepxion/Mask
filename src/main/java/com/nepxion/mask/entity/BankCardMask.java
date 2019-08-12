package com.nepxion.mask.entity;

/**
 * <p>Title: Nepxion Mask</p>
 * <p>Description: Nepxion Mask</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

public class BankCardMask extends Mask {
    private static final long serialVersionUID = -2860556249132541172L;

    private static BankCardMask instance = new BankCardMask();

    public static BankCardMask instance() {
        return instance;
    }

    private BankCardMask() {
        super(6, 4, 0);
    }
}