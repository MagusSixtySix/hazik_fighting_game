public class Mage extends Fighter {

    private final double magicShieldChance = 0.35;
    private final int magicShield;

    public Mage(Fighter fighter, int magicShield){
        super(fighter.getName(), fighter.getHealthPoints(), fighter.getDamagePoints(), fighter.getSpeed());
        this.magicShield = magicShield;
    }

    private boolean isMagicShield(){
        return (this.magicShieldChance >= Math.random());
    }

    @Override
    public void takingDamage(int damage) {
        if (isMagicShield()){
            this.setHealthPoints (this.getHealthPoints() - (damage - this.getMagicShield()));
            System.out.print(this.getName() + " varázslatával részlegesen blokkolta az ütést, ezért " +
                            this.getMagicShield() + " ponttal kevesebbet sérült! ");
        } else {
        this.setHealthPoints(this.getHealthPoints() - damage);
        }
        if (this.isAlive()){
            System.out.println(this.getName() + " maradék élete: " + this.getHealthPoints());
        } else {
        System.out.println(this.getName() + " meghalt!");
        }
    }

    @Override
    public void printStats() {
        super.printStats();
        System.out.println(this.getMagicShield() + " mágikus pajzsa van.");
    }

    public int getMagicShield() {
        return magicShield;
    }
}
