package headfirst.day1.behavior.fly.impl;

import headfirst.day1.behavior.FlyBehavior;

/**
 * Created by thunder on 2017/3/30.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i am fly with rocket");
    }
}
