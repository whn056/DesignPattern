package net.design.simpleFactory.impl;

import net.design.simpleFactory.IOperation;

import java.math.BigDecimal;

/**
 * 乘
 *
 * @author whn
 * @since 2026/4/17 09:46
 */
public class MultiplyIOperation implements IOperation {

    @Override
    public String getResult(BigDecimal number1, BigDecimal number2) {
        return String.valueOf(number1.multiply(number2));
    }
}
