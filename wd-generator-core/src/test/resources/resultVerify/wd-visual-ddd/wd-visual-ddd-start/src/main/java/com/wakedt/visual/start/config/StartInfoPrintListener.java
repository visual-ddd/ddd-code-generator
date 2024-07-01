package com.wakedt.visual.start.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/***
 * 启动信息打印配置
 *
 * @author visual-ddd
 * @version 1.0
 */
@Slf4j
@Component
@Scope("singleton")
public class StartInfoPrintListener implements ApplicationRunner {

    @Resource
    private Environment environment;

    @Override
    public void run(ApplicationArguments args) {
        String ip = getIpAddress();
        String port = environment.getProperty("local.server.port");
        String contextPath = environment.getProperty("server.servlet.context-path");
        String externalUrl = String.format("http://%s:%s%s", ip, port, contextPath);
        String localUrl = String.format("http://localhost:%s%s", port, contextPath);
        String localSwaggerDocUrl = String.format("%s/doc.html", localUrl);
        String swaggerDocUrl = String.format("%s/doc.html", externalUrl);

        System.out.println("===========================================================");
        System.out.println("\tApplication Demo is running! Access URLs:");
        System.out.println("\t本地访问地址: \t" + localUrl);
        System.out.println("\t外部访问地址: \t" + externalUrl);
        System.out.println("\t本地Swagger文档: \t" + localSwaggerDocUrl);
        System.out.println("\t外部Swagger文档: \t" + swaggerDocUrl);
        System.out.println("===========================================================");
    }

    /**
     * 从网卡中获取IP
     *
     * @return 本机ip地址
     */
    public static String getIpAddress() {
        try {
            // 从网卡中获取IP
            Enumeration<NetworkInterface> allNetInterfaces = NetworkInterface.getNetworkInterfaces();
            InetAddress ip;
            while (allNetInterfaces.hasMoreElements()) {
                NetworkInterface netInterface = allNetInterfaces.nextElement();
                // 用于排除回送接口,非虚拟网卡,未在使用中的网络接口
                if (!netInterface.isLoopback() && !netInterface.isVirtual() && netInterface.isUp()) {
                    // 返回和网络接口绑定的所有IP地址
                    Enumeration<InetAddress> addresses = netInterface.getInetAddresses();
                    while (addresses.hasMoreElements()) {
                        ip = addresses.nextElement();
                        if (ip instanceof Inet4Address) {
                            return ip.getHostAddress();
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("IP地址获取失败" + e);
        }
        return "";
    }
}