public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Ahmar");
        s1.addCourseAndGrade("Math", 68);
        s1.addCourseAndGrade("Computer Science", 87);
        s1.addCourseAndGrade("French", 90);
        s1.addCourseAndGrade("English", 90);

        System.out.println(s1);
    }
}
