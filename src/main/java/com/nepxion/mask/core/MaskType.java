package com.nepxion.mask.core;

/**
 * <p>Title: Nepxion Mask</p>
 * <p>Description: Nepxion Mask</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import com.nepxion.mask.entity.AddressMask;
import com.nepxion.mask.entity.AiMask;
import com.nepxion.mask.entity.BankCardMask;
import com.nepxion.mask.entity.CaptchaMask;
import com.nepxion.mask.entity.CvvMask;
import com.nepxion.mask.entity.DefaultMask;
import com.nepxion.mask.entity.EmailMask;
import com.nepxion.mask.entity.ExpMask;
import com.nepxion.mask.entity.IdCardMask;
import com.nepxion.mask.entity.IpAddressMask;
import com.nepxion.mask.entity.Mask;
import com.nepxion.mask.entity.MobileMask;
import com.nepxion.mask.entity.NameMask;
import com.nepxion.mask.entity.PasswordMask;

public enum MaskType {
    /**
     * 默认掩码
     */
    DEFAULT(DefaultMask.instance()),

    /**
     * 手机号码掩码
     */
    MOBILE(MobileMask.instance()),

    /**
     * 银行卡号掩码
     */
    BANK_CARD(BankCardMask.instance()),

    /**
     * 身份证号
     */
    ID_CARD(IdCardMask.instance()),

    /**
     * 姓名掩码
     */
    NAME(NameMask.instance()),

    /**
     * 信用卡CVV掩码
     */
    CVV(CvvMask.instance()),

    /**
     * 信用卡有效期掩码
     */
    EXP(ExpMask.instance()),

    /**
     * 密码掩码
     */
    PASSWORD(PasswordMask.instance()),

    /**
     * 验证码掩码
     */
    CAPTCHA(CaptchaMask.instance()),

    /**
     * 地址掩码
     */
    ADDRESS(AddressMask.instance()),

    /**
     * 邮件地址掩码
     */
    EMAIL(EmailMask.instance()),

    /**
     * IP地址掩码
     */
    IP_ADDRESS(IpAddressMask.instance()),

    /**
     * 智能掩码
     */
    AI(AiMask.instance());

    private Mask mask;

    private MaskType(Mask mask) {
        this.mask = mask;
    }

    public final String mask(String text) {
        return mask.mask(text);
    }

    public final char[] maskToChars(String text) {
        return mask.maskToChars(text);
    }
}