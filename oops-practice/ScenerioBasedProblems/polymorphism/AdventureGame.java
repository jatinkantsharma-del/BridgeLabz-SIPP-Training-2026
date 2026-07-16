class GameCharacter {

    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    void performAttack() {
        System.out.println(characterName + " attacks.");
    }
}

class Warrior extends GameCharacter {

    Warrior(String name) {
        super(name);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Sword.");
    }
}

class Mage extends GameCharacter {

    Mage(String name) {
        super(name);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Magic.");
    }
}

class Archer extends GameCharacter {

    Archer(String name) {
        super(name);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Bow.");
    }
}

public class AdventureGame {

    static void startBattle(GameCharacter[] characters) {

        int warriors = 0, mages = 0, archers = 0;

        for (GameCharacter c : characters) {

            c.performAttack();   // Dynamic Method Dispatch

            if (c instanceof Warrior)
                warriors++;
            else if (c instanceof Mage)
                mages++;
            else if (c instanceof Archer)
                archers++;
        }

        System.out.println("\nWarriors : " + warriors);
        System.out.println("Mages : " + mages);
        System.out.println("Archers : " + archers);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Thor"),
                new Mage("Merlin"),
                new Archer("Robin"),
                new Warrior("Kratos")
        };

        startBattle(characters);
    }
}