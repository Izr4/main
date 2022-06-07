package keg3;

import java.util.Random;

public class Tank extends Hero implements Info
{
    double hp = 7000, def = 500, dmg = 500;
    final double upDmg = 20, upHP = 200, upDef = 15;

    public Tank(int level)
    {
        setLvl(level);
        setHp(hp);
        setDef(def);
        setDmg(dmg);

        for (int l = 1; l<level;l++)
        {
            setHp(getHp()+upHP);
            setDef(getDef()+upDef);
            setDmg(getDmg()+upDmg);
        }
    }

    @Override
    void spawnIntr()
    {
        Random r1 = new Random();
        String kata[]={"Yes I am the slowest, but I am the strongest!",
                       "step over my corpse before you go!!!",
                       "Get away from me!!",
                       "I came to step on your face!"};

        int random = r1.nextInt(kata.length);
        System.out.println("Gibby: "+kata[random]);
    }
}
