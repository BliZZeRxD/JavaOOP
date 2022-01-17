package Week_8_D;

public class Someclass implements SomeInterface, Moveable{

        boolean move;

        Someclass(boolean move){

            this.move = move;

        }

        public void move(){

            if(this.move)
                System.out.println("Is moving");
            else
                System.out.println("Is not moving");

        }

}
