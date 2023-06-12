public class Mage extends Fighter {
    private double magicShield;

    public Mage(String name, double healthPoints, double damagePoints, double speed, double magicShield) {
        super(name, healthPoints, damagePoints, speed);
        this.magicShield = magicShield;
    }
    public double getMagicShield() {
        return magicShield;
    }

    public void setMagicShield(double magicShield) {
        this.magicShield = magicShield;
    }

}
