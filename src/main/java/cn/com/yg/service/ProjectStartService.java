package cn.com.yg.service;

import cn.com.yg.dto.ProjectStartDTO;
import cn.com.yg.entity.ProjectStart;
import cn.com.yg.vo.ProjectStartVo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 工程启动Service Interface
 *
 * @author ZHUANGLIBO1
 * @date 2019-11-19
 * @since 1.0
 */
public interface ProjectStartService extends IService<ProjectStart> {
    /**
     * 分页列表查询
     * @param page 分页对象
     * @param projectStartVo  项目启动Vo
     * @return java.util.List<com.estate.crlb.api.project.ProjectStartVo>
     * @author ZHUANGLIBO1
     * @date 2019/11/21 14:20
     * @since 1.0
     */
    List<ProjectStartVo> listByPage(Page<ProjectStartVo> page, ProjectStartVo projectStartVo);
    /**
     * 分页列表查询
     * @param page 分页对象
     * @param projectStartVo  项目启动Vo
     * @return java.util.List<com.estate.crlb.api.project.ProjectStartVo>
     * @author ZHUANGLIBO1
     * @date 2019/11/21 14:20
     * @since 1.0
     */
    List<ProjectStartVo> listBaseInfoByPage(Page<ProjectStartVo> page, ProjectStartVo projectStartVo);
    /**
     * 更新
     * @param projectStart  项目启动Entity
     * @return boolean
     * @author ZHUANGLIBO1
     * @date 2019/11/21 14:26
     * @since 1.0
     */
    boolean updateProjectStart(ProjectStart projectStart);
    /**
     * 逻辑删除
     * @param ids  项目启动ID
     * @return boolean
     * @author ZHUANGLIBO1
     * @date 2019/11/21 14:38
     * @since 1.0
     */
    boolean logicDeleteByIds(List<String> ids);
    /**
     * 根据业务单位查询出最大的项目编码
     * @param businessUnit  业务单位
     * @return ProjectStartDTO
     * @author linxudong
     * @date 2019/11/26 14:26
     * @since 1.0
     */
    String getMaxProjectCode(String businessUnit);

    /**
     * 根据项目编码获取数据库存在的项目编码数据
     * @param projectCode  项目编码
     * @return ProjectStartDTO
     * @author linxudong
     * @date 2019/11/26 14:26
     * @since 1.0
     */
    ProjectStartDTO getProjectStartByCode(String projectCode);

    /**
     * 查询列表
     * @param projectStartVo
     * @return java.util.List<ProjectStartVo>
     * @author linxudong
     * @date 2019/11/27 15:57
     * @since 1.0
     */
    List<ProjectStartVo> list(ProjectStartVo projectStartVo);

    /**
     * 查询列表
     * @param projectStartVo
     * @return java.util.List<ProjectStartVo>
     * @author linxudong
     * @date 2019/11/27 15:57
     * @since 1.0
     */
    List<ProjectStartVo> listWithExcel(ProjectStartVo projectStartVo);

}