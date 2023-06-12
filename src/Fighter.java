public class Fighter {

    private String name;
    private double healthPoints;
    private double damagePoints;

    public Fighter(String name, double healthPoints, double damagePoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damagePoints = damagePoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(double damagePoints) {
        this.damagePoints = damagePoints;
    }
}
