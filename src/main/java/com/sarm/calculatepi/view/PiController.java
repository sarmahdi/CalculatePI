/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarm.calculatepi.view;

import com.sarm.calculatepi.calculator.PiCalculator;
import com.sarm.calculatepi.view.bean.PiBean;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sarm
 */
@Controller
public class PiController {

    Logger logger = Logger.getLogger(PiController.class);

    
    @Autowired(required = true)
    PiCalculator piCalculator;
    /**
     * This method is used incase we are not redirecting from the redirect.jsp.
     * This
     *
     * @return
     */
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String home() {
        return "/loadpiform";
    }

    /**
     * This is the main entry point for any user. The welcome-file in web.xml
     * redirect.jsp forwards the request to this handler, which publishes the
     * piapproximationform where a user can enter data. Here a piBean is 
     * initialized.
     *
     * @return
     */
    @RequestMapping(value = {"/loadpiform"}, method = RequestMethod.GET)
    public ModelAndView publishPiForm() {
        return new ModelAndView("piapproximationform", "piBean", new PiBean());
    }

    /**
     * This is where the actual work is done and Pi value is calculated. It uses 
     * the PiCalculator Service to calculate the value of Pi.
     *
     * @param piBean
     * @param model
     * @return
     */
    @RequestMapping(value = "/generatePi", method = RequestMethod.POST)
    public String calculatePi(@ModelAttribute("piBean") PiBean piBean,
            ModelMap model) {

        Integer approximation =  piBean.getApproximation();
        piCalculator.calculatePi(piBean);   
                      
        model.addAttribute("piBean", piBean);
        return "piSuccess";
                
    }

}
