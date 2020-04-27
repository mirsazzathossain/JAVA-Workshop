package abstractclass.war.weapons;

public class Bomb extends Weapon {
    @Override
    public void action() {
        System.out.println("The bomb just exploded!");
    }
}
