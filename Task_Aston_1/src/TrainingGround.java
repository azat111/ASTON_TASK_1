import java.util.ArrayList;
import java.util.List;

public class TrainingGround {
    public static void main(String[] args) {
        ArrayList<Hero> people = new ArrayList<Hero>();
        people.add(new Archer("Archer",10));
        people.add(new Mage("Mage",10));
        people.add(new Warrior("Warrior",10));

       // Enemy enemy=new Enemy(1000);

      //  for (Hero hero : people) {
      //      hero.attackEnemy(enemy,10);
      //  }

       // people.get(0).attackEnemy(enemy,100);
    }
}