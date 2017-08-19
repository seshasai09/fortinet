# Fortinet
Solutions to assessment 

## Program to reverse a list and related test cases are present in the reverselistt folder

## This is the scenario for Pub-Sub Design Pattern.
/**
 * This is a Program to simulate some functions/operations that happen in schools
 * The scenario that I am trying to simulate are
 * 1. Create school(extends Runnable)
 * 2. School has courses
 * 3. Students register for courses
 * 4. Whenever there is an update for the course, Students who are registered for that course gets the update.
 *
 * I have solved this problem using Design Patterns
 * I have Created a CourseFactory class that would create  course objects.
 * CourseFactory class is a Singleton class. I have made CourseFactory a singleton class
 * because different schools can use the same CourseFactory object to get course objects.
 *
 * The CourseFactory follows the Factory design pattern.
 * There are various course available like MathCourse, ScienceCourse and SocialCourse.
 * All the above mentioned courses extend the abstract class course.
 * Whenever a new course is required by the school, school uses the CourseFactory to get the required course object.
 *
 * I have used the Pub-Sub design Pattern to Solve the problem of updating students in the course.
 * Every course(Publisher) has methods to register, unregister students and an abstract method to update * students.
 * Every course has to provide implementation for the update method. Student(Subscribes) allows the course
 * to update it by invoking the updateFromCourse method.
 *
 * I have tried to simulate two schools by creating two threads.
 * Both the schools use the CourseFactory to obtain the courses.
 * Since CourseFactory is singleton only one instance is created.
 *
 * ### Run the program by running the SchoolApp.java file.
 * */
