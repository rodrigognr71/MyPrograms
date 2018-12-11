package characters;

public class Priest extends Character {
    private int heal;

    public Priest(int health, int mana, int damage, int heal) {
        super(health, mana, damage);
    }

    @Override
    public void attack(Character character) {
        character.setHealth(character.getHealth() - getDamage());
    }
}
