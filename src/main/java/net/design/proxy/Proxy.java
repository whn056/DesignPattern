package net.design.proxy;

/**
 * 代理类
 *
 * @author whn
 * @since 2026/4/20 11:26
 */
public class Proxy implements GiveGift {
    private final Pursuer pursuer;
    private final String proxyName;

    public Proxy(Pursuer pursuer, String proxyName) {
        this.pursuer = pursuer;
        this.proxyName = proxyName;
    }

    @Override
    public void giveFlowers() {
        System.out.println(proxyName + " 替 " + pursuer.name() + " 给 " + pursuer.pursued().name() + " 送花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(proxyName + " 替 " + pursuer.name() + " 给 " + pursuer.pursued().name() + " 送巧克力");
    }

    @Override
    public void giveDolls() {
        System.out.println(proxyName + " 替 " + pursuer.name() + " 给 " + pursuer.pursued().name() + " 送洋娃娃");
    }
}
