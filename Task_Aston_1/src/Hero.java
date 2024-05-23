abstract class Hero
{
    protected String HeroName;
    protected int HeroHealth;
    protected boolean  isDead;
    public Hero(String HeroName, int HeroHealth) {
        this.HeroName = HeroName;
        this.HeroHealth = HeroHealth;
    }

    public String getHeroName() {
        return HeroName;
    }

    abstract void attackEnemy(Enemy enemy, int damage);

}
