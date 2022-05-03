package comThisManiaManiaMania;
import java.util.Scanner;



public class WorldMap {

    int hp = 100;
    int goblinHp = 120;
    int min = 10;
    int max = 25;
    String animalSays;

    public WorldMap(int myMonney,String animalSays) {
        this.myMonney = myMonney;
        this.animalSays = animalSays;
    }
public String getAnimalSays(){
        return animalSays;
}
public  void setAnimalSays(String animalSays){
        this.animalSays = animalSays;
}
    public int getMyMonney() {
        return myMonney;
    }

    public void setMyMonney(int myMonney) {
        this.myMonney = myMonney;
    }

    int myMonney;

    public class SetmyMonney implements money {

        public SetmyMonney(int myMonney) {
            this.myMonney = myMonney;
        }

        public int getMyMonney() {
            return myMonney;
        }

        public void setMyMonney(int myMonney) {
            this.myMonney = myMonney;
        }

        int myMonney;

        @Override
        public void myMonneyBitch() {
            setMyMonney(100);
        }

        ;

    }

    public class SetMyMoney implements  money {

        public SetMyMoney(int myMonney) {
            this.myMonney = myMonney;
        }

        public int getMyMoney() {
            return myMonney;
        }

        public void setMyMoney(int myMonney) {
            this.myMonney = myMonney;
        }

        int myMonney = 100;

        @Override
        public void myMonneyBitch() {
            setMyMonney(5000);System.out.println(myMonney);
        }

        ;

    }
    public class dogSound implements Store {
        public dogSound(String animalSays) {
            this.animalSays = animalSays;
        }

        public String getAnimalSays() {
            return animalSays;
        }

        public void setAnimalSays(String animalSays) {
            this.animalSays = animalSays;
        }

        String animalSays;
        @Override
        public void animalSound() {
            System.out.println(animalSays="No dog say's qwack qwack");
        }
    }
    public class duckSays implements Store {
        public duckSays(String animalSays) {
            this.animalSays = animalSays;
        }

        public String getAnimalSays() {
            return animalSays;
        }

        public void setAnimalSays(String animalSays) {
            this.animalSays = animalSays;
        }

        String animalSays;
        @Override
        public void animalSound() {
            System.out.println(animalSays="No duck say's muuuuuuuuu");
        }
    }
    public void Start() {
        SetmyMonney money2 = new SetmyMonney(0);
        SetMyMoney money3 = new SetMyMoney(0);
        String choise= myScanner.nextLine();
        System.out.println("choose 1. for 100 money and 2 for 5000 money");
        System.out.println("3. for 200000");

        do {
            switch (choise) {

                case "2" -> money2.myMonneyBitch();

                case "3" -> money3.myMonneyBitch();


            }
        }while (true);



    }

    public void Inventory(BossFight weapon) {
        System.out.println("Name: " + getName());
        System.out.println("Inventory:");
        if (Salt) {
            System.out.println("Salt");
        }
        if (game.Antifreeze) {
            System.out.println("Antifreeze");
        }
        if (game.Stick) {
            System.out.println("Stick");
        }
        if (game.wetBranch) {
            System.out.println("Moist branch");
        }
        if (game.Key) {
            System.out.println("Key");
        }
        if (game.torch) {
            System.out.println("Torch");
        }
        System.out.println("you have a "+ getWeapon());
        System.out.println();

    }


    Main game = new Main();
    boolean Salt = game.Salt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorldMap(String name) {
        this.name = name;
    }

    String name;


    Scanner myScanner = new Scanner(System.in);
    String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void checkMoney() {
        myMonney = getMyMonney();

        System.out.println(myMonney);
    }

    public void woodenHouse(NewPlayer player1, BossFight weapon) {

        setMyMonney(10000);
        game.torch=true;
        setWeapon("short sword");
        System.out.println(weapon.playerWeapon);
        System.out.println(myMonney);
        System.out.println("\n....................................................\n");
        System.out.println("Your name is " + getName());
        System.out.println("you se a wooden house");
        System.out.println("The door is on a jar, but you peek and its very dark inside");
        System.out.println("Its very strange you hear no sound, just the trees crackling in the wind");
        System.out.println("1. Go in side the House");
        System.out.println("2. Go east");
        System.out.println("3. Go in side the forest");
        System.out.println("4. Go west");


        System.out.println("\n....................................................\n");
        do {
            String input = myScanner.nextLine();
            dogSound dog = new dogSound("");
            duckSays duck = new duckSays("");
            switch (input) {
                case "1", "go inside" -> insideHouse(player1, weapon);
                case "2" -> leftNookOfHouse(player1, weapon);

                case "3" -> System.out.println("You cant go that way");
                case "4" -> eastSideOfHouse(player1, weapon);
                case "5" -> game.attackMethod();
                case "6", "make torch" -> {
                    if (
                            game.Antifreeze = true && game.Salt == true) {//tittar att ifall du plockat upp 2 av de ämnen du behöver utan den tredje ger dig den en ledtråd vad du behöver
                        System.out.println("that could be dangerous, you could start a fire");
                    }

                }
                case "inventory","items" -> Inventory(weapon);

                case "f" -> fight(player1, weapon);
                case "inv" -> checkMoney();
                case "s" -> Start();
                case "store" -> Store();
                case "duck says qwack qwack" -> duck.animalSound();
                case "dog says woff woff" -> dog.animalSound();



            }
        } while (true);


    }

