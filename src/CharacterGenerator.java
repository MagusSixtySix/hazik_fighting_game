public class CharacterGenerator {

    public static  <T extends Fighter> T getRandomFighter(int characterNumber){
        double classNumber = Math.random();
        if (classNumber <= 0.33){
            return (T) createWarrior(String.valueOf(characterNumber) + ". harcos (Warrior)");
        } else if (classNumber <= 0.66){
            return (T) createRanger(String.valueOf(characterNumber) + ". harcos (Ranger)");
        } else {
            return (T) createMage(String.valueOf(characterNumber) + ". harcos (Mage)");
        }
    }
    private static Warrior createWarrior(String name){
        Warrior character = new Warrior(name, (int)(100 + Math.random()*1000), (int) (Math.random()*100),
                (int) (Math.random()*10), (int) (Math.random()*100));
        return character;
    }

    private static Ranger createRanger(String name){
        Ranger character = new Ranger(name, (int) (100 + Math.random()*1000), (int) (Math.random()*100),
                (int) (Math.random()*10), (int) (Math.random()*100));
        return character;
    }

    private static Mage createMage(String name){
        Mage character = new Mage (name, (int) (100 + Math.random()*1000), (int) (Math.random()*100),
                (int) (Math.random()*10), (int) (Math.random()*100));
        return character;
    }
}
