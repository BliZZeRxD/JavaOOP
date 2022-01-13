package subjects;

import java.io.Serializable;

public enum Faculty implements Serializable
{
    INFORMATION_TECHNOLOGY, 
    BUSINESS_SCHOOL, 
    INTERNATIONAL_SCHOOL_OF_ECONOMIC,
    FACULTY_OF_GEOLOGY_AND_OIL_AND_GAS_INDUSTRY,
    KAZAKHSTAN_MARYTIME_ACADEMY,
    CENTER_OF_MATHEMATICS_AND_CYBERNETICS;
    
    public static Faculty getFaculty(int facultyId)
    {
        switch(facultyId)
        {
            case 1:
            {
                return INFORMATION_TECHNOLOGY;
            }
            case 2:
            {
                return BUSINESS_SCHOOL;
            }
            case 3:
            {
                return INTERNATIONAL_SCHOOL_OF_ECONOMIC;
            }
            case 4:
            {
                return FACULTY_OF_GEOLOGY_AND_OIL_AND_GAS_INDUSTRY;
            }
            case 5:
            {
                return KAZAKHSTAN_MARYTIME_ACADEMY;
            }
            default:
            {
                return CENTER_OF_MATHEMATICS_AND_CYBERNETICS;
            }
        }
    }    
}
