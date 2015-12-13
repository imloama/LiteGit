package litegit.sys.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 主界面
 * @author mazhaoyong@gmail.com
 */
@Controller
@RequestMapping("/")
public class IndexController {


	@RequestMapping
	@ResponseBody
    public String index(){
        System.out.println("hello,world!");
        return "hello,world!";
    }

}
