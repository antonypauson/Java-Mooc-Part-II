public class Grade {
    private int grade;

    public Grade(int grade) {
        if (grade < 0 || grade > 5) {
            throw new IllegalArgumentException("Grade must be between 0 and 5");
        }
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Grade grade = new Grade(22);

    }
}
