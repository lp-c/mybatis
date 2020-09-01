package mybatis.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author lp
 * @date 2020/9/1 13:42
 */

@Getter
@AllArgsConstructor
public enum Type {

    HOUSE(1,"房产"),
    FOOD(2,"美食");



    Integer code;

    String type;

}
