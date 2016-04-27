package controllers;

import org.springframework.asm.Attribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 * Created by User on 25.04.2016.
 */

@Controller
public class MainController {

    public MainController(){
    }

    @RequestMapping (value="/shape",method = RequestMethod.GET)
    public ModelAndView main(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        //modelAndView.addObject("message", attributeValue);


        return modelAndView;

    }
}
