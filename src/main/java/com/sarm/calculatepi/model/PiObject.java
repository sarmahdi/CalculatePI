/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarm.calculatepi.model;

import java.math.BigDecimal;

/**
 *
 * @author sarm
 */
public class PiObject {
    Integer approximation;
    BigDecimal piValue;

    public Integer getApproximation() {
        return approximation;
    }

    public void setApproximation(Integer approximation) {
        this.approximation = approximation;
    }

    public BigDecimal getPiValue() {
        return piValue;
    }

    public void setPiValue(BigDecimal piValue) {
        this.piValue = piValue;
    }
    
    
    
}
