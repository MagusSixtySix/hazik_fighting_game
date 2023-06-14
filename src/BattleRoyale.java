import java.util.ArrayList;

public class BattleRoyale {

    public static void startBattle(int numberOfInitialFighters){
        ArrayList<IFighter> fighterList = new ArrayList<>();
        generateFighters(fighterList, numberOfInitialFighters);
        int currentRound = 1;
        while (fighterList.size() >= 2) {
            if (fighterList.size() % 2 == 0) {
                battleRound(fighterList, fighterList.size(), currentRound);
            } else {
                fighterList.add(CharacterGenerator.getDummyFighter());
                battleRound(fighterList, fighterList.size(), currentRound);
            }
            currentRound++;
        }
        printChampion(fighterList);
    }

    private static void generateFighters(ArrayList<IFighter> fighterList, int numberOfFighters){
        for (int i =1; i < numberOfFighters+1; i++){
            fighterList.add(CharacterGenerator.getRandomFighter());
        }
    }

    private static void battleRound(ArrayList<IFighter> fighterList, int numberOfFighters, int currentRound){
        Fight fight = new Fight();
        ArrayList<IFighter> removeList = new ArrayList<>();
        for (int i = 0; i < (numberOfFighters); i++){
            System.out.println("\nXXXXXXXXXXXXXXXXX " + currentRound + ". csata XXXXXXXXXXXXXXXXX");
            System.out.println("    OOOOOOOOOOOO " + (i/2 + 1) + ". párbaj OOOOOOOOOOOO\n");
            removeList.add(fight.fighting(fighterList.get(i),
                    fighterList.get(++i)));
        }
        removeLosers(fighterList, removeList);
        healVictors(fighterList);
    }
    
    private static void removeLosers(ArrayList<IFighter> fighterList, ArrayList<IFighter> removeList){
        for (IFighter fighterToRemove : removeList) {
            fighterList.remove(fighterToRemove);
        }
    }

    private static void healVictors(ArrayList<IFighter> victorList){
        for (IFighter victor : victorList) {
            victor.healDamage();
        }
    }

    private static void printChampion(ArrayList<IFighter> fighterList){
        System.out.print("\nA GYŐZTES!: ");
        fighterList.get(0).printStats();
    }
}
