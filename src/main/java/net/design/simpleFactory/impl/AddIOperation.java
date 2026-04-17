package net.design.simpleFactory.impl;

import net.design.simpleFactory.IOperation;

import java.math.BigDecimal;

/**
 * 加
 *
 * @author whn
 * @since 2026/4/16 16:29
 */
public class AddIOperation implements IOperation {

    @Override
    public String getResult(BigDecimal number1, BigDecimal number2) {
        return String.valueOf(number1.add(number2));
    }
}
