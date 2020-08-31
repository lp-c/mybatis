package mybatis.test;

import java.lang.reflect.Array;
import java.time.Instant;
import java.util.*;

/**
 * @author lp
 * @date 2020/8/20 14:21
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        //System.out.println(date);
        Date from = Date.from(Instant.now());
        //System.out.println(from);
        //List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        //names.add("lp"); 本质上还是数组 不支持集合操作
        List<String> names = new ArrayList<>(Arrays.asList("peter", "anna", "mike", "xenia"));
        names.add("lp");
        Collections.sort(names,(a,b)->b.compareTo(a));
        System.out.println(names);
    }
}
