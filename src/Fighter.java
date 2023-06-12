public class Fighter {

    private String name;
    private double healthPoints;
    private double damagePoints;
    private double speed;

    public Fighter(String name, double healthPoints, double damagePoints, double speed) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damagePoints = damagePoints;
        this.speed = speed;
    }
    public boolean isAlive(){
        return (this.getHealthPoints()>0);
    }

    public double initiative(){
        return (this.getSpeed()+(Math.random()*10));
    }

    public boolean isCrit(){
        return false;
    }

    public boolean isAvoid(){
        return false;
    }

    public boolean isShield(){
        return false;
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

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

}
