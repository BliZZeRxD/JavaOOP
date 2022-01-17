package Week_8_E;

public class MinMax {

    static class innerMinMax{

        static int maxi,mini;

        innerMinMax(){

            maxi = -99999;
            mini = 99999;
        }
    }

    static innerMinMax m = new innerMinMax();

    static String minmax(int values[]){

        for(int i = 1; i < values.length; i++){
            if(values[i] > m.maxi){
                m.maxi = values[i];
            }
            if(values[i] <m. mini){
                m.mini = values[i];
            }
        }

        return ("Maximum :" + m.maxi + "\nMinimum : " + m.mini);
    }
}
