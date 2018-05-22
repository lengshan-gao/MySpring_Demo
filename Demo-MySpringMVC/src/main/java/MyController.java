import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lengshan on 2018/4/11 0011.
 */
@Controller
@RequestMapping("/index1")
public class MyController {
    @RequestMapping("/index2")
    public String hello(HttpServletRequest request) {
        System.out.println(request.getParameter("username"+"!!!!!!!!!!!!!!!!!!!!!"));
        throw new IllegalArgumentException("±ß«∏£¨“≥√Ê“Ï≥£");
        //return "index";
    }
}
