package net.design.decorator;

/**
 * todo ClassName
 *
 * @author whn
 * @since 2026/4/17 17:28
 */
public class Trousers extends Clothes {
    public Trousers(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        System.out.print("裤子 ");
    }
}
