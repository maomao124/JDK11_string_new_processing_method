package mao;

import java.util.Arrays;
import java.util.List;

/**
 * Project name(项目名称)：JDK11_string_new_processing_method
 * Package(包名): mao
 * Class(类名): Test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/2
 * Time(创建时间)： 17:10
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test2
{
    public static void main(String[] args)
    {
        List<Integer> list = List.of(10, 11, 12, 13, 14);
        //11之前
        Integer[] integers = list.toArray(new Integer[0]);
        //11之后
        Integer[] integers1 = list.toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.toString(integers1));
    }
}
