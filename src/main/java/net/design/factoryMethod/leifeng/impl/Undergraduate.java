package net.design.factoryMethod.leifeng.impl;

import net.design.factoryMethod.leifeng.ILeiFeng;

/**
 * 雷锋接口实现类-本科生
 *
 * @author whn
 * @since 2026/4/20 16:41
 */
public record Undergraduate(String name) implements ILeiFeng {
    @Override
    public void swap() {
        System.out.println("Undergraduate " + name + " is swapping");
    }

    @Override
    public void wash() {
        System.out.println("Undergraduate " + name + " is washing");
    }

    @Override
    public void entertain() {
        System.out.println("Undergraduate " + name + " is entertaining");
    }
}
