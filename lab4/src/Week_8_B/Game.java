package Week_8_B;

public abstract class Game {

    public void sales(int copy){

        System.out.println("The game made $" + 25 * copy + " in first weeks of sales.");

    }

    public abstract void gameName();

    public abstract void gameRating();

}
