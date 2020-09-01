package mybatis.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author lp
 * @date 2020/9/1 16:23
 */
//需要将自定义填充控制器注册为组件

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {


    //insert操作时要填充的字段
    @Override
    public void insertFill(MetaObject metaObject) {
        //根据属性名字设置要填充的值
        this.setFieldValByName("createTime",new Date(),metaObject);
        this.setFieldValByName("modifyTime",new Date(),metaObject);
    }

    //update操作时要填充的字段
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("modifyTime",new Date(),metaObject);
    }
}


