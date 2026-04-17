package net.design.decorator;

/**
 * 装扮
 *
 * @author whn
 * @since 2026/4/17 17:29
 */
public class Decorator {

    public static void main(String[] args) {
        Person person = new Person("小王");
        TShirt tShirt = new TShirt(person);
        Trousers trousers = new Trousers(tShirt);
        Tie tie = new Tie(trousers);
        Shoes shoes = new Shoes(tie);
        shoes.show();
    }
}
