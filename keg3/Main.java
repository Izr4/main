package keg3;

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        //hero 1 = Asasin
        //hero 2 = Tank
        //hero 3 = Mage

        int ronde = 0;
        int hero1, hero2;

        Random r1 = new Random();
        Asasin p1 = new Asasin(r1.nextInt(15)+1);
        Tank p2 = new Tank(r1.nextInt(15)+1);
        Mage p3 = new Mage(r1.nextInt(15)+1);

        do
        {
            hero1 = r1.nextInt(3)+1; hero2 = r1.nextInt(3)+1;

            if (hero1 == 1 && hero2 == 2 || hero1 == 2 && hero2 == 1)
            {
                p1.checkstatus("Revenant"); p2.checkstatus("Gibby");
                System.out.println("=====   The Fight Begins!   =====");
                do
                {
                    ronde++;
                    System.out.printf("\n-----    Round %d    -----\n",ronde);
                    //Assasin
                    if (p1.getStatus())
                    {
                        p1.attack("Revenant", "Gibby", p1.getDmg(), p2.getDef(), p2.getHp());
                        p2.setHp(p1.getRealdmg());

                        if (p2.getHp() <= 0)
                        {
                            p2.setStatus(false);
                        }
                    }

                    //Tank
                    if (p2.getStatus())
                    {
                        p2.attack("Gibby", "Revenant", p2.getDmg(), p1.getDef(), p1.getHp());
                        p1.setHp(p2.getRealdmg());

                        if (p1.getHp() <= 0)
                        {
                            p1.setStatus(false);
                        }
                    }
                }while (p1.getStatus() && p2.getStatus());
                System.out.println("\n-------   The fight is over!   -------");
                if (!p1.getStatus() && p2.getStatus())
                {
                    System.out.println("Revenant has lost the battle, Gibby is the Winner!");
                }
                else
                {
                    System.out.println("Gibby has lost the battle, Revenant is the Winner!");
                }
            }
            else if (hero1 == 1 && hero2 == 3 || hero1 == 3 && hero2 == 1)
            {
                p1.checkstatus("Revenant"); p3.checkstatus("Loba");
                System.out.println("=====   The Fight Begins!   =====");
                do
                {
                    ronde++;
                    System.out.printf("\n-----    Round %d    -----\n",ronde);
                    //Assasin
                    if (p1.getStatus())
                    {
                        p1.attack("Revenant","Loba" ,p1.getDmg(), p3.getDef(), p3.getHp());
                        p3.setHp(p1.getRealdmg());

                        if(p3.getHp() <= 0)
                        {
                            p3.setStatus(false);
                        }
                    }

                    //Mage
                    if (p3.getStatus())
                    {
                        p3.attack("Loba","Revenant",p3.getDmg(),p1.getDef(),p1.getHp());
                        p1.setHp(p3.getRealdmg());

                        if (p1.getHp() <= 0)
                        {
                            p1.setStatus(false);
                        }
                    }
                }while(p1.getStatus() && p3.getStatus());
                System.out.println("\n-------   The fight is over!   -------");
                if (!p1.getStatus() && p3.getStatus())
                {
                    System.out.println("Revenant has lost the battle, Loba is the Winner!");
                }
                else
                {
                    System.out.println("Loba has lost the battle, Revenant is the Winner!");
                }
            }
            else
            {
                p2.checkstatus("Gibby"); p3.checkstatus("Loba");
                System.out.println("=====   The Fight Begins!   =====");

                do
                {
                    ronde++;
                    System.out.printf("\n-----    Round %d    -----\n",ronde);

                    //Tank
                    if (p2.getStatus())
                    {
                        p2.attack("Gibby","Loba",p2.getDmg(),p3.getDef(),p3.getHp());
                        p3.setHp(p2.getRealdmg());

                        if (p3.getHp() <= 0)
                        {
                            p3.setStatus(false);
                        }
                    }

                    //Mage
                    if (p3.getStatus())
                    {
                        p3.attack("Loba","Gibby",p3.getDmg(),p2.getDef(),p2.getHp());
                        p2.setHp(p3.getRealdmg());

                        if(p2.getHp() <= 0)
                        {
                            p2.setStatus(false);
                        }
                    }
                }while (p2.getStatus() && p3.getStatus());

                System.out.println("\n-------   The fight is over!   -------");
                if (!p2.getStatus() && p3.getStatus())
                {
                    System.out.println("Gibby has lost the battle, Loba is the Winner!");
                }
                else
                {
                    System.out.println("Loba has lost the battle, Gibby is the Winner!");
                }
            }
       }while(hero1 == hero2);
    }
}
