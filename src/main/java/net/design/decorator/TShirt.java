package net.design.decorator;

/**
 * T恤
 *
 * @author whn
 * @since 2026/4/17 17:24
 */
public class TShirt extends Clothes {
    public TShirt(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        System.out.print("T恤 ");
    }
}
