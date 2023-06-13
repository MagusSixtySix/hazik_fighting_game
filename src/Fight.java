public class Fight {

    public static void fighting(Fighter player1, Fighter player2){
        int round = 1;
        while (Fight.battlePhase(player1, player2)){
            System.out.println(round++ + ". kör vége!");
        }
    }
    private static boolean battlePhase(Fighter player1, Fighter player2) {
        if (player1.isAlive() && player2.isAlive()){
            if (player1.initiative() > player2.initiative()){
                player2.takingDamage(player1.dealingDamage());
                if (player2.isAlive()){
                    player1.takingDamage(player2.dealingDamage());
                    return true;
                }
            } else {
                player1.takingDamage(player2.dealingDamage());
                if (player1.isAlive()){
                    player2.takingDamage(player1.dealingDamage());
                    return true;
                }
            }
        } return false;
    }
}
