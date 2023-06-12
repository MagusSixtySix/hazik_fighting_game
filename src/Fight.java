public class Fight {
    public static boolean fighting(Fighter player1, Fighter player2) {
        if (player1.isAlive() && player2.isAlive()){
            damageStep(player1, player2);
            return true;
        } return false;
    }

    private static void damageStep(Fighter player, Fighter enemy){
        if (player.getSpeed() > enemy.getSpeed()){
            player1Damage(player, enemy);
            if (enemy.isAlive()){
                player2Damage(player, enemy);
            }
        } else{
            player2Damage(player, enemy);
            if (player.isAlive()){
                player1Damage(player, enemy);
            }
        }
    }

    private static void player1Damage(Fighter player, Fighter enemy){
        enemy.setHealthPoints(enemy.getHealthPoints()-player.getDamagePoints());
        System.out.println(player.getName()+" ütött! "+enemy.getName()+" maradék élete: "+enemy.getHealthPoints());
    }
    private static void player2Damage(Fighter player, Fighter enemy){
        player.setHealthPoints(player.getHealthPoints()- enemy.getDamagePoints());
        System.out.println(enemy.getName()+" ütött! "+player.getName()+" maradék élete: "+player.getHealthPoints());
    }
}
