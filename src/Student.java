import java.util.HashMap;

public class Student {
    
    private String name;
    private HashMap<String, Integer> grades = new HashMap<String, Integer>();

    public Student(String name) {
        this.name = name;
    }   

    public void addCourseAndGrade(String course, int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Grade is out of range. Please ensure that the grade is between 0 - 100");
        } else grades.put(course, grade);
    }

    public float averageGrade() {
        float sum = 0;
        int length = grades.size();
        
        for (String i : grades.keySet()) {
            sum += grades.get(i);
        }

        return sum / length;
    }

    public String toString() {
        String studentDetails = "Student Name: " + this.name + "\nAverage Grade: " + averageGrade() + " / 100";
        // String studentCourses = "Courses: " + 
        
        return studentDetails;
    }

}
