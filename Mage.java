public class Mage extends Hero{
    //Field
    private int mana;
    //Constructor
    public Mage(String name, String[] inventory){
        super(name, 60, 45, 35, inventory); //default health and damages
        mana= 40;
    }
    //Methods
    public void attack(Player enemy){
        int randomDamage= (int)(Math.random()*(maxDamage-minDamage+1)+minDamage);
        if (mana<=0){
            System.out.println("Not enough mana!");
        } else {
            System.out.println(name+" has "+mana+" mana left.");
            System.out.println(name+" attacks "+enemy+" doing "+randomDamage+" damage.");
            enemy.receiveDamage(randomDamage);
            mana-=10;
            System.out.println(enemy+" has "+enemy.getHealth()+" health left.");
        }
    }
    public void useItem(int choice){
        super.useItem(choice);
        if (inventory[choice-1].equals("Mana potion")){
            mana+=30;
            System.out.println(name+" now has "+mana+" mana");
            inventory[choice-1]= "empty";
        }
    }
}
        
