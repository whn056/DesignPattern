package net.design.strategy.context;

import net.design.strategy.ISuperCasher;

/**
 * 策略模式的上下文类
 *
 * @author whn
 * @since 2026/4/17 16:00
 */
public record CasherContext(ISuperCasher casher) {

}
