package multilevelUniversityCourse;

import java.util.ArrayList;
import java.util.List;

class Course <T extends CourseType>{

    List<T> allcourse = new ArrayList<>();

    public void addCourse(T course){
        allcourse.add(course);
    }
    public void removeCourse(T course){
        allcourse.remove(course);
    }
    public void showCourseDetails(T course){
        course.displayInfo();
    }




}
