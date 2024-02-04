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

  // constructor til fuldt navn skrevet i én string
  public Student(String fullName, int enrollmentYear, int graduationYear) {
    super(fullName);
    this.enrollmentYear = enrollmentYear;
    this.graduationYear = graduationYear;
  }

  // tom constructor
  public Student() {}

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

  // override af superklassens metode
  @Override
  public String toString() {
    return (
      super.toString() +
      ", enrollmentYear: " +
      enrollmentYear +
      ", graduationYear: " +
      graduationYear +
      ", graduated: " +
      graduated
    );
  }
}
