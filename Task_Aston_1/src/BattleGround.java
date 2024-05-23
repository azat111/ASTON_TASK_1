import java.util.ArrayList;

public class BattleGround {
    public static void main(String[] args) {
       // Enemy enemy=new Enemy(100);
        Warrior warAzat=new Warrior("Warrior_Azat",100);
        Archer archerAzat=new Archer("Archer_Azat",100);
       // warAzat.attackEnemy(enemy,10);
       // enemy.giveDamage(warAzat,20);
       // enemy.giveDamage(warAzat,20);
      //  enemy.giveDamage(warAzat,20);
      //  enemy.giveDamage(warAzat,20);
      //  enemy.giveDamage(warAzat,20);

        Zombie zombie=new Zombie(100);
        Domovoi domovoi=new Domovoi(100);
        zombie.giveDamage(warAzat,20);
        warAzat.attackEnemy(zombie,30);
        warAzat.attackEnemy(zombie,30);
        warAzat.attackEnemy(zombie,30);
        warAzat.attackEnemy(zombie,30);
        zombie.UniqSkill();
        warAzat.attackEnemy(zombie,30);

        domovoi.giveDamage(archerAzat,20);
        domovoi.UniqSkill();

    }
}
