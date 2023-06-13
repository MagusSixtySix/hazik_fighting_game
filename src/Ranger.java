public class Ranger extends Fighter {

    private double avoidChance;

    public Ranger(String name, double healthPoints, double damagePoints, double speed, double avoidChance) {
        super(name, healthPoints, damagePoints, speed);
        this.avoidChance = avoidChance;
    }

    private boolean isAvoid(){
        return (this.avoidChance >= (Math.random()*100));
    }

    @Override
    public void takingDamage(double damage) {
        if (isAvoid()){
            System.out.println(this.getName() + " elugrott az ütés elől! Élete " + this.getHealthPoints() + " maradt!");
            return;
        }
        this.setHealthPoints(this.getHealthPoints() - damage);
        System.out.println(this.getName() + " maradék élete: " + this.getHealthPoints());
    }

    public double getAvoidChance() {
        return avoidChance;
    }

    public void setAvoidChance(double avoidChance) {
        this.avoidChance = avoidChance;
    }

}
