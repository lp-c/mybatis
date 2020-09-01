package mybatis.result;

import lombok.Data;

import java.util.Date;

/**
 * @author lp
 * @date 2020/9/1 16:33
 */

@Data
public class InfoVO {

    String content;

    String type;

    String createPeople;

    Date createTime;
}
