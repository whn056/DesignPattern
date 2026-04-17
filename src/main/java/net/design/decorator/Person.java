package net.design.decorator;

/**
 * 人
 *
 * @author whn
 * @since 2026/4/17 17:19
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {}

    public void show() {
        System.out.print("装扮的" + name + ": ");
    }
}
