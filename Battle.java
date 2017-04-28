import java.util.*;
public class Battle{
    //Main method
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Choose a name for your character: ");
        String name= input.next();
        System.out.println("Choose a class for your character(1 for warrior; 2 for rogue; 3 for mage): ");
        int classNumber= input.nextInt();
        //character creation
        Hero good= null;
        if (classNumber==1){
            String[] inventory= new String[]{"Health potion", "Damage potion", "Damage potion"};
            good= new Warrior(name, inventory);
        } else if (classNumber==2){
            String[] inventory= new String[]{"Health potion", "Damage potion", "Health potion"};
            good= new Rogue(name, inventory);
        } else if (classNumber==3){
            String[] inventory= new String[]{"Health potion", "Damage potion", "Mana potion"};
            good= new Mage(name, inventory);
        }
        //monster creation
        Player evil= null;
        double a= Math.random();
        if (a<0.25){ //four options of evil
            evil= new Player("dragon", 100, 10, 20);
        } else if (a>=0.25 && a<0.5){
            evil= new Player("dinosaur", 120, 20, 30);
        } else if (a>=0.5 && a<0.75){
            evil= new Player("bear", 50, 5, 10);
        } else if (a>=0.75 && a<1){
            evil= new Player("tiger", 80, 10, 20);
        }
        System.out.println(name+" has encountered a "+evil);
        //Battle
        int round= 1;
        while (evil.getHealth()>0 && good.getHealth()>0){
            System.out.println("++++++++++++++++++++++++++++++ ROUND "+round+"++++++++++++++++++++++++++++++");
            //Hero's turn
            good.show_inventory();
            System.out.println("Type an inventory slot number or 0 to attack: ");
            int heroNumber= input.nextInt();
            if (heroNumber==0){
                good.attack(evil);
            } else if (heroNumber==1){
                good.useItem(1);
            } else if (heroNumber==2){
                good.useItem(2);
            } else if (heroNumber==3){
                good.useItem(3);
            }
            //Monster's turn
            evil.attack(good);
            round++;
        }
        //Ending
        if (good.getHealth()==0){
            System.out.println("The "+evil+" has defeated "+good);
        } else if (evil.getHealth()==0){
            System.out.println("The "+good+" has defeated "+evil);
        }
    }
}
