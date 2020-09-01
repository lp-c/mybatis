package mybatis.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import mybatis.enums.Type;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lp
 * @date 2020/9/1 12:09
 */
@Data
@TableName("information")
public class Information implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    Long id;

    @TableField(value="create_people")
    String createPeople;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField(fill = FieldFill.INSERT,value = "create_time")
    Date createTime;

    @TableField(value = "modify_people")
    String modifyPeople;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField(fill = FieldFill.INSERT_UPDATE, update = "NOW()",value = "modify_time")
    Date modifyTime;

    @TableField(value = "deleted")
    private Integer deleted;

    String content;

    Integer type;
}
