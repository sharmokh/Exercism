import java.util.Random;

class DnDCharacter {

    private static final int totalRolls = 4;
    private static final int diceSides = 6;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

    public DnDCharacter() {
        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();
        hitpoints = modifier(constitution) + 10;
    }

    int ability() {
        int sum = 0; int min = diceSides;
        Random r = new Random();
        for (int i = 0; i < totalRolls; i++) {
            int n = r.nextInt(diceSides) + 1;
            sum += n;
            min = Math.min(n, min);
        }
        return sum - min;
    }

    int modifier(int input) {
        return (int) Math.floorDiv(input - 10, 2);
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHitpoints() {
        return hitpoints;
    }
}
