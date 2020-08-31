package mybatis.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lp
 * @date 2020/8/19 16:02
 */
public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> res = list.stream().map(i -> i * i).distinct().collect(Collectors.toList());
       //System.out.println(res);
        String name="lp";
        String sex="nan";
        String email="111@qq.com";
        String info=String.format("xc %s %s %s",name,sex,email);
        //System.out.println(info);
        System.out.println(String.valueOf(3.14));
    }
}
