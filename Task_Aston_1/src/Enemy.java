public abstract class Enemy implements Mortal {
    private int Health;
    protected int damage;
    Hero hero;
    public Enemy(int Health) {
        this.Health = Health;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public void takeDamage(int damage) {
        Health -= damage;
        System.out.println("Damage is taken! Enemy's health is "+ Health);
    }

    public void giveDamage(Hero hero,int damage) {
        this.damage = damage;
        this.hero = hero;
        if(!hero.isDead)
        {
            hero.HeroHealth -= damage;
            System.out.println("Enemy attack hero" + hero.getHeroName() + "," + " hero health is "+ hero.HeroHealth);
            if (hero.HeroHealth <= 0){
                System.out.println(hero.getHeroName() + " died!");
                hero.isDead = true;
            }
        }
        else{
            System.out.println(hero.getHeroName() + "already die");
        }
    }

    @Override
    public boolean isAlive() {
        if (Health > 0)
            return true;

        return false;
    }

    abstract void UniqSkill();
}
