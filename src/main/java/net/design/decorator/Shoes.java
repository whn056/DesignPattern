package net.design.decorator;

/**
 * 鞋
 *
 * @author whn
 * @since 2026/4/17 17:29
 */
public class Shoes extends Clothes {

    public Shoes(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        System.out.print("鞋子 ");
    }
}
