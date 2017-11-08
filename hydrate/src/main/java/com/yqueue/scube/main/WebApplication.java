package com.yqueue.scube.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.yqueue.scube.model.DoctorsDetails;
import com.yqueue.scube.service.UserDbService;


@SpringBootApplication(scanBasePackages = { "com.yqueue.scube" })
@EnableAutoConfiguration
@PropertySources({
	@PropertySource("classpath:application.yml")
	
})
@EnableJpaRepositories(basePackages={"com.yqueue.scube.repository"})
public class WebApplication extends SpringBootServletInitializer {
	


	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebApplication.class);
    }

    public static void main(String[] args) throws Exception {
        WebApplication webapp = new WebApplication();
    	ConfigurableApplicationContext ctx =   SpringApplication.run(WebApplication.class, args);
    
  // 	ApplicationContext ctx = new AnnotationConfigApplicationContext(WebPersistentConfig.class);
      UserDbService userDbService1 = (UserDbService) ctx.getBean(UserDbService.class);

    webapp.saveDoctor(userDbService1);

    }
    
    public void saveDoctor(UserDbService userService){
    	DoctorsDetails details = new DoctorsDetails();
    	details.setDoct_name("ABC");
    	details.setDoct_qualification("ABC");
    	details.setDoct_specialization("ABC");
    	details.setDoct_experience("abc");
    	userService.save(details);
    	System.out.println("inserted");
    }
    
}
