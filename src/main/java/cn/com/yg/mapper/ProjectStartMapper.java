package cn.com.yg.mapper;

import cn.com.yg.dto.ProjectStartDTO;
import cn.com.yg.entity.ProjectStart;
import cn.com.yg.vo.ProjectStartVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProjectStartMapper extends BaseMapper<ProjectStart> {
    List<ProjectStartVo> listByPage(@Param("page") Page<ProjectStartVo> page, @Param("vo") ProjectStartVo projectStartVo);

    List<ProjectStartDTO> listBaseInfoByPage(@Param("page") Page<ProjectStartVo> page, @Param("vo") ProjectStartVo projectStartVo);

    Integer logicDeleteByIds(List<String> ids);

    List<ProjectStartDTO> list(@Param("vo") ProjectStartVo projectStartVo);

    List<ProjectStartDTO> listWithExcel(@Param("vo") ProjectStartVo projectStartVo);

    List<ProjectStartDTO> getListByApproveState();
}