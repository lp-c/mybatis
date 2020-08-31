package mybatis.entity;

import lombok.Data;

/**
 * @author lp
 * @date 2020/8/18 14:25
 */

@Data
public class User {
    Integer id;
    String name;
    Integer age;
    String email;
}
