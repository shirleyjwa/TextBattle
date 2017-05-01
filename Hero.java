public class Hero extends Player{
    //Field
    protected String[] inventory;
    //Constructor
    public Hero(String name, int health, int minDamage, int maxDamage, String[] inventory){
        super(name, health, minDamage, maxDamage);
        this.inventory= inventory;
    }
    //Methods
    public void useItem(int choice){
        if (inventory[choice-1].equals("Health potion")){
            int newHealth= super.getHealth()+20;
            super.setHealth(newHealth);
            System.out.println(name+" now has "+newHealth+" health");
            inventory[choice-1]= "empty";
        } else if (inventory[choice-1].equals("Damage potion")){
            int newMaxDamage= super.getMaxDamage()+10;
            super.setMaxDamage(newMaxDamage);
            System.out.println(name+" can do more damage.");
            inventory[choice-1]= "empty";
        } else if (inventory[choice-1].equals("empty")){
            System.out.println("That inventory slot is empty!");
        } else if (choice < 1 || choice > 3){ //slots that do not exist
            throw new IndexOutOfBoundsException();            
        }
    }
    public void show_inventory(){
        System.out.println("Your inventory holds: 1. "+inventory[0]+"; 2. "+inventory[1]+"; 3. "+inventory[2]+";");
    }
}
