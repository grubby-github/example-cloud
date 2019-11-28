package cn.gaoz.example;

import com.netflix.zuul.ZuulFilter;

public class TokenFilter extends ZuulFilter {
    /**
     * 过滤器类型 pre表示在请求之前进行逻辑操作
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器执行顺序
     * 当一个请求在同一个阶段存在多个过滤器的时候 过滤器的执行顺序
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否开启过滤
     */
    @Override
    public boolean shouldFilter() {
        return false;
    }

    /**
     * 编写过滤器拦截业务逻辑代码
     */
    @Override
    public Object run() {
        return null;
    }
}
