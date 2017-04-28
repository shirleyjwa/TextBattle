public class Rogue extends Hero{
    //Field
    double secondAttackChance;
    //Constructor
    public Rogue(String name, String[] inventory){
        super(name, 70, 30, 20, inventory); //default health and damage
        secondAttackChance= 0.2;
    }
    //Method
    public void attack(Player enemy){
        int randomDamage= (int)(Math.random()*(maxDamage-minDamage+1)+minDamage);
        if (Math.random()<secondAttackChance){
            super.attack(enemy);
            System.out.println(name+" gets a double attack!");
            System.out.println(name+" attacks "+enemy+" doing "+randomDamage+" damage.");
            enemy.receiveDamage(randomDamage);
            System.out.println(enemy+" has "+enemy.getHealth()+" health left.");
        } else {
            super.attack(enemy);
        }
    }
}
