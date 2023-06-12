public class Mage extends Fighter {
    private double magicShield;

    public Mage(String name, double healthPoints, double damagePoints, double magicShield) {
        super(name, healthPoints, damagePoints);
        this.magicShield = magicShield;
    }

    public double getMagicShield() {
        return magicShield;
    }

    public void setMagicShield(double magicShield) {
        this.magicShield = magicShield;
    }

}
