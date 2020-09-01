package mybatis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import mybatis.entity.Information;
import mybatis.mapper.InfoMapper;
import mybatis.params.CommonIdVO;
import mybatis.params.InfoParam;
import mybatis.params.RestResult;
import mybatis.params.SearchParam;
import mybatis.service.InfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lp
 * @date 2020/9/1 14:32
 */

@Service
public class InfoServiceImpl extends ServiceImpl<InfoMapper, Information> implements InfoService {

    @Autowired
    InfoMapper infoMapper;

    @Override
    public RestResult<CommonIdVO> add(InfoParam infoParam) {
        Information information = new Information();
        BeanUtils.copyProperties(infoParam,information);
        infoMapper.insert(information);
        return RestResult.wrapSuccessResponse(new CommonIdVO(information.getId()));
    }

    @Override
    public List<Information> search(SearchParam searchParam) {
        LambdaQueryWrapper<Information> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.eq(Information::getDeleted,Boolean.FALSE)
                .eq(Information::getType,searchParam.getType());
       return infoMapper.selectList(queryWrapper);
    }
}
