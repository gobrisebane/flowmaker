package com.twepo.flowmaker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;

import javax.sql.DataSource;
/*


@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	
	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
	      .dataSource(dataSource)
	      .passwordEncoder(passwordEncoder())
	      .usersByUsernameQuery(" SELECT id, passwd, user_status "
	        + " FROM (	SELECT	admin_id AS id ,passwd AS passwd  ,user_status AS user_status "
	        + " FROM	tblmanager WHERE	user_status =  true "
	        + " UNION ALL SELECT	partner_user_id AS id ,partner_user_passwd AS passwd ,status AS user_status "
	        + " FROM	site_manager WHERE	STATUS = 'Y' ) t1 "
	        + " WHERE	t1.id = ? ")
	      .authoritiesByUsernameQuery(" SELECT id, user_role "
	  	        + " FROM (	SELECT	admin_id AS id ,user_role "
		        + " FROM	tblmanager WHERE	user_status =  true "
		        + " UNION ALL SELECT	partner_user_id AS id ,'ROLE_USER' as user_role "
		        + " FROM	site_manager WHERE	STATUS = 'Y' ) t1 "
		        + " WHERE	t1.id = ? ");
	}
	
	@Bean
    public SpringSecurityDialect springSecurityDialect(){
        return new SpringSecurityDialect();
    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		String[] staticResources  =  {
	        "/css/**",
	        "/img/**",
	        "/fonts/**",
	        "/js/**",
	        "/static/**",
	    };
		
		http.authorizeRequests()
			.antMatchers("/v2/api-docs",
		            "/swagger-resources",
		            "/swagger-resources/**",
		            "/configuration/ui",
		            "/configuration/security",
		            "/swagger-ui.html",
		            "/webjars/**",
		            // -- Swagger UI v3 (OpenAPI)
		            "/v3/api-docs/**",
		            "/swagger-ui/**").permitAll()
			.antMatchers(staticResources).permitAll()
			.antMatchers("/**").authenticated()
		.and()
			.formLogin()
            .loginPage("/account/login")
			.usernameParameter("userId")
			.passwordParameter("userPasswd")
			.loginProcessingUrl("/account/loginProcess")
			.successHandler(new LoginSuccessHandler())
			.permitAll()
		.and()
			.logout()
	           .logoutRequestMatcher(new AntPathRequestMatcher("/account/logout"))
	           .logoutSuccessUrl("/")
	           .invalidateHttpSession(true) // set invalidation state when logout
	           .deleteCookies("JSESSIONID")
		;
//			.logout().permitAll().logoutSuccessUrl("/");
	}
	
	@Bean
	public static PasswordEncoder passwordEncoder() {
		return new  BCryptPasswordEncoder();
//		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
	    return super.userDetailsService();
	}

	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)
	  throws Exception {
	    auth.jdbcAuthentication()
	      .dataSource(dataSource)
	      .passwordEncoder(passwordEncoder())
	      .usersByUsernameQuery("select user_id,user_passwd "
	        + "from tl_member "
	        + "where user_id = ?")
	      .authoritiesByUsernameQuery("select user_id,user_passwd "
	        + "from tl_member "
	        + "where user_id = ?");
	}
 
 
}
*/



@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests().antMatchers("/").permitAll();
	}
	
}