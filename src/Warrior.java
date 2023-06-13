public class Warrior extends Fighter{
    private static final double critMultiplier = 2;
    private double critChance;

    public Warrior(String name, double healthPoints, double damagePoints, double speed, double critChance) {
        super(name, healthPoints, damagePoints, speed);
        this.critChance = critChance;
    }

    private boolean isCrit(){
        return (this.critChance >= (Math.random()*100));
    }

    @Override
    public double dealingDamage() {
        if (isCrit()){
            System.out.println(this.getName() + " kritikusat ütött! Sebzése: " +
                    (this.getDamagePoints()*critMultiplier));
            return (this.getDamagePoints()*critMultiplier);
        }
        System.out.println(this.getName() + " ütött! Sebzése: " + this.getDamagePoints());
        return this.getDamagePoints();
    }

    public double getCritChance() {
        return critChance;
    }

    public void setCritChance(double critChance) {
        this.critChance = critChance;
    }

}
