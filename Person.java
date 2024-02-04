import java.util.Arrays;

public class Person {

  private String firstName;
  private String middleName;
  private String lastName;
  private int age;

  // constructors

  // constructor med på forhånd opdelte navne
  public Person(String firstName, String lastName) {
    this(firstName, null, lastName);
  }

  // (mellemnavn) constructor med på forhånd opdelte navne
  public Person(String firstName, String middleName, String lastName) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }

  // constructor med navn som helt string
  public Person(String fullName) {
    setFullName(fullName);
  }

  //   tom constructor
  public Person() {}

  // getters og setters

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  // ovenstående får (getter) firstName og sætter (setter) det nedenunder.
  // "this." gør, at jeg kan skelne mellem alle de forskellige firstName, så jeg ved, at det er den her i funktionen gældende

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // get- og set-FullName()
  public String getFullName() {
    if (hasMiddleName()) {
      return firstName + " " + middleName + " " + lastName;
    } else {
      return firstName + " " + lastName;
    }
  }

  public void setFullName(String fullName) {
    String[] nameParts = fullName.split(" ");
    firstName = nameParts[0];
    lastName = nameParts[nameParts.length - 1];

    if (nameParts.length > 2) {
      middleName =
        String.join(
          " ",
          Arrays.copyOfRange(nameParts, 1, nameParts.length - 1)
        );
    } else {
      middleName = null;
    }
  }

  public String toString() {
    if (hasMiddleName()) {
      return firstName + " " + middleName + " " + lastName + ", age: " + age;
    } else {
      return firstName + " " + lastName + ", age:" + age;
    }
  }

  public boolean hasMiddleName() {
    return middleName != null && !middleName.isEmpty();
  }
}
