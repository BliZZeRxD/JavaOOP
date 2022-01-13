package subjects;
import java.io.Serializable;
public class Mark implements Results, Serializable
{
    private int midTerm;
    private int endTerm;
    private int finalMark;
    private MarksEnum markCategory;
    private int total;
    private double GPA;

    
    public int getMidTerm() {
        return midTerm;
    }

    public void setMidTerm(int midTerm) {
        this.midTerm = midTerm;
    }

    public int getEndTerm() {
        return endTerm;
    }

    public void setEndTerm(int endTerm) {
        this.endTerm = endTerm;
    }

    public int getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(int finalMark) {
        this.finalMark = finalMark;
    }

    public double getGPA() 
    {        
        if(this.total<50) GPA = 0;
        else if (this.total<54) GPA = 1; 
        else if (this.total<59) GPA = 1.33;
        else if (this.total<64) GPA = 1.67;
        else if (this.total<69) GPA = 2;
        else if (this.total<74) GPA = 2.33;
        else if (this.total<79) GPA = 2.67;
        else if (this.total<84) GPA = 3;
        else if (this.total<89) GPA = 3.33;
        else if (this.total<94) GPA = 3.67;
        else if (this.total<100) GPA = 4;
        return GPA;
    }
    
    public MarksEnum getMark()
    {
        double gpa = getGPA();             
        if(gpa<1)
        {
            markCategory = MarksEnum.Fail;
        }
        else if(gpa>=1 && gpa< 2.67)
        {
            markCategory = MarksEnum.Pass;
        }
        else if(gpa>=2.67 && gpa<3.67)
        {
            markCategory = MarksEnum.Merit;
        }
        else if(gpa>=3.67 && gpa<4)
        {
            markCategory = MarksEnum.Distinction;
        }        
        return markCategory;
    }

    @Override
    public int getResult() 
    {
        total = getMidTerm()+getEndTerm()+getFinalMark();
        return total;
    }
}
