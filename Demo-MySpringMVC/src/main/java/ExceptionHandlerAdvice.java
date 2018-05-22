import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lengshan on 2018/4/16 0016.
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {
    //@ExceptionHandler用来设置拦截条件，这里表示拦截所有的Exception
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception e, WebRequest request) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMsg", e.getMessage());
        return modelAndView;
    }
}