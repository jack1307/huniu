package com.miaowu;

import com.miaowu.common.security.annotation.EnableCustomConfig;
import com.miaowu.common.security.annotation.EnableHnFeignClients;
import com.miaowu.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableHnFeignClients
@SpringBootApplication
public class HuniuJobApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(HuniuJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务服务启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "   / __                __     ( )         \n" +
                "  //   ) ) //   / / //   ) ) / / //   / / \n" +
                " //   / / //   / / //   / / / / //   / /  \n" +
                "//   / / ((___( ( //   / / / / ((___( (   \n");
    }
}
