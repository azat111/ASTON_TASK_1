public class Zombie extends Enemy{
    public Zombie(int Health) {
        super(Health);
    }

    @Override
    void UniqSkill() {
        this.setHealth(100);
        System.out.println("Zombie is Alive again!");
    }
}
