package subjects;

public class PreCourse extends Course implements Results
{
    private int coursePrice;
    private String result;
    
    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }
    
    public void setResult(String result)
    {
        this.result = result;
    }
    /*
    public String getResultLocal()
    {
        return result;
    }
    */
    @Override
    public int getResult() 
    {
        //String result = getResultLocal();
        int total = 0;
        if(result.equals("Pass"))
            total = 1;
        else
            total = 0;
        return total;
    }
    
}
