

## String新增处理方法

### 概述

JDK11新增了一些使用的String处理方法：

* 判断字符串是否为空白：isBlank()
* 去除首尾空白，可以去除全角的空白字符：strip()
* 去除尾部空格：stripTrailing()
* 去除首部空格：stripLeading()
* 复制字符串：repeat(数量)
* 行数统计：lines().count()



### 使用

```java
package mao;

/**
 * Project name(项目名称)：JDK11_string_new_processing_method
 * Package(包名): mao
 * Class(类名): Test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/2
 * Time(创建时间)： 16:59
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test1
{
    public static void main(String[] args)
    {
        //判断字符串是否为空白
        System.out.println(" ".isBlank());
        System.out.println("   ".isBlank());
        System.out.println(" a ".isBlank());
        System.out.println("".isBlank());

        //去除首尾空白
        System.out.println(" a ".strip());
        System.out.println(" a    ".strip());
        System.out.println("a  ".strip());
        System.out.println("  a".strip());
        System.out.println("a".strip());
        System.out.println("".strip());
        System.out.println("   ".strip());
        System.out.println(" a  b".strip());
        System.out.println(" a  b   ".strip());

        //去除尾部空格
        System.out.println(" a ".stripTrailing());
        System.out.println(" a    ".stripTrailing());
        System.out.println("a  ".stripTrailing());
        System.out.println("  a".stripTrailing());
        System.out.println("a".stripTrailing());
        System.out.println("".stripTrailing());
        System.out.println("   ".stripTrailing());
        System.out.println(" a  b".stripTrailing());
        System.out.println(" a  b   ".stripTrailing());

        //去除首部空格
        System.out.println(" a ".stripLeading());
        System.out.println(" a    ".stripLeading());
        System.out.println("a  ".stripLeading());
        System.out.println("  a".stripLeading());
        System.out.println("a".stripLeading());
        System.out.println("".stripLeading());
        System.out.println("   ".stripLeading());
        System.out.println(" a  b".stripLeading());
        System.out.println(" a  b   ".stripLeading());

        //复制字符串
        System.out.println("12345".repeat(5));
        System.out.println(" 12345 ".repeat(5));
        System.out.println("12345".repeat(3));

        //行数统计
        System.out.println("\n\n\n".lines().count());
        System.out.println("\n\n\n\n\n".lines().count());
    }
}
```



```sh
true
true
false
true
a
a
a
a
a


a  b
a  b
 a
 a
a
  a
a


 a  b
 a  b
a 
a    
a  
a
a


a  b
a  b   
1234512345123451234512345
 12345  12345  12345  12345  12345 
123451234512345
3
5
```



