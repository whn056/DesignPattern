package net.design.factoryMethod.leifeng.impl;

import net.design.factoryMethod.leifeng.ILeiFeng;

/**
 * 雷锋接口实现类-志愿者
 *
 * @author whn
 * @since 2026/4/20 16:42
 */
public record Volunteer(String name) implements ILeiFeng {

    @Override
    public void swap() {
        System.out.println("Volunteer " + name + " is swapping");
    }

    @Override
    public void wash() {
        System.out.println("Volunteer " + name + " is washing");
    }

    @Override
    public void entertain() {
        System.out.println("Volunteer " + name + " is entertaining");
    }
}
