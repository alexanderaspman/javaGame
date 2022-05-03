package comThisManiaManiaMania;
import java.util.Scanner;
public class BossFight {
int max;
int min;
int goblinHp = 120;
int hp = 100;
    Main player = new Main();

    public BossFight(String playerWeapon) {
        this.playerWeapon = playerWeapon;
    }

    public String getPlayerWeapon() {
        return playerWeapon;
    }

    public void setPlayerWeapon(String playerWeapon) {
        this.playerWeapon = playerWeapon;
    }

    String playerWeapon;



    public BossFight(Main player) {
        this.player = player;
    }

    public Main getPlayer(NewPlayer player1) {
        return player;
    }

    public void setPlayer(Main player) {
        this.player = player;
    }

    public void attack(WorldMap obj,NewPlayer player1) {
        Scanner myScanner = new Scanner(System.in);
        String name;
        System.out.println(obj.getName());
        System.out.println(getPlayerWeapon());
getPlayerWeapon();
        int random_int=0;
        System.out.println("1. attack the goblin");
        System.out.println("2. run");


        int min = 10;
        int max = 25;
        int monsterDamege = (int) Math.floor(Math.random() * (max - min + 1) + min);
playerWeapon=getPlayerWeapon();

        hp = hp - monsterDamege;

        if (playerWeapon.equals("short sword")) {//kalkylera vad damage blir om du har short sword

            min = 16;
            max = 24;
            random_int =  (int) Math.floor(Math.random() * (max - min + 1) + min);
            goblinHp = goblinHp - random_int;


            System.out.println("Goblins hp is at " + goblinHp + " hp");
            System.out.println(getPlayer(player1)+ "'hp is "+ hp);
        } else if (playerWeapon.equals("long sword")) {//-||- long sword
            min = 40;
            max = 55;
            random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            goblinHp = goblinHp - random_int;
            System.out.println("Goblins hp is at " + goblinHp + " hp");
            System.out.println(getPlayer(player1)+ "'hp is "+ hp);
        }
        ;
        System.out.println(getPlayerWeapon());
        System.out.println("Goblins hp is at " + goblinHp + " hp");
        System.out.println(getPlayer(player1)+ "'hp is "+ hp);


        do {
            String input = myScanner.nextLine();


            switch (input) {
                case "1", "attack" -> attack(obj,player1);
                case "2" -> System.out.println();

                case "3" -> System.out.println("You cant go that way");
                case "4" -> System.out.println();
                case "5" -> System.out.println();
                case "6", "make torch" -> {
                    System.out.println();
                }


                default -> throw new IllegalStateException("Unexpected value: " + input);
            }
        } while (true);
    }



    private void  Win(){}
    private void  Dead(){}


}
