package fortinet.student;

import fortinet.course.Update;

/**
 * Created by vasumathi on 15/08/2017.
 */
public abstract class StudentAbstract {

    public String name;

    public int studentId;

    public abstract void updateFromCourse(Update update);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
