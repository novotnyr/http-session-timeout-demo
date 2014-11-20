package sk.upjs.ics.novotnyr.springmvc;

import org.springframework.web.servlet.support.*;

public class WebInitializer 
    extends AbstractAnnotationConfigDispatcherServletInitializer 
{
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {
                WebApplicationContext.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/*" };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }
}