import javax.swing.*;

public class Domovoi extends Enemy {
    public Domovoi(int Health) {
        super(Health);
    }

    @Override
    void UniqSkill() {
        System.out.println("Domovoi has last double gamage!");
        this.giveDamage(hero,damage);
    }
}
