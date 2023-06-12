public class Warrior extends Fighter{
    private double critChance;

    public Warrior(String name, double healthPoints, double damagePoints, double critChance) {
        super(name, healthPoints, damagePoints);
        this.critChance = critChance;
    }

    public double getCritChance() {
        return critChance;
    }

    public void setCritChance(double critChance) {
        this.critChance = critChance;
    }

}
