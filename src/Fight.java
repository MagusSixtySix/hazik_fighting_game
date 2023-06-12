public class Fight {
    private static double critMultiplier = 2;

    public static boolean fighting(Fighter player1, Fighter player2) {
        if (player1.isAlive() && player2.isAlive()){
            if (player1.getSpeed() > player2.getSpeed()){
                if (player1.isCrit()){
                    critDamage(player1, player2);
                } else {
                    damageStep(player1, player2);
                }
                if (player2.isAlive()){
                    if (player2.isCrit()){
                        critDamage(player2, player1);
                        return true;
                    } else {
                        damageStep(player2, player1);
                        return true;
                    }
                }
            } else {
                if (player2.isCrit()){
                    critDamage(player2, player1);
                } else {
                    damageStep(player2, player1);
                }
                if (player2.isAlive()){
                    if (player2.isCrit()){
                        critDamage(player1, player2);
                        return true;
                    } else {
                        damageStep(player1, player2);
                        return true;
                    }
                }
            }
        } return false;
    }

    private static void damageStep(Fighter hero, Fighter enemy){
        enemy.setHealthPoints(enemy.getHealthPoints()-hero.getDamagePoints());
        System.out.println(hero.getName()+" ütött! "+enemy.getName()+" maradék élete: "+enemy.getHealthPoints());
    }

    private static void critDamage(Fighter hero, Fighter enemy){
        enemy.setHealthPoints(enemy.getHealthPoints()-(hero.getDamagePoints())*critMultiplier);
        System.out.println(hero.getName()+" kritikusat ütött! "+enemy.getName()+" maradék élete: "
                +enemy.getHealthPoints());
    }
}
