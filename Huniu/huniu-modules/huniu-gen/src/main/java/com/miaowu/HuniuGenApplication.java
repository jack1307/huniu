package com.miaowu;

import com.miaowu.common.security.annotation.EnableCustomConfig;
import com.miaowu.common.security.annotation.EnableHnFeignClients;
import com.miaowu.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Jack
 * @date 2022年10月27日
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableHnFeignClients
@SpringBootApplication
public class HuniuGenApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(HuniuGenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  文件服务启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "   / __                __     ( )         \n" +
                "  //   ) ) //   / / //   ) ) / / //   / / \n" +
                " //   / / //   / / //   / / / / //   / /  \n" +
                "//   / / ((___( ( //   / / / / ((___( (   \n");
    }
}