    //where are we inside the house stupid vi är alltså i huset
    public void insideHouse(NewPlayer player1, BossFight weapon) {
        System.out.println("\n....................................................\n");
        if (game.torch = false) {
            System.out.println("You cant see");//tittar så att du craftat en fackla, genom att titta ifall torch är true. om inte så ser du inget
            System.out.println("1.  Go outside");
        }
        else{
            System.out.println("with the torch you can now see clearly");
            System.out.println("you see a big rug");
        }


        System.out.println("\n....................................................\n");


        String input = myScanner.nextLine();


        switch (input) {
            case "1" -> woodenHouse(player1, weapon);
            case "move rug" -> finalChapter(player1,weapon);
            case "inventory","items" -> Inventory(weapon);

            case "3" -> System.out.println("You cant go that way");
            case "4" -> System.out.println("You cant go that way");

        }
    }

    //left side off house

    public void leftNookOfHouse(NewPlayer player1, BossFight weapon) {
        System.out.println("\n....................................................\n");
        String[] showItem = {};

        if (this.Salt | game.Antifreeze) {
            System.out.println(game.pickUpItem);
            game.pickUpItem = "";
        }


        System.out.println("You see the left side of the house");
        if (!Salt) {
            System.out.println("seem that there is a little nook, on the side. You see a table with lot of junk on it");
        }
        if (!game.Antifreeze) {
            System.out.println("Also seems theres a cabinet beside it");
        }
        System.out.println(
                "1. Go north"
        );
        System.out.println(
                "3. Go east"
        );
        System.out.println(
                "2. Go in side the forest"
        );
        System.out.println(
                "4. Go west"
        );

        do {
            String input = myScanner.nextLine();


            switch (input) {
                case "1" -> backsideOfTheHouse(player1, weapon);
                case "2" -> insideHouse(player1, weapon);

                case "3" -> System.out.println("You cant go that way");
                case "4" -> woodenHouse(player1, weapon);
                case "look on table", "go to table", "search table" -> {
                    if (!this.Salt) {
                        takeSalt(player1, weapon);
                    } else if (this.Salt = true) {
                        System.out.println("Stupid? You already looked here, there is nothing more");
                    }
                }
                case "inventory","items" -> Inventory(weapon);

                case "look in cabinet", "search cabinet", "go to cabinet" -> takeAntifreeze(player1, weapon);

                default -> System.out.println("you cant do that");


            }
        } while (true);

    }

    //function to pick upp item
    public void takeSalt(NewPlayer player1, BossFight weapon) {
        String newSalt = "salt";
        this.Salt = true;
        game.setPickUpItem(game.pickUpItem = "You picked up Salt");//sätter pick upp item
        this.game.setSalt(newSalt);//sätter salt så att inventory visar upp en sträng
        System.out.println("\n....................................................\n");
        System.out.println(game.getSalt());
        System.out.println("theres only junk on table, but you see a little bag of macdonalds salt.\n you take the salt");
        System.out.println("\n....................................................\n");
        leftNookOfHouse(player1, weapon);

    }


    public void takeAntifreeze(NewPlayer player1, BossFight weapon) {
        game.Antifreeze = true;
        game.setPickUpItem(game.pickUpItem = "You picked up Antifreeze");
        System.out.println("\n....................................................\n");
        System.out.println("The door on the cabinet hinsches laude.\n theres is not much here. \n Except a bottle dusty antifreeze,\n its seems that it been here for long. Must have been for a old car or tractor");
        System.out.println("\n....................................................\n");
        leftNookOfHouse(player1, weapon);


    }

