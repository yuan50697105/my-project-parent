package org.myproject.boot.webview;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-boot-commons-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-03 00:16
 */
@SpringBootConfiguration
@ComponentScan(basePackageClasses = WebViewConfiguration.class)
public class WebViewConfiguration {
}