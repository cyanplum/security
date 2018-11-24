package qmw.browser;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//做security的配置
@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean//实现passwordEncoder方法将密码加密
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()//表单登录
            .and()
            .authorizeRequests()//对请求做一个授权
            .anyRequest()//任何请求
            .authenticated();//都需要身份验证
    }
}
