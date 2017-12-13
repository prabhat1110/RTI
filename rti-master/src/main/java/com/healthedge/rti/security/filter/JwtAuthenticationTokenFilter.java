package com.healthedge.rti.security.filter;

import com.healthedge.rti.security.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtAuthenticationTokenFilter extends OncePerRequestFilter{

     @Autowired
     private JwtTokenUtil jwtTokenUtil;

     @Value("${jwt.header}")
     private String tokenHeader;


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {

        System.out.println("Inside JwtAuthenticationToken.doFilterInternal");
        final String requestHeader = request.getHeader(this.tokenHeader);

        String authToken = null;

        if (requestHeader != null && requestHeader.startsWith("Bearer ")) {
            authToken = requestHeader.substring(7);
        }else {
            //logger.warn("couldn't find bearer string, will ignore the header");
        }

//        if (SecurityContextHolder.getContext().getAuthentication() == null) {
//            // check validity of auth token
//            // set authentication true based on validity
//            Authentication authentication = new UsernamePasswordAuthenticationToken("user","password", null);
//            authentication.setAuthenticated(Boolean.TRUE);
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//        }

        chain.doFilter(request, response);

    }
}
