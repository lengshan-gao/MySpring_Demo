import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lengshan on 2018/4/16 0016.
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {
    //@ExceptionHandler�����������������������ʾ�������е�Exception
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception e, WebRequest request) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMsg", e.getMessage());
        return modelAndView;
    }
}