package net.design.factoryMethod.factory;

import net.design.factoryMethod.leifeng.ILeiFeng;

/**
 * 工厂方法接口
 *
 * @author whn
 * @since 2026/4/20 16:44
 */
public interface IFactory {
    ILeiFeng createLeiFeng(String name);
}
