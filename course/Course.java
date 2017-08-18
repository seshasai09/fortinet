package fortinet.course;

import fortinet.student.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seshasai on 15/08/2017.
 */
public abstract class Course {

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String courseName;
    public List<Student> registeredStudents;
    public boolean registerStudent(Student newStudent) {
        if(registeredStudents == null){
            registeredStudents = new ArrayList<Student>();
        }
        registeredStudents.add(newStudent);
        return true;
    }

    public boolean unregisterStudent(Student student) {

        for(Student registeredStudent : registeredStudents){
            if(registeredStudent.getStudentId() == student.getStudentId()){
                registeredStudents.remove(registeredStudent);
                return true;
            }
        }
        return false;
    }
    public abstract void updateStudents(Update update);
}
