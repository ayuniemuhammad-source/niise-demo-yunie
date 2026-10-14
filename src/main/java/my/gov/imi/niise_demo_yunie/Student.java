package my.gov.imi.niise_demo_yunie;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    @Autowired 
    private Grades grades;
    
    public void retrieveGrades() {
        grades.getGrades();
    }
}