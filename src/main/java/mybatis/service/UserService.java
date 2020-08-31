package mybatis.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import mybatis.entity.User;

/**
 * @author lp
 * @date 2020/8/18 14:56
 */
public interface UserService extends IService<User> {
    public IPage<User> selectUserPage(Page<User> page, Integer state);
    public void updateInfo();
}
