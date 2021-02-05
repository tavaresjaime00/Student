package student;

/*
 *  Sheridan College, Trafalgar Campus
 * Name/Student no.: Jaime Tavares, 991512643
 * Program: Information Systems Engineering
 */

/**
 *
 * @author jtava
 */
public class PartTimeStudent extends Student {
    private int numCourses;
    public PartTimeStudent(String name, int numOfCourses){
        numCourses = numOfCourses;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    
    
}
