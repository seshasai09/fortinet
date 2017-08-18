package fortinet.course;

/**
 * Created by seshasai on 15/08/2017.
 */
public class CourseFactory {

    private static CourseFactory instance;
    private static int numberOfInstances;


    private CourseFactory(){

    }

    public static CourseFactory getInstance(){
        if(instance == null){
            instance = new CourseFactory();
            numberOfInstances++;
            return instance;
        }
        return instance;
    }

    public Course getCourse(CourseName subject){
        switch(subject){
            case MATHS:  return new MathCourse();
            case SCIENCE:  return new ScienceCourse();
            case SOCIAL : return new SocialCourse();
            default : return null;
        }
    }

    public static int getNumberOfInstancesCreated(){
        return numberOfInstances;
    }
}
