package net.design.simpleFactory.impl;

import net.design.simpleFactory.IOperation;

import java.math.BigDecimal;

/**
 * 减
 *
 * @author whn
 * @since 2026/4/16 16:30
 */
public class MinusIOperation implements IOperation {

    @Override
    public String getResult(BigDecimal number1, BigDecimal number2) {
        return String.valueOf(number1.subtract(number2));
    }
}
