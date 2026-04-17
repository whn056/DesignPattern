package net.design.strategy.client;

import net.design.strategy.context.CasherContext;
import net.design.strategy.impl.DiscountCasher;
import net.design.strategy.impl.NormalCasher;
import net.design.strategy.impl.ReturnCasher;

import java.math.BigDecimal;

/**
 * 策略模式
 *
 * @author whn
 * @since 2026/4/17 16:02
 */
public class StrategyClient {

    public static void main(String[] args) {
        CasherContext casherContext = new CasherContext(
                new NormalCasher());
        System.out.println(casherContext.casher().getResult(new BigDecimal("100")));

        casherContext = new CasherContext(
                new DiscountCasher(new BigDecimal("0.8")));
        System.out.println(casherContext.casher().getResult(new BigDecimal("100")));

        casherContext = new CasherContext(
                new ReturnCasher(new BigDecimal("0.5"), new BigDecimal("10")));
        System.out.println(casherContext.casher().getResult(new BigDecimal("1390")));
    }
}
