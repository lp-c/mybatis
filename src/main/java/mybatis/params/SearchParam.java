package mybatis.params;

import lombok.Data;

/**
 * @author lp
 * @date 2020/9/1 16:57
 */
@Data
public class SearchParam {

    //根据类型查找咨询 后期可以加时间范围 关键字
    Integer type;
}
