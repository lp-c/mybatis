package mybatis.test;

import com.alibaba.fastjson.JSON;
import mybatis.entity.User;

/**
 * @author lp
 * @date 2020/8/24 9:07
 */
public class fastJsonTest {
    public static void main(String[] args) {
        serialize();
        deserialize();
    }

    public static void serialize() {
        User user = new User();
        user.setId(11);
        user.setName("西安");
        user.setAge(20);
        user.setEmail("631968524@qq.com");
        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString);
    }

    public static void deserialize() {
        String jsonString = "{\"id\":11,\"name\":\"西安\",\"age\":20,\"email\":\"631968524@qq.com\"}";
        User user = JSON.parseObject(jsonString, User.class);
        System.out.println(user);
    }
}
