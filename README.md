# Zxing
[![Apache License 2](https://img.shields.io/badge/license-ASF2-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0.txt)

## 掩码脱敏组件(从网上开源搜集，非原创)，支持如下业务场景
    1 手机号码
    2 银行卡号
    3 身份证号
    4 姓名
    5 信用卡 CVV
    6 信用卡有效期
    7 密码
    8 验证码
    9 地址
    10 邮件
    11 IP

## 示例
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
## 输出
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