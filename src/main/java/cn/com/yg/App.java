package cn.com.yg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!
 *
 */
@EnableSwagger2
@SpringBootApplication
@MapperScan("cn.com.yg.mapper")
public class App 
{
    public static void main( String[] args )
    {
            SpringApplication.run(App.class, args);
    }
}
