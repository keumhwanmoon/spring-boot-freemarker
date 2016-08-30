package jason.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

/**
 * @author jason, Moon
 * @since 2016. 8. 30.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Map<String, Object> model) {

        model.put("time", new Date());
        model.put("name", "Jason");
        return "index";
    }
}
