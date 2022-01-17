package users;

public enum TeacherPosition 
{
    TUTOR, LECTOR, SENIOR_LECTOR, PROFESSOR; 
    public static TeacherPosition getTeacherPosition(int positionId)
    {
        switch(positionId)
        {
            case 1:
            {
                return TUTOR;
            }
            case 2:
            {
                return LECTOR;
            }
            case 3:
            {
                return SENIOR_LECTOR;
            }  
            default:
            {
                return PROFESSOR;
            }
        }
    }
}