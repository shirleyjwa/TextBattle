public class Warrior extends Hero{
    //Fields
    private double critChance;
    public Warrior(String name, String[] inventory){
        super(name, 80, 20, 10, inventory); //default health and damages
        critChance= 0.5;
    }
    //Method
    public void attack(Player enemy){
        int randomDamage= (int)(Math.random()*(maxDamage-minDamage+1)+minDamage);
        if (Math.random() >= critChance){
            System.out.println(name+" gets a critical hit!");
            System.out.println(name+" attacks "+enemy+" doing "+2*randomDamage+" damage.");
            enemy.receiveDamage(2*randomDamage);
            System.out.println(enemy+" has "+enemy.getHealth()+" health left.");
        } else {
            System.out.println(name+" attacks "+enemy+" doing "+randomDamage+" damage.");
            enemy.receiveDamage(randomDamage);
            System.out.println(enemy+" has "+enemy.getHealth()+" health left.");
        }
    }
}
