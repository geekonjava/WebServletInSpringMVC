package co.tellmehow.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends
AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
    protected Class<?>[] getRootConfigClasses () {
        return null;
    }
    
    @Override
    protected Class<?>[] getServletConfigClasses () {
        return new Class<?>[]{ApplicationWebConfig.class};
    }

    @Override
    protected String[] getServletMappings () {
        return new String[]{"/"};
    }

}
