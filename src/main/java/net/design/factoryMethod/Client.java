package net.design.factoryMethod;

import net.design.factoryMethod.factory.impl.UndergraduateFactory;
import net.design.factoryMethod.factory.impl.VolunteerFactory;
import net.design.factoryMethod.leifeng.ILeiFeng;

/**
 * 客户端
 *
 * @author whn
 * @since 2026/4/20 16:47
 */
public class Client {
    public static void main(String[] args) {
        ILeiFeng underGraduate = new UndergraduateFactory().createLeiFeng("Sam");
        underGraduate.swap();
        underGraduate.wash();
        underGraduate.entertain();
        System.out.println();
        ILeiFeng volunteer = new VolunteerFactory().createLeiFeng("John");
        volunteer.swap();
        volunteer.wash();
        volunteer.entertain();
    }
}
