public class Fight {

    public static void fighting(Fighter player1, Fighter player2){
        int round = 1;
        player1.printStats();
        player2.printStats();
        while (Fight.battlePhase(player1, player2)){
            System.out.println("------------ " + round++ + ". kör vége! ------------");
        }
        if (player1.isAlive()){
            printVictor(player1);
        } else {
            printVictor(player2);
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

    private static void printVictor(Fighter player){
        System.out.println(player.getName() + " nyerte a küzdelmet! " + player.getHealthPoints() + " élete maradt!");
    }
}
