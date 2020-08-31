package mybatis.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import mybatis.entity.User;
import mybatis.mapper.UserMapper;
import mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lp
 * @date 2020/8/18 14:57
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public IPage<User> selectUserPage(Page<User> page, Integer state) {
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题，这时候你需要自己查询 count 部分
        // page.setOptimizeCountSql(false);
        // 当 total 为小于 0 或者设置 setSearchCount(false) 分页插件不会进行 count 查询
        // 要点!! 分页返回的对象与传入的对象是同一个
        return userMapper.selectPageVo(page, state);
    }

    @Override
    public void updateInfo() {
        User user = new User();
        user.setEmail("86335749@qq.com");
        LambdaUpdateWrapper<User> wrapper = Wrappers.lambdaUpdate();
        wrapper.eq(User::getName,"sandy");

        User user1 = new User();
        user1.setId(1);
        user1.setEmail("88888");
        userMapper.updateById(user1);

        userMapper.update(user,wrapper);

    }
}
