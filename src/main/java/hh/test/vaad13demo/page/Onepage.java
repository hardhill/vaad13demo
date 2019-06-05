package hh.test.vaad13demo.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class Onepage {

    @RequestMapping("/one")
    public String PageOne(HttpServletRequest request){

        return "one";
    }
}
