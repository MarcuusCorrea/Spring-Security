package Spring_Security.config;

import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig implements WebSecurityConfigurer {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .dispatcherTypeMatchers(HttpMethod.valueOf("/")).permitAll()
                .dispatcherTypeMatchers(HttpMethod.POST, DispatcherType.valueOf("/login")).permitAll()
                .dispatcherTypeMatchers(HttpMethod.valueOf("/managers")).hasAnyRole("MANAGERS")
                .dispatcherTypeMatchers(HttpMethod.valueOf("/users")).hasAnyRole("USERS","MANAGERS")
                .anyRequest().authenticated().and().httpBasic();
    }

    @Override
    public void init(SecurityBuilder builder) throws Exception {

    }

    @Override
    public void configure(SecurityBuilder builder) throws Exception {

    }
}