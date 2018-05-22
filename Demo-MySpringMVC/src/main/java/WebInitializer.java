import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by lengshan on 2018/4/11 0011.
 *
 * �����Զ�����ʵ��WebApplicationInitializer�ӿڣ���дonStartup�������������spring������������Զ�����
 * AnnotationConfigWebApplicationContext��Ϊ�˼���springMVC�������ļ�
 *����dispatcherServlet ����ӳ�䷽ʽ����������
 *
 * ����spring MVC���������˼��������ļ�������dispatcherServletǰ�˿�����
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
