package net.design.simpleFactory;

import java.math.BigDecimal;

/**
 * 运算方式接口
 *
 * @author whn
 * @since 2026/4/16 16:25
 */
public interface IOperation {

    String getResult(BigDecimal number1, BigDecimal number2);
}
