package com.miaowu;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@EnableAdminServer
@SpringBootApplication
public class HuniuMonitorApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(HuniuMonitorApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务服务启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "   / __                __     ( )         \n" +
                "  //   ) ) //   / / //   ) ) / / //   / / \n" +
                " //   / / //   / / //   / / / / //   / /  \n" +
                "//   / / ((___( ( //   / / / / ((___( (   \n");
    }
}
