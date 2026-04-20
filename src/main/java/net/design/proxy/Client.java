package net.design.proxy;

/**
 * 客户端
 *
 * @author whn
 * @since 2026/4/20 11:30
 */
public class Client {

    public static void main(String[] args) {
        Pursued pursued = new Pursued("小王");
        Pursuer pursuer = new Pursuer("张三", pursued);
        Proxy proxy = new Proxy(pursuer, "李四");

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
