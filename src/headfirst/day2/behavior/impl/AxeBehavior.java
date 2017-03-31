package headfirst.day2.behavior.impl;

import headfirst.day2.behavior.WeaponHehavior;

/**
 * Created by thunder on 2017/3/31.
 */
public class AxeBehavior implements WeaponHehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用斧头战斗");
    }
}
