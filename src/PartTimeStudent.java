/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Darshan
 */
public class PartTimeStudent extends Student {
    private int numberOfCourses;

    public PartTimeStudent(int numberOfCourses, int sid, String sname) {
        super(sid, sname);
        this.numberOfCourses = numberOfCourses;
    }
    
}
