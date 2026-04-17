package net.design.strategy.impl;

import net.design.strategy.ISuperCasher;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 无优惠
 *
 * @author whn
 * @since 2026/4/17 15:49
 */
public class NormalCasher implements ISuperCasher {
    @Override
    public String getResult(BigDecimal money) {
        return money.setScale(2, RoundingMode.HALF_UP).toPlainString();
    }
}
