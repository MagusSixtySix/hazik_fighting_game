public class Mage extends Fighter {

    private final double magicShieldChance = 0.35;
    private double magicShield;

    public Mage(String name, double healthPoints, double damagePoints, double speed, double magicShield) {
        super(name, healthPoints, damagePoints, speed);
        this.magicShield = magicShield;
    }

    private boolean isMagicShield(){
        return (this.magicShieldChance >= Math.random());
    }

    @Override
    public void takingDamage(double damage) {
        if (isMagicShield()){
            this.setHealthPoints(this.getHealthPoints() - (damage - this.getMagicShield()));
            System.out.println(this.getName() + " varázslatával részlegesen blokkolta az ütést, ezért " +
                            this.getMagicShield() + "-el kevesebbet sérült! Maradék élete: " + this.getHealthPoints());
            return;
        }
        this.setHealthPoints(this.getHealthPoints() - damage);
        System.out.println(this.getName() + " maradék élete: " + this.getHealthPoints());
    }

    public double getMagicShield() {
        return magicShield;
    }

    public void setMagicShield(double magicShield) {
        this.magicShield = magicShield;
    }

}
