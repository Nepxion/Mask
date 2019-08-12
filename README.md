# Nepxion Mask
[![Total lines](https://tokei.rs/b1/github/Nepxion/Mask?category=lines)](https://tokei.rs/b1/github/Nepxion/Mask?category=lines)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg?label=license)](https://github.com/Nepxion/Mask/blob/master/LICENSE)
[![Build Status](https://travis-ci.org/Nepxion/Mask.svg?branch=master)](https://travis-ci.org/Nepxion/Mask)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/2b9d72ef8b7b42acac3a03994c8b5b41)](https://www.codacy.com/project/HaojunRen/Mask/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Nepxion/Mask&amp;utm_campaign=Badge_Grade_Dashboard)

Nepxion Mask是一款掩码脱敏集成组件(从网上开源搜集，非原创)

## 请联系我
微信和公众号

![Alt text](https://github.com/Nepxion/Docs/raw/master/zxing-doc/微信-1.jpg)
![Alt text](https://github.com/Nepxion/Docs/raw/master/zxing-doc/公众号-1.jpg)

## 简介
支持如下业务场景
- 手机号码脱敏
- 银行卡号脱敏
- 身份证号脱敏
- 姓名脱敏
- 信用卡CVV脱敏
- 信用卡有效期脱敏
- 密码脱敏
- 验证码脱敏
- 地址脱敏
- 邮件地址脱敏
- IP地址脱敏
- 智能脱敏
- 默认脱敏

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
        System.out.println(MaskType.EXP.mask("12/18"));
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

## Star走势图

[![Stargazers over time](https://starchart.cc/Nepxion/Mask.svg)](https://starchart.cc/Nepxion/Mask)