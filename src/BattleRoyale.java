import java.util.ArrayList;

public class BattleRoyale {

    public static void startBattle(int numberOfInitialFighters){
        ArrayList<IFighter> fighterList = new ArrayList<>();
        generateFighters(fighterList, numberOfInitialFighters);
        battleRound(fighterList, fighterList.size());
        battleRound(fighterList, fighterList.size());
    }

    private static void generateFighters(ArrayList<IFighter> fighterList, int numberOfFighters){
        for (int i =1; i < numberOfFighters+1; i++){
            fighterList.add(CharacterGenerator.getRandomFighter(i));
        }
    }

    private static void battleRound(ArrayList<IFighter> fighterList, int numberOfFighters){
        Fight fight = new Fight();
        ArrayList<IFighter> removeList = new ArrayList<>();
        for (int i = 0; i < (numberOfFighters); i++){
            System.out.println("\nXXXXXXXXXXXX " + (i/2 + 1) + ". csata! XXXXXXXXXXXX\n");
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
}
