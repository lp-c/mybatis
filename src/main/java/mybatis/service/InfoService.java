package mybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import mybatis.entity.Information;
import mybatis.params.CommonIdVO;
import mybatis.params.InfoParam;
import mybatis.params.RestResult;
import mybatis.params.SearchParam;

import java.util.List;

/**
 * @author lp
 * @date 2020/9/1 14:32
 */
public interface InfoService extends IService<Information> {

    RestResult<CommonIdVO> add(InfoParam infoParam);

    List<Information> search(SearchParam searchParam);

}