    public void eastSideOfHouse(NewPlayer player1, BossFight weapon) {
        System.out.println("\n....................................................\n");

        System.out.println("You found your self next to the right on the short side of the house");
        System.out.println("You dont see much");
        System.out.println(
                "1. Go north"
        );
        System.out.println(
                "3. Go east"
        );
        System.out.println(
                "2. Go in side the forest"
        );
        System.out.println(
                "4. Go west"
        );
        System.out.println("\n....................................................\n");


        do {
            String input = myScanner.nextLine();


            switch (input) {
                case "1" -> backsideOfTheHouse(player1, weapon);
                case "2" -> woodenHouse(player1, weapon);

                case "3" -> System.out.println("You cant go that way");
                case "4" -> System.out.println("You cant go that way");
                case "inventory","items" -> Inventory(weapon);




                default -> System.out.println("you cant do that");


            }
        } while (true);


    }

    public void backsideOfTheHouse(NewPlayer player1, BossFight weapon) {
        System.out.println("\n....................................................\n");
        if (game.wetBranch == true | game.Stick == true) {
            System.out.println(game.pickUpItem);
            game.pickUpItem = "";
        }
        System.out.println("You found your self in the back of the house");
        System.out.println("You see a staircase up to the second floor");
        System.out.println("besides that theres not much more, just some bushes \nand a dead tree standing next to them");
        System.out.println(
                "1. Go north"
        );
        System.out.println(
                "2. Go east"
        );
        System.out.println(
                "3. north"
        );
        System.out.println(
                "4. Go west"
        );
        System.out.println("\n....................................................\n");


        do {
            String input = myScanner.nextLine();


            switch (input) {
                case "1" -> System.out.println("you cant go that way");
                case "2" -> System.out.println("you cant go that way");
                case "3" -> eastSideOfHouse(player1, weapon);
                case "4" -> System.out.println("you can not go that way");
                case "go up stairs" -> topOffStairCase(player1, weapon);
                case "look in bushes", "go to bushes", "search bushes" -> searchBushes();
                case "look in tree", "search tree", "go to tree" -> System.out.println("There is nothing you can see from the ground");
                case "climb tree" -> System.out.println("You try to climb it but theres no low branches to hold on to end fall down");
                case "russel tree", "shake tree", "punch tree", "kick tree" -> getStick();
                case "use twig antifreeze salt" -> {
                    if (Salt == true && game.Antifreeze == true && game.wetBranch == true) {
                        System.out.println("you put salt and antifreeze on the top of the twiq. Its starts to sizzle but the woods to wet to burn");
                    }
                }
                case "make torch", "use salt antifreeze stick", "use s a s" -> {
                    if (Salt == true && game.Antifreeze == true && game.Stick == true) {
                        makeTorch();
                    }
                }
                case "inventory","items" -> Inventory(weapon);

                default -> System.out.println("you cant do that");


            }
        } while (true);


    }

    public void searchBushes() {
        game.wetBranch = true;
        System.out.println("You found a moist twig, you pick it up");
        game.setPickUpItem(game.pickUpItem = "picked up moist twig");
    }

    public void getStick() {

        game.Stick = true;
        System.out.println("You dont really see if it was worth your effort but a stick falls down and you pick it up");
        game.setPickUpItem(game.pickUpItem = "picked up stick");
    }

    public void makeTorch() {
        game.torch = true;
        System.out.println("after rubbing the salt on the top of the stick and pouring antifreeze on it, its start to smoke. \nAfter a second or to light starts to sprung and the top is fast a flamed");
        game.setPickUpItem(game.pickUpItem = "You crafted a torch, now in your inventory");
    }


    public void topOffStairCase(NewPlayer player1, BossFight weapon) {

        System.out.println(game.playerAlias + " is on top of the staircase " + game.playerAlias + " sees a door.");
        System.out.println("there is a light hanging to the top left side");
        System.out.println(game.playerAlias + " notice there's a doorbell along with a keyhole next to the handle");
        System.out.println(
                "1. Go north"
        );
        System.out.println(
                "2. Go east"
        );
        System.out.println(
                "3. north"
        );
        System.out.println(
                "4. Go west"
        );

        do {
            String input = myScanner.nextLine();


            switch (input) {
                case "1" -> System.out.println("you cant go that way");
                case "2" -> System.out.println("you cant go that way");
                case "3" -> System.out.println("You cant go that way");
                case "4" -> eastSideOfHouse(player1, weapon);
                case "open door" -> System.out.println("the door is locked");
                case "search light" -> System.out.println("you burn your self trying to search the light and give up");
                case "break light with sword" -> breakLight();
                case "use key in door","use key" -> {
                    if (game.Key == true) {
                        topFloor(player1,weapon);
                    } else {
                        System.out.println("You dont have a key");
                    }
                }
                case "use twig antifreeze salt" -> {
                    if (Salt == true && game.Antifreeze == true && game.wetBranch == true) {
                        System.out.println("you put salt and antifreeze on the top of the twiq. Its starts to sizzle but the woods to wet to burn");
                    }
                }
                case "make torch", "use salt antifreeze stick", "use s a s" -> {
                    if (Salt == true && game.Antifreeze == true && game.Stick == true) {
                        makeTorch();
                    } else {
                        System.out.println(
                                "you dont have that"
                        );
                    }
                }
                default -> System.out.println("you cant do that");


            }
        } while (true);
    }

