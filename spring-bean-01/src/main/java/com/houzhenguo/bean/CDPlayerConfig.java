package com.houzhenguo.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.houzhenguo") // 啥都不用干，配置这个注解就好 默认扫描同包下的 Component 注解的类
// 里面的包名不配置就是 默认 config 所在的包，配置了就扫描 配置的路径
public class CDPlayerConfig {
}
