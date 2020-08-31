package mybatis.entity;

import lombok.Data;

import java.util.List;

/**
 * @author lp
 * @date 2020/8/18 16:38
 */
@Data
public class UserVO {
    private Integer current;
    private Integer size;
    private Long total;
    private List<User> userList;
}