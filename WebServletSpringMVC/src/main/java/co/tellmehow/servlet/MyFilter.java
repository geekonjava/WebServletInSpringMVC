package co.tellmehow.servlet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "myFilter", urlPatterns = "/*")
public class MyFilter implements Filter {
    
    @Override
    public void init (FilterConfig filterConfig) throws ServletException {
    }
    
    @Override
    public void doFilter (ServletRequest request, ServletResponse response,
                          FilterChain chain)
              throws IOException, ServletException {
        System.out.println("-- In MyFilter --");
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("URI: " + req.getRequestURI());
        chain.doFilter(request, response);
    }
    
    @Override
    public void destroy () {
    }
}