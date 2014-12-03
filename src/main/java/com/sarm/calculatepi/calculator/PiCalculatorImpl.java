/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarm.calculatepi.calculator;

import com.sarm.calculatepi.model.PiObject;
import com.sarm.calculatepi.view.bean.PiBean;
import java.math.BigDecimal;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 *
 * @author sarm
 */
@Service(value = "piCalculator")
public class PiCalculatorImpl implements PiCalculator {

    Logger logger = Logger.getLogger(PiCalculatorImpl.class);

   

    @Override
    public PiBean calculatePi(PiBean piBean) {
        logger.debug("   calculatePi ... ");

        long start = System.nanoTime();

        double sum = 0;
        for (int i = 0; i < piBean.getApproximation(); i++) {
            if (i % 2 == 0) // if the remainder of `i/2` is 0
            {
                sum = sum + (1.0 / (2.0 * i + 1));
            } else {
                sum = sum - (1.0 / (2.0 * i + 1));
            }
        }
        sum = sum * 4.0;

        piBean.setPiValue(BigDecimal.valueOf(sum));
        long end = System.nanoTime();
        logger.debug("   Sum ... " + sum);
        logger.debug("   piBean.Value ... " + piBean.getPiValue());

        logger.debug("Start of calculation  ..." + start);

        logger.debug("End of calculation  ..." + end);
        logger.debug("Total time taken  ..." + (end - start));

        return piBean;
    }

   

}
