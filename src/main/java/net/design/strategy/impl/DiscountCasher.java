package net.design.strategy.impl;

import net.design.strategy.ISuperCasher;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 打折
 *
 * @author whn
 * @since 2026/4/17 15:49
 */
public class DiscountCasher implements ISuperCasher {

    private final BigDecimal discount;

    public DiscountCasher(BigDecimal discount) {
        if(discount.compareTo(BigDecimal.ONE) > 0 || discount.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("折扣值必须在0-1之间");
        }
        this.discount = discount;
    }

    @Override
    public String getResult(BigDecimal money) {
        return money.multiply(this.discount).setScale(2, RoundingMode.HALF_UP).toPlainString();
    }
}
