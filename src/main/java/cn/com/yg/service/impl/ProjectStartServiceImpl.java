package cn.com.yg.service.impl;



import cn.com.yg.common.BeanUtils;
import cn.com.yg.dto.ProjectStartDTO;
import cn.com.yg.vo.ProjectStartVo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.com.yg.entity.ProjectStart;
import cn.com.yg.mapper.ProjectStartMapper;
import cn.com.yg.service.ProjectStartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 工程启动Service
 *
 * @author ZHUANGLIBO1
 * @date 2019-11-19
 * @since 1.0
 */
@Service
public class ProjectStartServiceImpl extends ServiceImpl<ProjectStartMapper, ProjectStart>  implements ProjectStartService {
    private static final Logger logger = LoggerFactory.getLogger(ProjectStartServiceImpl.class);

    @Autowired
    ProjectStartMapper projectStartMapper;


    @Override
    public List<ProjectStartVo> listByPage(Page<ProjectStartVo> page, ProjectStartVo projectStartVo) {
        return null;
    }

    @Override
    public List<ProjectStartVo> listBaseInfoByPage(Page<ProjectStartVo> page, ProjectStartVo projectStartVo) {
        return null;
    }

    @Override
    public boolean updateProjectStart(ProjectStart projectStart) {
        return false;
    }

    @Override
    public boolean logicDeleteByIds(List<String> ids) {
        return false;
    }

    @Override
    public String getMaxProjectCode(String businessUnit) {
        return null;
    }

    @Override
    public ProjectStartDTO getProjectStartByCode(String projectCode) {
        return null;
    }

    @Override
    public List<ProjectStartVo> list(ProjectStartVo projectStartVo) {
        return BeanUtils.copy(baseMapper.list(projectStartVo), ProjectStartVo.class);

    }

    @Override
    public List<ProjectStartVo> listWithExcel(ProjectStartVo projectStartVo) {
        return null;
    }
}