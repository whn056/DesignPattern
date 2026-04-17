package net.design.decorator;

/**
 * 穿着
 *
 * @author whn
 * @since 2026/4/17 17:20
 */
public class Clothes extends Person {
    private final Person person;

    public Clothes(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if(person != null) {
            person.show();
        }
    }
}
