public class CharacterGenerator {

    public static  <T extends Fighter> T getRandomFighter(int characterNumber){
        double classNumber = Math.random();
        if (classNumber <= 0.33){
            return (T) createWarrior("Warrior");
        } else if (classNumber <= 0.66){
            return (T) createRanger("Ranger");
        } else {
            return (T) createMage("Mage");
        }
    }
    private static Warrior createWarrior(String name){
        Warrior character = new Warrior(name, (100 + Math.random()*1000), Math.random()*100,
                Math.random()*10,Math.random()*100);
        return character;
    }

    private static Ranger createRanger(String name){
        Ranger character = new Ranger(name, (100 + Math.random()*1000), Math.random()*100,
                Math.random()*10,Math.random()*100);
        return character;
    }

    private static Mage createMage(String name){
        Mage character = new Mage (name, (100 + Math.random()*1000), Math.random()*100,
                Math.random()*10,Math.random()*100);
        return character;
    }
}
