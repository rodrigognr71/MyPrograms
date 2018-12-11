package characters;
import interfaces.Attack;

public abstract class Character implements Attack {
    private int health;
    private int mana;
    private int damage;

    //Constructor
   Character(int health, int mana, int damage) {
        this.health = health;
        this.mana = mana;
        this.damage = damage;
    }

    protected Character() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        int min = 0;
        int max = 200;
        this.health = (int) (Math.random() * ((max - min) + 1));
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        int min = 0;
        int max = 100;
        this.mana = (int) (Math.random() * ((max - min) + 1));
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        int min = 0;
        int max = 20;
        this.damage = (int) (Math.random() * ((max - min) + 1));
    }
}



