package mybatis.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import mybatis.entity.User;
import mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lp
 * @date 2020/8/18 14:58
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getById")
    public User getUserService() {
        return userService.getById("1");
    }

    @RequestMapping("getAll")
    public List<User> getAll() {
        return userService.list();
    }

    @RequestMapping("logicPage")
    public Page<User> getPage() {
        Page<User> page = new Page<>(2,2);
        return userService.page(page);
    }

    @RequestMapping("update")
    public void updateInfo(){
        userService.updateInfo();
    }
}
