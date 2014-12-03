/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarm.calculatepi.calculator;

import com.sarm.calculatepi.view.bean.PiBean;

/**
 * This is the interface for the Calculator Service to calculate Pi.
 * @author sarm
 */
public interface PiCalculator {
    PiBean calculatePi(PiBean piBean);
      
}
