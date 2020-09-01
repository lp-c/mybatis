package mybatis.controller;

import mybatis.entity.Information;
import mybatis.params.CommonIdVO;
import mybatis.params.InfoParam;
import mybatis.params.RestResult;
import mybatis.params.SearchParam;
import mybatis.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lp
 * @date 2020/9/1 13:54
 */

@RestController
public class InfoController {

    @Autowired
    private InfoService infoService;

    @PostMapping("add")
    public RestResult<CommonIdVO> add(@RequestBody InfoParam infoParam){
        return infoService.add(infoParam);
    }

    @PostMapping("list")
    public List<Information> list(){
        return infoService.list();
    }

    //逻辑有点小问题 用户输入的类型是字符串 数据库存储的类型是整型
    @PostMapping("search")
    public List<Information> search(@RequestBody SearchParam searchParam){
        return infoService.search(searchParam);
    }
}
