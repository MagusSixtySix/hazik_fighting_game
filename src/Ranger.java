public class Ranger extends Fighter {

    private double avoidChance;

    public Ranger(String name, double healthPoints, double damagePoints, double speed, double avoidChance) {
        super(name, healthPoints, damagePoints, speed);
        this.avoidChance = avoidChance;
    }

    public double getAvoidChance() {
        return avoidChance;
    }

    public void setAvoidChance(double avoidChance) {
        this.avoidChance = avoidChance;
    }

}
