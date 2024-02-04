public class Student extends Person {

  private int enrollmentYear;
  private int graduationYear;
  private boolean graduated;

  // Constructors

  public Student(
    String firstName,
    String lastName,
    int enrollmentYear,
    int graduationYear
  ) {
    super(firstName, lastName);
    this.enrollmentYear = enrollmentYear;
    this.graduationYear = graduationYear;
    this.graduated = false;
  }

  // Getters and Setters

  public int getEnrollmentYear() {
    return enrollmentYear;
  }

  public void setEnrollmentYear(int enrollmentYear) {
    this.enrollmentYear = enrollmentYear;
  }

  public int getGraduationYear() {
    return graduationYear;
  }

  public void setGraduationYear(int graduationYear) {
    this.graduationYear = graduationYear;
  }

  public boolean isGraduated() {
    return graduated;
  }

  public void setGraduated(boolean graduated) {
    this.graduated = graduated;
  }

  // graduate-metode til når ungerne graduerer :')
  public void graduate() {
    this.graduated = true;
  }

  @Override
  public String toString() {
    String studentInfo = super.toString();
    return (
      studentInfo +
      ", enrolled: " +
      enrollmentYear +
      ", graduation: " +
      graduationYear
    );
  }
}
