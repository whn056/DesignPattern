package net.design.simpleFactory.impl;

import net.design.simpleFactory.IOperation;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 除
 *
 * @author whn
 * @since 2026/4/17 09:46
 */
public class DivisionIOperation implements IOperation {

    @Override
    public String getResult(BigDecimal number1, BigDecimal number2) {
        if(BigDecimal.ZERO.equals(number2)) {
            return "除数不能为0";
        }
        return String.valueOf(number1.divide(number2, 2, RoundingMode.HALF_UP));
    }
}
