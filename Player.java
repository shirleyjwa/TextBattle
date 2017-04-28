public class Player{
    //Fields
    protected String name;
    protected int health;
    protected int minDamage;
    protected int maxDamage;
    //Constructor
    public Player(String name, int health, int minDamage, int maxDamage){
        this.name= name;
        this.health= health;
        this.minDamage= minDamage;
        this.maxDamage= maxDamage;
    }
    //Accessors
    public String getName(String name){
        return name;
    }
    public int getHealth(){ 
        return health;
    }
    public int getMinDamage(){
        return minDamage;
    }
    public int getMaxDamage(){
        return maxDamage;
    }
    //Mutators
    public void setName(String name){
        this.name= name;
    }
    public void setHealth(int health){
        this.health= health;
    }
    public void setMinDamage(int minDamage){
        this.minDamage= minDamage;
    }
    public void setMaxDamage(int maxDamage){
        this.maxDamage= maxDamage;
    }
    //Methods
    public void receiveDamage(int damage){
        if (health>=damage){
            health= health- damage;
            System.out.println(name+" has "+health+" health left.");
        }
    }
    public void attack(Player enemy){
        int randomDamage= (int)(Math.random()*(maxDamage-minDamage+1)+ minDamage); //random amount of damage
        enemy.receiveDamage(randomDamage);
        System.out.println(name+" attacks the "+enemy+" doing "+randomDamage+" damage.");
    }
}
