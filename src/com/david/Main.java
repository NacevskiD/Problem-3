package com.david;

import java.util.ArrayList;

/**
 * Class with the main method in - create and work with some ITECCourse objects
 */
public class Main {

    public static void main(String args[]) {

        ITECCourse infoTechCourse = new ITECCourse("Info Tech Concepts",1100,
                30,"T3050");
        infoTechCourse.addStudent("Max");
        infoTechCourse.addStudent("Nancy");
        infoTechCourse.addStudent("Orson");
        infoTechCourse.writeCourseInfo();

        ITECCourse testCourse = new ITECCourse("Test Course",1050,25,"T2050");
        testCourse.addStudent("Macy");
        testCourse.addStudent("Tommy");
        testCourse.writeCourseInfo();

        ArrayList<ITECCourse> allCourses = new ArrayList<ITECCourse>();
        allCourses.add(infoTechCourse);
        allCourses.add(testCourse);

        for (ITECCourse value:allCourses){
            System.out.println("The number of remaining seats for " + value.name + " is " + value.getRemainingSeats());
        }


    }


}

