package Week_8_B;

public class RobloxInt implements GameInterface {

    public void gameName(){
        System.out.println("Game: Roblox");
    }

    public void gameRating(){
        System.out.println("Rating: *****");
    }

    public void sales(int copy){
        System.out.println("The game made $" + 25 * copy + " in first weeks of sales.");
    }
}
