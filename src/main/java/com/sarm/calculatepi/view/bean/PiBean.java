/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarm.calculatepi.view.bean;

import java.math.BigDecimal;

/**
 * View Bean, this bean is tied to the view JSPs. This bean is used for 
 * accepting the user input as well as showuing the user the PiValue that is
 * calculated.
 * 
 * @author sarm
 */
public class PiBean {
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
