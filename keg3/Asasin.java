package keg3;

import java.util.Random;

public class Asasin extends Hero implements Info {
    double hp = 3000, def = 300, dmg = 800 + (800 * bonusdmg);
    final double upDmg = 30, upHP = 90, upDef = 15;

    Asasin(int level)
    {
        setLvl(level);
        setHp(hp);
        setDef(def);
        setDmg(dmg);

        for (int l = 1; l < level; l++)
        {
            setHp(getHp() + upHP);
            setDef(getDef() + upDef);
            setDmg(getDmg() + upDmg);
        }
    }

    @Override
    public void spawnIntr() {
        Random r1 = new Random();
        String kata[] = {"I am behind you hahaha!!",
                         "Invisible, unheard, yet deadly!",
                         "You are so SUCK!!",
                         "I am the Strongest!! I am the Fastest!!",
                         "Just DIE!"};

        int random = r1.nextInt(kata.length);
        System.out.println("Revenant: " + kata[random]);
    }
}
