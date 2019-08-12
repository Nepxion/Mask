package com.nepxion.mask.test;

/**
 * <p>Title: Nepxion Mask</p>
 * <p>Description: Nepxion Mask</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import com.nepxion.mask.core.MaskType;

public class MaskTest {
    public static void main(String[] args) throws Exception {
        System.out.println(MaskType.MOBILE.mask("13812345678"));
        System.out.println(MaskType.BANK_CARD.mask("1234 1234 1234 1234 123"));
        System.out.println(MaskType.ID_CARD.mask("331012198001013030"));
        System.out.println(MaskType.NAME.mask("张三丰"));
        System.out.println(MaskType.CVV.mask("123"));
        System.out.println(MaskType.EXP.mask("12/18"));
        System.out.println(MaskType.PASSWORD.mask("12345678"));
        System.out.println(MaskType.CAPTCHA.mask("1234"));
        System.out.println(MaskType.ADDRESS.mask("上海市浦东新区浦建路1000弄2号0501室"));
        System.out.println(MaskType.EMAIL.mask("1394997@qq.com"));
        System.out.println(MaskType.IP_ADDRESS.mask("192.168.0.1"));
    }
}