package net.design.strategy;

import java.math.BigDecimal;

/**
 * 优化方式接口
 *
 * @author whn
 * @since 2026/4/17 15:46
 */
public interface ISuperCasher {

    String getResult(BigDecimal money);
}