    public void breakLight() {
        game.Key = true;
        System.out.println("the light breaks and a key falls out, hitting the stairs with a clink. You pick the key up and put it in your pocket");
        game.setPickUpItem(game.pickUpItem = "picked up key");
    }

    public void topFloor(NewPlayer player1, BossFight weapon) {
        System.out.println("the door opens and you walk in. You are able too see because the huge window to your left and are in no need off a other light source");
        System.out.println("there is 2 doors, a picture hangs on wall between them.");
        System.out.println("to the right theres a fireplace, with a brick self over it with a book, a bottled ship and a vas with a dead rose in it.");
        System.out.println(getName() + " found a long sword and added to inventory");
        weapon.setPlayerWeapon("long sword");
        setWeapon("long sword");

    }
    public void finalChapter(NewPlayer player1, BossFight weapon){
        System.out.println("you find a hatch under the rug, you open it and walk down the stairs you uncover");
        System.out.println("after walking down the hatch, you see a goblin he looks from top to toe be filled with furie");
        System.out.println("1. to attack");
        System.out.println("2. to run");
        do {
            String input = myScanner.nextLine();


            switch (input) {
                case "1", "attack" -> fight(player1, weapon);
                case "2" -> insideHouse(player1, weapon);




                default -> System.out.println("try something ells");
            }
        } while (true);

    }

    public void fight(NewPlayer player1, BossFight weapon) {
        int random_int = 0;
        System.out.println("1. attack the goblin");
        System.out.println("2. run");

        int monsterDamege = (int) Math.floor(Math.random() * (max - min + 1) + min);



        if (getWeapon().equals("short sword")) {//kalkylera vad damage blir om du har short sword

            min = 16;
            max = 24;
            random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            goblinHp = goblinHp - random_int;


            System.out.println("Goblins hp is at " + goblinHp + " hp");
            System.out.println(getName() + "'hp is " + hp);
        } else if (getWeapon().equals("long sword")) {//-||- long sword
            min = 30;
            max = 55;
            int damage = (int) Math.floor(Math.random() * (max - min + 1) + min);
            goblinHp = goblinHp - damage;
            System.out.println("Goblins hp is at " + goblinHp + " hp");
            System.out.println(getName() + "'hp is " + hp);
        }
        hp = hp - monsterDamege;

        System.out.println(random_int + " rndom int");
        if (goblinHp < 1) {
            Win(player1, weapon);


        }
        if (hp < 1) {
            Dead(player1,weapon);
        }
        do {
            String input = myScanner.nextLine();


            switch (input) {
                case "1", "attack" -> fight(player1, weapon);
                case "2" -> System.out.println();

                case "3" -> System.out.println("You cant go that way");
                case "4" -> System.out.println();
                case "5" -> System.out.println();
                case "6", "make torch" -> {
                    System.out.println();
                }


                default -> System.out.println("try something ells");
            }
        } while (true);
    }


    private void Win(NewPlayer player1, BossFight weapon) {
        System.out.println("\n....................................................\n");

        System.out.println("confratz " + getName());
        System.out.println("you won the game");
        System.out.println("press 1 to restart");
        System.out.println("\n....................................................\n");

        int choise = myScanner.nextInt();
        if (choise == 1) {
            game.goblinHp = 120;
            game.hp = 100;
            woodenHouse(player1, weapon);
        }
    }

    private void Dead(NewPlayer player1, BossFight weapon) {
        System.out.println("\n....................................................\n");

        System.out.println("you loose, to bad");
        System.out.println("1. to restart");
        System.out.println("\n....................................................\n");

        int choise = myScanner.nextInt();
        if (choise == 1) {
            game.goblinHp = 120;
            game.hp = 100;
            woodenHouse(player1, weapon);
        }

    }

    public void Store() {
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        System.out.println("this is a store");

        do {
            switch (input) {
                case "1" -> buyAntifreeze();
                case "2" -> buyLongSword();

            }
        } while (true);


    }
    public void buyLongSword(){
        if(myMonney>=300){
            setWeapon("long sword");
            weapon="long sword";
            myMonney=myMonney-300;
        }
        else {
            System.out.println("please get money");
        }

    }


    public void buyAntifreeze(){
        if(myMonney>=100) {
            myMonney=myMonney-100;
            game.setAntifreeze(true);
            game.Antifreeze = true;
            System.out.println(game.Antifreeze);
        }
        else {
            System.out.println("please get money");
        }


    }
}
