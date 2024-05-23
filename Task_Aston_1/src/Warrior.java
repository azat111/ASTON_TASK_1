public class Warrior extends Hero{
    public Warrior(String HeroName, int HeroHealth) {
        super(HeroName, HeroHealth);
    }

    @Override
     void attackEnemy(Enemy enemy,int damage) {
        System.out.println(this.HeroName + "is attack!");
        enemy.takeDamage(damage);
    }
}
