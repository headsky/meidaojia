package com.hs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
	private static String APP_CONFIG_DEFAULT = "config/ApplicationContext.xml";
	private static Application application = null;
	private ApplicationContext context;
	
	private Application() {
		context = null;
	}
	
	public static Application getApplication(){
		if ( application == null ) {
			application = new Application();
			application.context = new ClassPathXmlApplicationContext(new String[]{APP_CONFIG_DEFAULT});
		}
		return application;
	}
	
	public static ApplicationContext getApplicationContext() {
		return getApplication().getContext();
	}
	
	private ApplicationContext getContext() {
		return context;
	}
	
	public static Object getBean(String beanId){
		return getApplicationContext().getBean(beanId);
	}
	
	
}
