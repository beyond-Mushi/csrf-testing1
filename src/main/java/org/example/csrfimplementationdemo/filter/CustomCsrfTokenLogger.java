package org.example.csrfimplementationdemo.filter;

import jakarta.servlet.*;
import org.springframework.security.web.csrf.CsrfToken;


import java.io.IOException;
import java.util.logging.Logger;

public class CustomCsrfTokenLogger implements Filter {

    private Logger logger = Logger
            .getLogger(CustomCsrfTokenLogger.class.getName());

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        CsrfToken token = (CsrfToken) servletRequest.getAttribute("_csrf");
        logger.info("Csrf Token :::: "+token.getToken());

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
