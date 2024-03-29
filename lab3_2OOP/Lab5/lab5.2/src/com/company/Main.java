package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String> m = new HashMap<String, String>();
        int best = 100;
        int max = -1;
        int min = 101;
        int sum = 0;
        int cnt = 0;


        try {
            FileReader in_file = new FileReader("scores.txt");
            FileWriter out_file = new FileWriter("grades.txt");

            BufferedReader br = new BufferedReader(in_file);
            BufferedWriter bw = new BufferedWriter(out_file);

            String line = "";
            for(int i = 0; i < 5; i++){
                line = br.readLine();
                String[] strings = line.split(" ");
                m.put((strings[0] + " " + strings[1]), strings[2]);
            }
            br.close();

            Set< Map.Entry< String,String> > st = m.entrySet();
            for (Map.Entry< String,String> me:st){
                String res = "";
                res+= me.getKey();

                if(Integer.parseInt(me.getValue()) >= best - 10){
                    res += " A";
                }else if(Integer.parseInt(me.getValue()) >= best - 20){
                    res += " B";
                }else if(Integer.parseInt(me.getValue()) >= best - 30){
                    res += " C";
                }else if(Integer.parseInt(me.getValue()) >= best - 40){
                    res += " D";
                }else{
                    res += " E";
                }
                bw.write(res + "\n");

                if(Integer.parseInt(me.getValue()) > max )max = Integer.parseInt(me.getValue());
                if(Integer.parseInt(me.getValue()) < min )min = Integer.parseInt(me.getValue());
                cnt ++;
                sum += Integer.parseInt(me.getValue());
            }

            bw.write("\n");
            bw.write("Average - " + sum/cnt + "\n");
            bw.write("Maximum - " + max + "\n");
            bw.write("Minimum - " + min + "\n");
            bw.close();



        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}