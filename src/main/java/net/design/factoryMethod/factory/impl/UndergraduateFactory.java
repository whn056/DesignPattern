package net.design.factoryMethod.factory.impl;

import net.design.factoryMethod.leifeng.ILeiFeng;
import net.design.factoryMethod.factory.IFactory;
import net.design.factoryMethod.leifeng.impl.Undergraduate;

/**
 * 工厂接口实现类
 *
 * @author whn
 * @since 2026/4/20 16:45
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public ILeiFeng createLeiFeng(String name) {
        return new Undergraduate(name);
    }
}
