package Methods;

public class Test {
    public static void main(String[] args) {
        Student ivo = new Student(12345, "KST");

        System.out.println(ivo.getFaculty());
        System.out.println(ivo.getFacultyNumber());

        System.out.println(ivo.TakeExam(true));

        int numberOfSubjectsForIvo= ivo.GetNumberOfSubjects(12);
        int doubleTheWork= ivo.GetNumberOfSubjects(12)*2;

        System.out.println(numberOfSubjectsForIvo);
        System.out.println(doubleTheWork);

        Student.setUniversity("Sofia University");
        System.out.println(Student.getUniversity());

        Student facultyOnly = new Student("Engineer");
        Student facultyNumberOnly = new Student(159);

        ivo.SetLectureDay(WeekDays.TUE);
    }
}
