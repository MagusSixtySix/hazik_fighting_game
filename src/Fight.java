public class Fight {
    private static final double critMultiplier = 2;

    public static boolean fighting(Fighter player1, Fighter player2) {
        if (player1.isAlive() && player2.isAlive()){
            if (player1.initiative() > player2.initiative()){
                damageStep(player1, player2);
                return true;
            } else {
                damageStep(player2, player1);
                return true;
            }
        } return false;
    }

    private static void damageStep(Fighter attacker, Fighter defender){
        if (attacker.isCrit()){
            critDamage(attacker, defender);
        } else {
            normalDamage(attacker, defender);
        }
        if (defender.isAlive()){
            if (defender.isCrit()){
                critDamage(defender, attacker);
            } else {
                normalDamage(defender, attacker);
            }
        }
    }

    private static void normalDamage(Fighter attacker, Fighter defender){
        defender.setHealthPoints(defender.getHealthPoints()-attacker.getDamagePoints());
        System.out.println(attacker.getName()+" ütött! "+defender.getName()+" maradék élete: "
                +defender.getHealthPoints());
    }

    private static void critDamage(Fighter attacker, Fighter defender){
        defender.setHealthPoints(defender.getHealthPoints()-(attacker.getDamagePoints())*critMultiplier);
        System.out.println(attacker.getName()+" kritikusat ütött! "+defender.getName()+" maradék élete: "
                +defender.getHealthPoints());
    }
}
