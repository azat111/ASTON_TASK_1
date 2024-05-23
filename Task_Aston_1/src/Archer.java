public class Archer extends Hero{
    public Archer(String HeroName, int HeroHealth) {
        super(HeroName, HeroHealth);
    }

    @Override
     void attackEnemy(Enemy enemy,int damage) {
        System.out.println(this.HeroName + "is attack!");
        enemy.takeDamage(damage);
    }
}
