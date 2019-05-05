package com.csjlb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author csjlb
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.csjlb.*.mapper")
public class CsjlbApiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(CsjlbApiApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  财税俱乐部接口层启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " _______  _______ _________ _        ______          _______  _______ _________\n" +
                "(  ____ \\(  ____ \\\\__    _/( \\      (  ___ \\        (  ___  )(  ____ )\\__   __/\n" +
                "| (    \\/| (    \\/   )  (  | (      | (   ) )       | (   ) || (    )|   ) (   \n" +
                "| |      | (_____    |  |  | |      | (__/ /  _____ | (___) || (____)|   | |   \n" +
                "| |      (_____  )   |  |  | |      |  __ (  (_____)|  ___  ||  _____)   | |   \n" +
                "| |            ) |   |  |  | |      | (  \\ \\        | (   ) || (         | |   \n" +
                "| (____/\\/\\____) ||\\_)  )  | (____/\\| )___) )       | )   ( || )      ___) (___\n" +
                "(_______/\\_______)(____/   (_______/|/ \\___/        |/     \\||/       \\_______/\n" +
                "                                                                               ");
    }
}