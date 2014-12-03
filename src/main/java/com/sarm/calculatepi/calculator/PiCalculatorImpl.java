/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarm.calculatepi.calculator;

import com.sarm.calculatepi.view.bean.PiBean;
import java.math.BigDecimal;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Implementation of the Service to calculate Pi
 * @author sarm
 */
@Service(value = "piCalculator")
public class PiCalculatorImpl implements PiCalculator {

    Logger logger = Logger.getLogger(PiCalculatorImpl.class);

   
/**
 * This method calculates the Pi using the Leibniz formula. 
 * Using the modulus operator it is determined which term are we at, as per the
 * formula, the fraction is added or subtracted. 
 * @param piBean
 * @return 
 */
    @Override
    public PiBean calculatePi(PiBean piBean) {
        logger.debug("   calculatePi ... ");

        double sum = 0;
        for (int i = 0; i < piBean.getApproximation(); i++) {
            if (i % 2 == 0) // if the remainder of `i/2` is 0
            {
                sum = sum + (1.0 / (2.0 * i + 1));
            } else {
                sum = sum - (1.0 / (2.0 * i + 1));
            }
        }
//        The sum is actually the value of Pi/4 so we have to multiply by 4 to
//        get Pi
        sum = sum * 4.0; 

        piBean.setPiValue(BigDecimal.valueOf(sum));

        return piBean;
    }

   

}
