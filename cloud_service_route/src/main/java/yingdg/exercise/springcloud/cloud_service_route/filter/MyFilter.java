package yingdg.exercise.springcloud.cloud_service_route.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yingdg on 2017/10/24.
 */
@Service
public class MyFilter extends ZuulFilter {
    private final Logger log = LoggerFactory.getLogger(MyFilter.class);

    /*
    返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型
    pre：路由之前
    routing：路由之时
    post： 路由之后
    error：发送错误调用
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /*
    过滤的顺序
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /*
    逻辑判断，是否要过滤
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /*
    过滤器的具体逻辑。可以自定义，包括查sql，nosql去判断该请求到底有没有权限访问
     */
    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));

        Object accessToken = request.getParameter("token");
        if (accessToken == null) {
            log.warn("token is empty");

            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            try {
                requestContext.getResponse().getWriter().write("token is empty");
            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }

        log.info("ok");
        return null;
    }

}
