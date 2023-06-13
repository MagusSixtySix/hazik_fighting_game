public class Fighter {

    private String name;
    private int healthPoints;
    private int damagePoints;
    private int speed;

    public Fighter(String name, int healthPoints, int damagePoints, int speed) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damagePoints = damagePoints;
        this.speed = speed;
    }
    public boolean isAlive(){
        return (this.getHealthPoints() > 0);
    }

    public int initiative(){
        return (int) (this.getSpeed() + (Math.random() * 10));
    }

    public void takingDamage(int damage){
        this.setHealthPoints(this.getHealthPoints() - damage);
        if (this.isAlive()){
            this.printHealtPoints();
        } else {
            this.printDead();
        }
    }

    public int dealingDamage(){
        System.out.println(this.getName() + " ütött! Sebzése: " + this.getDamagePoints());
        return this.getDamagePoints();
    }

    public void printHealtPoints(){
        System.out.println(this.getName() + " maradék élete: " + this.getHealthPoints());
    }

    public void printDead(){
        System.out.println(this.getName() + " meghalt!");
    }

    public void printStats(){
        System.out.print(this.getName() + " egy " + this.getClass().getSimpleName() + " akinek " +
                this.getHealthPoints() + " élete, " + this.getDamagePoints() + " sebzése, " +
                this.getSpeed() + " gyorsasága, ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
