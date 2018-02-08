package br.com.cinq.spring.data.sample;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Greeting Service.
 */
@SpringBootApplication
@ComponentScan(basePackages = { "br.com.cinq.spring.data.sample" })
@EntityScan(basePackages = { "br.com.cinq.spring.data.sample.entity" })
@EnableJpaRepositories("br.com.cinq.spring.data.sample.repository")
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String[] args) {
		new Application().configure(new SpringApplicationBuilder(Application.class)).run(args);
	}

	@Bean
	public DispatcherServlet dispatcherServlet() {
		return new DispatcherServlet();
	}

	@Bean
	public ServletRegistrationBean dispatcherServletRegistration() {
		ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet(), "rest/*");
		registration.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
		return registration;
	}

//	@Bean
//	public RepositoryRestConfigurer repositoryRestConfigurer() {
//		return new RepositoryRestConfigurerAdapter() {
//
//			@Override
//			public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//				config.setBasePath("/api");
//			}
//		};
//	}
}
