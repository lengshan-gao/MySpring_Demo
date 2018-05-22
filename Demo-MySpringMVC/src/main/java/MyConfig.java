import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by lengshan on 2018/4/11 0011.
 * @EnableWebMvc表示开启springMVC的一些默认配置 viewResolver是视图渲染的核心机制
 *
 * view是为了结合request、response 将视图返回给浏览器，视图可以是html、xml、json、jsp等。
 * 这里jsp位于/WEB-INF/classes/views/
 */
@Configuration
@EnableWebMvc
@ComponentScan
public class MyConfig {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //前缀
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        //后缀
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

}
