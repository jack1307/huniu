package com.miaowu;

import com.miaowu.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Hello world!
 *
 */
@EnableCustomSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HuniuFileApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(HuniuFileApplication
                .class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  文件服务启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "   / __                __     ( )         \n" +
                "  //   ) ) //   / / //   ) ) / / //   / / \n" +
                " //   / / //   / / //   / / / / //   / /  \n" +
                "//   / / ((___( ( //   / / / / ((___( (   \n");


    }
}
