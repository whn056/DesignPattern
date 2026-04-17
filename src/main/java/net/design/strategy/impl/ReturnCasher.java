package net.design.strategy.impl;

import net.design.strategy.ISuperCasher;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 满减
 *
 * @author whn
 * @since 2026/4/17 15:52
 */
public class ReturnCasher implements ISuperCasher {
    private final BigDecimal returnMoney;

    private final BigDecimal partitionMoney;

    public ReturnCasher(BigDecimal returnMoney, BigDecimal partitionMoney) {
        if(returnMoney.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("返现金额不能小于0");
        }
        if(returnMoney.compareTo(partitionMoney) > 0) {
            throw new RuntimeException("返现金额不能大于原始金额");
        }
        this.returnMoney = returnMoney;
        this.partitionMoney = partitionMoney;
    }


    @Override
    public String getResult(BigDecimal money) {
        return money.subtract(money.divide(partitionMoney, RoundingMode.DOWN).multiply(returnMoney))
                .setScale(2, RoundingMode.HALF_UP).toPlainString();
    }
}
