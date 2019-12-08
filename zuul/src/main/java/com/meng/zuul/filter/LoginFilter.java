package com.meng.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.util.StringUtils;

public class LoginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        String param = requestContext.getRequest().getParameter("invokName");

        if (StringUtils.isEmpty(param)){
            requestContext.setSendZuulResponse(false);

//            requestContext.getResponse().setCharacterEncoding("UTF-8");
            requestContext.getResponse().setContentType("text/html;charset=UTF-8");
            requestContext.setResponseBody("缺少必要参数");
            System.out.println("缺少必要参数");
        }
        return null;
    }
}
