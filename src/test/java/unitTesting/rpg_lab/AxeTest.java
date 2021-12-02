package unitTesting.rpg_lab;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {

    @Test
    public void testWeaponLosesDurabilityAfterAttack() {
        //arrange
        Axe axe = new Axe(10, 10);
        Dummy dummy = new Dummy(100, 100);

        axe.attack(dummy);

        //Assert

        Assert.assertEquals(9, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testAxeIfCanAttackWithDurabilityBelowZero() {
        Axe axe = new Axe(1, 0);
        Dummy dummy = new Dummy(10, 10);

        axe.attack(dummy);

    }


}