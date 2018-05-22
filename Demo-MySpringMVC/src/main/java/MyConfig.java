import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by lengshan on 2018/4/11 0011.
 * @EnableWebMvc��ʾ����springMVC��һЩĬ������ viewResolver����ͼ��Ⱦ�ĺ��Ļ���
 *
 * view��Ϊ�˽��request��response ����ͼ���ظ����������ͼ������html��xml��json��jsp�ȡ�
 * ����jspλ��/WEB-INF/classes/views/
 */
@Configuration
@EnableWebMvc
@ComponentScan
public class MyConfig {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //ǰ׺
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        //��׺
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

}
