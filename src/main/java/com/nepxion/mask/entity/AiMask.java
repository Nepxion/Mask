package com.nepxion.mask.entity;

/**
 * <p>Title: Nepxion Mask</p>
 * <p>Description: Nepxion Mask</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

public class AiMask extends Mask {
    private static final long serialVersionUID = -7365495867106615877L;

    private static AiMask instance = new AiMask();

    public static AiMask instance() {
        return instance;
    }

    private AiMask() {
        super(0, 0, 0);
    }

    @Override
    protected char[] internalMask(String text) {
        if (text.indexOf('@') >= 0) {
            return EmailMask.instance().internalMask(text);
        }

        if (text.indexOf('.') >= 0) {
            return IpAddressMask.instance().internalMask(text);
        }

        if (text.indexOf('号') >= 0) {
            return AddressMask.instance().internalMask(text);
        }

        switch (text.length()) {
            case 3:
                return CvvMask.instance().internalMask(text);
            case 4:
                return ExpMask.instance().internalMask(text);
            case 6:
                return CaptchaMask.instance().internalMask(text);
            case 11:
                return MobileMask.instance().internalMask(text);
            case 18:
                return IdCardMask.instance().internalMask(text);
        }

        return DefaultMask.instance().internalMask(text);
    }
}