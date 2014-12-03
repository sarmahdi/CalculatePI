/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarm.calculatepi.calculator;

import com.sarm.calculatepi.view.bean.PiBean;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sarm
 */
public class PiCalculatorImplTest {

    public PiCalculatorImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calculateSimple method, of class PiCalculatorImpl.
     */
    @Test
    public void testCalculatePi() {
        System.out.println("calculatePi");
        PiBean piBean = new PiBean();
        piBean.setApproximation(1000000);
        PiCalculatorImpl instance = new PiCalculatorImpl();
        BigDecimal expResult = new BigDecimal(Math.PI);
        PiBean result = instance.calculatePi(piBean);
        assertEquals(expResult.setScale(5, RoundingMode.FLOOR), result.getPiValue().setScale(5, RoundingMode.FLOOR));
    }

    /**
     * Test of calculateSimple method, of class PiCalculatorImpl. This test will
     * fail as there is only one digit difference expected:<3.1415926535> but
     * was:<3.1415916535>
     */
    @Test(expected = AssertionError.class)
    public void testCalculatePiforScale10() {
        System.out.println("calculatePifor10");
        PiBean piBean = new PiBean();
        piBean.setApproximation(1000000);
        PiCalculatorImpl instance = new PiCalculatorImpl();
        BigDecimal expResult = new BigDecimal(Math.PI);
        PiBean result = instance.calculatePi(piBean);
        assertEquals(expResult.setScale(10, RoundingMode.FLOOR), result.getPiValue().setScale(10, RoundingMode.FLOOR));
    }

}
