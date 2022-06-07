package keg3;

public abstract class Hero
{
    double hp, dmg, def, realdmg;
    int lvl; boolean status = true;

    void attack(String H1, String H2, Double H1_dmg, Double H2_def, Double H2_hp)
    {
        System.out.println("\n-----  "+ H1 + " Turn  -----"); spawnIntr();
        reviewdmg(H1_dmg, H2_def);
        setRealdmg(H2_hp - getRealdmg());

        if(getRealdmg() <= 0)
        {
            setRealdmg(0);
        }
        System.out.printf(H2 + " HP left: %.1f\n",getRealdmg());

    }
    void reviewdmg(double dmg, double def)
    {
        setRealdmg(dmg - def);
    }

    void checkstatus(String Hero)
    {
        System.out.println("--- "+ Hero +" ---");
        System.out.println("Level: "+getLvl());
        System.out.printf("Attack Damage: %.1f\t\tLife status: %b\nHealth Point : %.2f\t\tDefense    : %.2f\n\n",getDmg(),getStatus(),getHp(),getDef());
    }

    abstract void spawnIntr();

    public void setHp(double hp) {this.hp = hp;} public double getHp() {return hp;}
    public void setDmg(double dmg) {this.dmg = dmg;} public double getDmg() {return dmg;}
    public void setDef(double def) {this.def = def;} public double getDef() {return def;}
    public void setRealdmg(double realdmg) {this.realdmg = realdmg;} public double getRealdmg() {return realdmg;}
    public void setLvl(int lvl) {this.lvl = lvl;} public int getLvl() {return lvl;}
    public void setStatus(boolean status) {this.status = status;} public boolean getStatus() {return status;}


}
