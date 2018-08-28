# Nepxion Mask
![CoL](https://tokei.rs/b1/github/Nepxion/Mask)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg?label=license)](https://github.com/Nepxion/Mask/blob/master/LICENSE)
[![Build Status](https://travis-ci.org/Nepxion/Mask.svg?branch=master)](https://travis-ci.org/Nepxion/Mask)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/2b9d72ef8b7b42acac3a03994c8b5b41)](https://www.codacy.com/project/HaojunRen/Mask/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Nepxion/Mask&amp;utm_campaign=Badge_Grade_Dashboard)

Nepxion Mask是一款掩码脱敏组件(从网上开源搜集，非原创)

## 请联系我
![Alt text](https://github.com/Nepxion/Docs/blob/master/zxing-doc/微信-1.jpg)

## 简介
支持如下业务场景
- 手机号码
- 银行卡号
- 身份证号
- 姓名
- 信用卡 CVV
- 信用卡有效期
- 密码
- 验证码
- 地址
- 邮件
- IP

## 示例
调用入口
```java
public class MaskTest {
    public static void main(String[] args) throws Exception {
        System.out.println(MaskType.MOBILE.mask("13812345678"));
        System.out.println(MaskType.BANK_CARD.mask("1234 1234 1234 1234 123"));
        System.out.println(MaskType.ID_CARD.mask("331012198001013030"));
        System.out.println(MaskType.NAME.mask("张三丰"));
        System.out.println(MaskType.CVV.mask("123"));
        System.out.println(MaskType.CREDIT_EXP.mask("12/18"));
        System.out.println(MaskType.PASSWORD.mask("12345678"));
        System.out.println(MaskType.CAPTCHA.mask("1234"));
        System.out.println(MaskType.ADDRESS.mask("上海市浦东新区浦建路1000弄2号0501室"));
        System.out.println(MaskType.EMAIL.mask("1394997@qq.com"));
        System.out.println(MaskType.IP_ADDRESS.mask("192.168.0.1"));
    }
}
```

运行结果
```java
138****5678
1234 1************* 123
33**************30
*三丰
***
****
******
******
上海市浦东新区浦建路***弄***号***室
1***7@qq.com
192.*.*.1
```