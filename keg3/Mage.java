package keg3;

import java.util.Random;

public class Mage extends Hero implements Info {
    double hp = 2500, def = 200, dmg = 700 + (700 * magicdmgbonus);
    final double upDmg = 30, upHP = 90, upDef = 15;

    Mage(int level) {
        setLvl(level);
        setHp(hp);
        setDef(def);
        setDmg(dmg);

        for (int l = 1; l < level; l++) {
            setHp(getHp() + upHP);
            setDef(getDef() + upDef);
            setDmg(getDmg() + upDmg);
        }
    }

    @Override
    void spawnIntr()
    {
        Random r1 = new Random();
        String kata[]={"My attack is invisible!",
                       "My magic won't miss!",
                       "I will curse you!",
                       "You can't come in front of me!"};

        int random = r1.nextInt(kata.length);
        System.out.println("Loba: "+kata[random]);

    }
}
