package Methods;

public class Student {
    private String faculty;
    private int facultyNumber;
    private static String university;

    public static String getUniversity() {
        return university;
    }

    public static void setUniversity(String university) {
        Student.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public Student(int facultyNumber){
        this.facultyNumber=facultyNumber;
    }

    public Student(String faculty){
        this.faculty=faculty;
    }

    public Student(int facultyNumber, String faculty){
        this.faculty=faculty;
        this.facultyNumber=facultyNumber;
    }


    public String TakeExam(boolean successCriteria){
        String result;
        if(successCriteria)
            result="Successfully taken the exam";
        else
            result="I am sad/mad";

        return result;
    }

    public int GetNumberOfSubjects(int numberOfMandatorySubjects){
        return numberOfMandatorySubjects+2;
    }

    public void SetLectureDay(WeekDays dayOfTheWeek){
        switch (dayOfTheWeek){
            case MON:
                System.out.println("You have selected Monday");
                break;
            case TUE:
                System.out.println("You have selected Tuesday");
                break;
        }
    }
}
