package Week_8_B;

public class Test {

    public static void main(String[] args){
//abstract
        Minecraft mine = new Minecraft();
        Roblox rob = new Roblox();

        System.out.println();
        mine.gameName();
        mine.gameRating();
        mine.sales(12000);

        rob.gameName();
        rob.gameRating();
        rob.sales(8000);
//interface
        MinecraftInt mineInt = new MinecraftInt();
        RobloxInt robInt = new RobloxInt();

        System.out.println();
        mineInt.gameName();
        mineInt.gameRating();
        mineInt.sales(8105);

        robInt.gameName();
        robInt.gameRating();
        robInt.sales(8105);

    }
}


