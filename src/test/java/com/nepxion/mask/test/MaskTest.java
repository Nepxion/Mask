package com.nepxion.mask.test;

/**
 * <p>Title: Nepxion Zxing</p>
 * <p>Description: Nepxion Zxing QR Code</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import com.nepxion.mask.entity.Mask;

public class MaskTest {
    public static void main(String[] args) throws Exception {
        System.out.println(Mask.MOBILE.mask("13812345678"));
        System.out.println(Mask.BANK_CARD.mask("1234 1234 1234 1234 123"));
        System.out.println(Mask.ID_CARD.mask("331012198001013030"));
        System.out.println(Mask.NAME.mask("张三丰"));
        System.out.println(Mask.CVV.mask("123"));
        System.out.println(Mask.CREDIT_EXP.mask("12/18"));
        System.out.println(Mask.PASSWORD.mask("12345678"));
        System.out.println(Mask.CAPTCHA.mask("1234"));
        System.out.println(Mask.ADDRESS.mask("上海市浦东新区浦建路1000弄2号0501室"));
        System.out.println(Mask.EMAIL.mask("1394997@qq.com"));
        System.out.println(Mask.IP_ADDRESS.mask("192.168.0.1"));
    }
}