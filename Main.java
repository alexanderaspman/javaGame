package comThisManiaManiaMania;
import java.util.Scanner;




public class Main {

    Scanner myScanner = new Scanner(System.in);
    int hp = 100;
    int goblinHp = 120;

    String playerAlias ;
    public String getPlayerAlias() {
        return playerAlias;
    }

    public void setPlayerAlias(String playerAlias) {
        this.playerAlias = playerAlias;
    }

    String playerWeapon ="long sword";

    public Main(boolean wetBranch) {
        this.wetBranch = wetBranch;
    }

    public String getSalt() {
        return salt;
    }

    public Main(String playerAlias, String playerWeapon) {
        this.playerAlias = playerAlias;
        this.playerWeapon = playerWeapon;
    }

    boolean torch = false;
    boolean Salt= false;
    boolean Antifreeze= false;
    boolean Stick = false;
    boolean wetBranch = false;
    boolean Key = false;
    boolean longSword = true;
    private String salt="";
    String antifreeze;
    int min = 10;
    int max = 25;





    public Main(boolean salt, boolean antifreeze,  String antifreeze1) {
        Salt = salt;
        Antifreeze = antifreeze;

        this.antifreeze = antifreeze1;
    }

    public boolean isSalt() {
        return Salt;
    }

    public boolean isAntifreeze() {
        return Antifreeze;
    }



    public String getAntifreeze() {
        return antifreeze;
    }



    public void setAntifreeze(boolean antifreeze) {
        Antifreeze = antifreeze;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setAntifreeze(String antifreeze) {
        this.antifreeze = antifreeze;
    }

    String[] ruggsack = { };

    public Main(String pickUpItem) {
        this.pickUpItem = pickUpItem;
    }

    public Main() {

    }

    public void setPickUpItem(String pickUpItem) {
        this.pickUpItem = pickUpItem;
    }

    public String getPickUpItem() {
        return pickUpItem;
    }

    String pickUpItem;
    public void showInventory() {

    }
    public static void main(String[] args) {

        Main mainia;
        mainia = new Main();
        WorldMap Mygame = new WorldMap(""  );
        BossFight weapon = new BossFight("");
        NewPlayer player1 = new NewPlayer();
        player1.player(Mygame,weapon);
        System.out.println();
        Mygame.woodenHouse(player1,weapon);  // passa in player obj
        weapon.attack(Mygame,player1);
       // obj.inventory(player1);


        //  mainia.KingOfKings();
    //    mainia.woodenHouose();

    }


    public void attackMethod() {
        WorldMap Mygame = new WorldMap(""  );
        BossFight weapon = new BossFight("");
        NewPlayer player1 = new NewPlayer();
        weapon.attack(Mygame,player1);
    }
}