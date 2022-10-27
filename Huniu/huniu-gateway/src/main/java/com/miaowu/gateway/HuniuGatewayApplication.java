package com.miaowu.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Jack
 * @date 2022年10月27日
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HuniuGatewayApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(HuniuGatewayApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  虎妞网关启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "   / __                __     ( )         \n" +
                "  //   ) ) //   / / //   ) ) / / //   / / \n" +
                " //   / / //   / / //   / / / / //   / /  \n" +
                "//   / / ((___( ( //   / / / / ((___( (   \n");
    }
}
