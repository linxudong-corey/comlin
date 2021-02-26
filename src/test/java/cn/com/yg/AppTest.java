package cn.com.yg;

import static org.junit.Assert.assertTrue;

import cn.com.yg.service.ProjectStartService;
import cn.com.yg.vo.ProjectStartVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Unit test for simple App.
 */
@RunWith(value = SpringRunner.class)
@SpringBootTest(classes = {App.class})// 指定启动类
@Slf4j
public class AppTest 
{
    @Autowired
    ProjectStartService projectStartService;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("进入查询");
        ProjectStartVo projectStartVo = new ProjectStartVo();
        projectStartVo.setProjectName("太原0320test施工总承包工程");
        List<ProjectStartVo> list = projectStartService.list(projectStartVo);
        System.out.println(list.size());
        assertTrue( true );
    }
}
