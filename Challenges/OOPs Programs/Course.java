import java.util.Arrays;

public class Course {
    static int maxCapacity = 100;

    String courseName;
    int enrollments;
    String[] enrolledStudents;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
        System.out.println("Total capacity is " + maxCapacity);
    }

    void enrolledStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
        System.out.println("Total Students is " + enrollments);
        System.out.println("Total capacity is " + maxCapacity);
    }

    void unenrolledStudent(String studentName){
        System.out.println("Student removed");
        enrollments--;
        System.out.println("Total Students is " + enrollments);
        System.out.println("Total capacity is " + maxCapacity);
//        for (int i = 0; i< enrolledStudents.length; i++){
//            if (studentName != enrolledStudents[i]) {
//                enrolledStudents.
//            }
//        }
    }

    public static void main(String[] args) {
        Course bTech = new Course("BTech");

        bTech.enrolledStudent("Mayank");
        bTech.enrolledStudent("Shaisha");
        Course.setMaxCapacity(200);
        bTech.unenrolledStudent("Mayank");
    }
}
