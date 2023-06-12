public class Ranger extends Fighter {

    private double avoidChance;

    public Ranger(String name, double healthPoints, double damagePoints, double avoidChance) {
        super(name, healthPoints, damagePoints);
        this.avoidChance = avoidChance;
    }

    public double getAvoidChance() {
        return avoidChance;
    }

    public void setAvoidChance(double avoidChance) {
        this.avoidChance = avoidChance;
    }

}
