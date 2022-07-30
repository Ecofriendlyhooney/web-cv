package ecofriendlyhooney.webcv;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.web.bind.annotation.RestController

public class RestController {
    @GetMapping("/")
    public ModelAndView index (ModelAndView mav) {
        mav.setViewName("index.html");
        return mav;
    }

    @GetMapping("/en")
    public ModelAndView enlgish (ModelAndView mav) {
        mav.setViewName("en.html");
        return mav;
    }

    @GetMapping("/jp")
    public ModelAndView japanese (ModelAndView mav) {
        mav.setViewName("jp.html");
        return mav;
    }

    @GetMapping("/kr")
    public ModelAndView korean (ModelAndView mav) {
        mav.setViewName("kr.html");
        return mav;
    }
}
