package com.wf;



/**
 * Created by feiwei on 2017/8/7.
 */
/*@Configuration
@EnableWebSecurity*/
public class WebSecurityConfig {

    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/login","/index").permitAll()
                .anyRequest().authenticated()
                .and()
             .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
              .logout()
                .permitAll();

    }
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication().withUser("weifei").password("111111").roles("USER");
    }*/
}
