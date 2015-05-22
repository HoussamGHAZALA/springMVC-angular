package fr.houssam.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Order(Ordered.HIGHEST_PRECEDENCE)
public class SpringContextInitializer implements WebApplicationInitializer {
    
	@Override
    public void onStartup(ServletContext servletContext) throws ServletException {
//        servletContext.setInitParameter("contextConfigLocation", "fr.houssam.config");
//        WebApplicationContext rootAppContext = new AnnotationConfigWebApplicationContext();
//        if (rootAppContext != null) {
//            servletContext.addListener(new ContextLoaderListener(rootAppContext));
//        }
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();  
        ctx.register(RestConfig.class);
        ctx.register(SpringConfig.class);
        ctx.setServletContext(servletContext);    
        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));  
        servlet.addMapping("/");  
        servlet.setLoadOnStartup(1);
    }
}