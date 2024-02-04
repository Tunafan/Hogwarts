import java.time.LocalDate;

public class Teacher extends Person {

  private String empType;
  private LocalDate employmentStart;
  private LocalDate employmentEnd;

  // constructors

  public Teacher(String fullName, int employmentYear, int employmentEndYear) {
    super(fullName);
    this.empType = "Unknown";
    this.employmentStart = LocalDate.of(employmentYear, 1, 1);
    this.employmentEnd = LocalDate.of(employmentEndYear, 12, 31);
  }

  public Teacher(
    String fullName,
    String empType,
    LocalDate employmentStart,
    LocalDate employmentEnd
  ) {
    super(fullName);
    this.empType = empType;
    this.employmentStart = employmentStart;
    this.employmentEnd = employmentEnd;
  }

  // getters and setters

  public String getEmpType() {
    return empType;
  }

  public void setEmpType(String empType) {
    this.empType = empType;
  }

  public LocalDate getEmploymentStart() {
    return employmentStart;
  }

  public void setEmploymentStart(LocalDate employmentStart) {
    this.employmentStart = employmentStart;
  }

  public LocalDate getEmploymentEnd() {
    return employmentEnd;
  }

  public void setEmploymentEnd(LocalDate employmentEnd) {
    this.employmentEnd = employmentEnd;
  }

  public String toString() {
    return (
      super.toString() +
      ", Employment Type: " +
      empType +
      ", Employment Period: " +
      employmentStart +
      " to " +
      employmentEnd
    );
  }
}
