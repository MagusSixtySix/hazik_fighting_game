public class Warrior extends Fighter{
    private double critChance;

    public Warrior(String name, double healthPoints, double damagePoints, double speed, double critChance) {
        super(name, healthPoints, damagePoints, speed);
        this.critChance = critChance;
    }

    @Override
    public boolean isCrit(){
        return (this.critChance>=Math.random());
    }

    public double getCritChance() {
        return critChance;
    }

    public void setCritChance(double critChance) {
        this.critChance = critChance;
    }

}
