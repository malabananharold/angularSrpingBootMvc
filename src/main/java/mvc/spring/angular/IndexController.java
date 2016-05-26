package mvc.spring.angular;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hmalabanan on 5/26/16.
 */
@Controller
public class IndexController {

    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String getIndex(){
        return "index";
    }
}
