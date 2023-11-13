package cn.edu.szu.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("cn.edu.szu.controller")
@EnableWebMvc
public class SpringMVCConfig {
}
