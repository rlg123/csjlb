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
public class CsjlbApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(CsjlbApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  财税俱乐部启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "\n" +
                " _______  _______ _________ _        ______  \n" +
                "(  ____ \\(  ____ \\\\__    _/( \\      (  ___ \\ \n" +
                "| (    \\/| (    \\/   )  (  | (      | (   ) )\n" +
                "| |      | (_____    |  |  | |      | (__/ / \n" +
                "| |      (_____  )   |  |  | |      |  __ (  \n" +
                "| |            ) |   |  |  | |      | (  \\ \\ \n" +
                "| (____/\\/\\____) ||\\_)  )  | (____/\\| )___) )\n" +
                "(_______/\\_______)(____/   (_______/|/ \\___/ \n" +
                "                                             \n");
    }
}