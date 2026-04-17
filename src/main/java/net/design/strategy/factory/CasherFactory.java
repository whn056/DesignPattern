package net.design.strategy.factory;

import net.design.strategy.ISuperCasher;
import net.design.strategy.impl.DiscountCasher;
import net.design.strategy.impl.NormalCasher;
import net.design.strategy.impl.ReturnCasher;

import java.math.BigDecimal;

/**
 * 工厂类中创建相应策略
 *
 * @author whn
 * @since 2026/4/17 16:23
 */
public class CasherFactory {
    public static ISuperCasher createCasher(String type) throws Exception {
        return switch (type) {
            case "normal" -> new NormalCasher();
            case "discount" -> new DiscountCasher(new BigDecimal("0.8"));
            case "return" -> new ReturnCasher(new BigDecimal("0.5"), new BigDecimal("10"));
            default -> throw new Exception("类型错误");
        };
    }
}
