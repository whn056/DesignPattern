package net.design.strategy.client;

import net.design.strategy.ISuperCasher;
import net.design.strategy.factory.CasherFactory;

import java.math.BigDecimal;

/**
 * 简单工厂+策略模式
 *
 * @author whn
 * @since 2026/4/17 16:32
 */
public class FactoryClient {
    public static void main(String[] args) throws Exception {

        ISuperCasher casher = CasherFactory.createCasher("normal");
        System.out.println(casher.getResult(new BigDecimal("100")));

        casher = CasherFactory.createCasher("discount");
        System.out.println(casher.getResult(new BigDecimal("100")));

        casher = CasherFactory.createCasher("return");
        System.out.println(casher.getResult(new BigDecimal("1390")));
    }
}
