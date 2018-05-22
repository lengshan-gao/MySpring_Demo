import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by lengshan on 2018/4/11 0011.
 *
 * 这里自定义类实现WebApplicationInitializer接口，重写onStartup方法这个方法在spring容器启动后会自动调用
 * AnnotationConfigWebApplicationContext是为了加载springMVC的配置文件
 *创建dispatcherServlet 设置映射方式和启动机制
 *
 * 启动spring MVC都在这里了加载配置文件和配置dispatcherServlet前端控制器
 */
public class WebInitializer implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(MyConfig.class);
        ctx.setServletContext(servletContext);
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
