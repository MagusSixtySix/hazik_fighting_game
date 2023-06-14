import java.util.ArrayList;
import java.util.UUID;

public class CharacterGenerator {

    public static IFighter getRandomFighter() {
        double classNumber = Math.random();
        if (classNumber <= 0.33) {
            return createWarrior( getRandomName() + " (" + getRandomID() + ") - Warrior");
        } else if (classNumber <= 0.66) {
            return createRanger( getRandomName() + " (" + getRandomID() + ") - Ranger ");
        } else {
            return createMage( getRandomName() + " (" + getRandomID() + ") - Mage ");
        }
    }

    public static IFighter getDummyFighter(){
        return new Dummy("Dummy", 0, 0, 0);
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
                (int) (Math.random() * 10 + 1));
    }

    private static String getRandomID(){
        int length = 7;
        return UUID.randomUUID().toString().substring(0, length);
    }

    private static String getRandomName(){
        ArrayList<String> names = new ArrayList<>();
        fillNameList(names);
        return names.get((int)(Math.random() * (names.size())));
    }

    private static void fillNameList(ArrayList<String> names){
        names.add("Harid");
        names.add("Ih'Mai");
        names.add("Zule");
        names.add("Merlendes");
        names.add("Rilah");
        names.add("Ponnol");
        names.add("Lua");
        names.add("Katrin");
        names.add("Norwin");
        names.add("Hellmut");
        names.add("Savana");
        names.add("Lizeth");
        names.add("Scarlet");
        names.add("Roddy");
        names.add("Garan");
        names.add("Brad");
        names.add("Ermin");
        names.add("Parkley");
        names.add("Jevon");
        names.add("Kaiya");
        names.add("Ferdinanda");
        names.add("Helma");
        names.add("Lilliana");
        names.add("Bernhardt");
        names.add("Xander");
        names.add("Albrecht");
        names.add("Yorik");
        names.add("Jacqualine");
        names.add("Gabrielle");
    }
}
