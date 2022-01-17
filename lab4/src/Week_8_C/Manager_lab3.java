package Week_8_C;

public class Manager_lab3{

    String team;

    public Manager_lab3(String name, double salary, int year, String insuranceNumber, String team){
        //super(name, salary,  year,  insuranceNumber);
        this.team = team;
    }

    public String GetTeam(){
        return this.team;
    }

    public void SetTeam(String team){

        this.team = team;

    }
/*
    public void Bonus(double bonus){

        super.Setsalary( super.Getsalary() + bonus);

    }

    public boolean equals(String name, double salary, int year, String insuranceNumber, String team){

        if(super.equals(name, salary, year, insuranceNumber) && (this.team == team))
            return true;
        else
            return false;

    }
*/
    public String toString(){

        return super.toString() + "\nTeam: " + team;

    }


}
