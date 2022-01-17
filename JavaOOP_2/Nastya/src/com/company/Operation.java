public enum Operation{
    PLUS,
    MINUS,
    MULPIPLY;
    public int result;
    int calculate(int x, int y)
    {
        switch(this){
            case MULPIPLY:
                result=x*y;
                break;
            case MINUS:
                result=x-y;
            break;

            case PLUS:
                result=x+y;
            break;

        }
        return result;
    }
}


