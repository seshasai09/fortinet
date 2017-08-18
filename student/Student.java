package fortinet.student;

import fortinet.course.Update;

import java.util.List;

/**
 * Created by seshasai on 15/08/2017.
 */
public class Student extends StudentAbstract{


    private List<String> coursesRegistered;

    public Student(String name, int id){
        this.name = name;
        this.studentId = id;
    }



    public List<String> getCoursesRegistered() {
        return coursesRegistered;
    }

    public void setCoursesRegistered(List<String> coursesRegistered) {
        this.coursesRegistered = coursesRegistered;
    }


    @Override
    public void updateFromCourse(Update update) {
        System.out.print(name);
        System.out.println(" You have an Update from "+update.getCourseName()+" course. The Update is");
        System.out.println(update.getUpdate());
    }
}
