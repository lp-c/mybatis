package mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import mybatis.entity.User;

/**
 * @author lp
 * @date 2020/8/18 14:44
 */
public interface UserMapper extends BaseMapper<User> {
    IPage<User> selectPageVo(Page<?> page, Integer state);
}
