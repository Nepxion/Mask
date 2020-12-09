# Nepxion Mask
[![Total lines](https://tokei.rs/b1/github/Nepxion/Mask?category=lines)](https://tokei.rs/b1/github/Nepxion/Mask?category=lines)  [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg?label=license)](https://github.com/Nepxion/Mask/blob/master/LICENSE)  [![Maven Central](https://img.shields.io/maven-central/v/com.nepxion/mask.svg?label=maven%20central)](https://search.maven.org/artifact/com.nepxion/mask)  [![Javadocs](http://www.javadoc.io/badge/com.nepxion/mask.svg)](http://www.javadoc.io/doc/com.nepxion/mask)  [![Build Status](https://travis-ci.org/Nepxion/Mask.svg?branch=master)](https://travis-ci.org/Nepxion/Mask)  [![Codacy Badge](https://api.codacy.com/project/badge/Grade/2b9d72ef8b7b42acac3a03994c8b5b41)](https://www.codacy.com/project/HaojunRen/Mask/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Nepxion/Mask&amp;utm_campaign=Badge_Grade_Dashboard)  [![Stars](https://img.shields.io/github/stars/Nepxion/Mask.svg?label=Stars&tyle=flat&logo=GitHub)](https://github.com/Nepxion/Mask/stargazers)  [![Stars](https://gitee.com/Nepxion/Mask/badge/star.svg)](https://gitee.com/nepxion/Mask/stargazers)

Nepxion Mask是一款掩码脱敏集成组件(从网上开源搜集并重构优化，非原创)

## 请联系我
微信、钉钉、公众号和文档

![](http://nepxion.gitee.io/docs/zxing-doc/微信-1.jpg)![](http://nepxion.gitee.io/docs/zxing-doc/钉钉-1.jpg)![](http://nepxion.gitee.io/docs/zxing-doc/公众号-1.jpg)![](http://nepxion.gitee.io/docs/zxing-doc/文档-1.jpg)

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

## 示例
调用入口
```java
public class MaskTest {
    public static void main(String[] args) throws Exception {
        System.out.println("手机号码 13812345678，脱敏值=" + MaskType.MOBILE.mask("13812345678"));
        System.out.println("银行卡号 1234123412341234123，脱敏值=" + MaskType.BANK_CARD.mask("1234123412341234123"));
        System.out.println("身份证号 331012198001013030，脱敏值=" + MaskType.ID_CARD.mask("331012198001013030"));
        System.out.println("姓名 张三丰，脱敏值=" + MaskType.NAME.mask("张三丰"));
        System.out.println("信用卡CVV 123，脱敏值=" + MaskType.CVV.mask("123"));
        System.out.println("信用卡有效期 1220，脱敏值=" + MaskType.EXP.mask("1220"));
        System.out.println("密码 1234567890，脱敏值=" + MaskType.PASSWORD.mask("1234567890"));
        System.out.println("验证码 1234，脱敏值=" + MaskType.CAPTCHA.mask("1234"));
        System.out.println("地址 上海市浦东新区浦建路1000弄1幢101室，脱敏值=" + MaskType.ADDRESS.mask("上海市浦东新区浦建路1000弄1幢101室"));
        System.out.println("邮件地址 1394997@qq.com，脱敏值=" + MaskType.EMAIL.mask("1394997@qq.com"));
        System.out.println("IP地址 192.168.0.1，脱敏值=" + MaskType.IP_ADDRESS.mask("192.168.0.1"));
    }
}
```

运行结果
```java
手机号码 13812345678，脱敏值=138****5678
银行卡号 1234123412341234123，脱敏值=123412*********4123
身份证号 331012198001013030，脱敏值=33**************30
姓名 张三丰，脱敏值=*三丰
信用卡CVV 123，脱敏值=***
信用卡有效期 1220，脱敏值=****
密码 1234567890，脱敏值=******
验证码 1234，脱敏值=******
地址 上海市浦东新区浦建路1000弄1幢101室，脱敏值=上海市浦东新区浦建路***弄***幢***室
邮件地址 1394997@qq.com，脱敏值=1***7@qq.com
IP地址 192.168.0.1，脱敏值=192.*.*.1
```

## Star走势图
[![Stargazers over time](https://starchart.cc/Nepxion/Mask.svg)](https://starchart.cc/Nepxion/Mask)