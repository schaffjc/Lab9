class Person {
  private String name;
  private int age;
  private String color;

  Person (String aName, int aAge, String aColor) {
    name = aName;
    age = aAge;
    color = aColor;
  }  

  String getName() {
    return name;
  }

  int getAge() {
    return age;
  }

  String getColor() {
    return color;
  }
}