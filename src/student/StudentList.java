/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/** for pull
 * 
 * @author jtava
 * this is comment added
 * this comment was added on Feb.5th. 2021
 */
// array of objects (class example)
public class StudentList {
    
    public static void main(String[] args) {
        
        Student [] studentList = new Student[2];
        Student s1 = new Student();
        s1.setName("Jaime");
        Student s2 = new Student();
        s2.setName("Harry");
        
        studentList[0] = s1;
        studentList[1] = s2;
        // alternative method to create a for-loop
        for (Student s: studentList) {
            System.out.println(s.getName());
        }
    }
    
}
