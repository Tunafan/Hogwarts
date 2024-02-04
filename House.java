public class House {

  private String name;
  private String founder;
  private String colors;

  // constructor
  public House(String name, String founder, String colors) {
    this.name = name;
    this.founder = founder;
    this.colors = colors;
  }

  public House() {}

  // getters og setters

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFounder() {
    return founder;
  }

  public void setFounder(String founder) {
    this.founder = founder;
  }

  public String getColors() {
    return colors;
  }

  public void setColors(String colors) {
    this.colors = colors;
  }

  // toString metode med @override som god praksis
  //   (den overrider jo ikke nogen superclass el. lign.)
  @Override
  public String toString() {
    return name + ", founded by " + founder + ", colors: " + colors;
  }
}
