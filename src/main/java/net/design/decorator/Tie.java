package net.design.decorator;

/**
 * 领带
 *
 * @author whn
 * @since 2026/4/17 17:27
 */
public class Tie extends Clothes {
    public Tie(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        System.out.print("领带 ");
    }
}
