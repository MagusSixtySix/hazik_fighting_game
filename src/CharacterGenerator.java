public class CharacterGenerator {

    public static IFighter getRandomFighter(int characterNumber) {
        double classNumber = Math.random();
        if (classNumber <= 0.33) {
            return createWarrior(characterNumber + ". harcos (Warrior)");
        } else if (classNumber <= 0.66) {
            return createRanger(characterNumber + ". harcos (Ranger)");
        } else {
            return createMage(characterNumber + ". harcos (Mage)");
        }
    }

    public static IFighter getDummyFighter(){
        return new Fighter("Dummy", 0, 0, 0);
    }

    private static Warrior createWarrior(String name) {
        return  new Warrior(createFighter(name), (int) (Math.random() * 100));
    }

    private static Ranger createRanger(String name) {
        return new Ranger(createFighter(name), (int) (Math.random() * 100));
    }

    private static Mage createMage(String name) {
        return new Mage(createFighter(name), (int) (Math.random() * 10 + 5));
    }

    private static Fighter createFighter(String name){
        return new Fighter(name, (int) (100 + Math.random() * 100), (int) (Math.random() * 10 + 10),
                (int) (Math.random() * 10));
    }
}
