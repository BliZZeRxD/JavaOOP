package Week_8_B;

public class MinecraftInt implements GameInterface {

    public void gameName(){
        System.out.println("Game: Minecraft");
    }

    public void gameRating(){
        System.out.println("Rating: ***");
    }

    public void sales(int copy){
        System.out.println("The game made $" + 15 * copy + " in first weeks of sales.");
    }
}
