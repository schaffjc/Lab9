import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList<Person> people;
    people = new ArrayList<Person>();

    people.add(new Person("Jamie", 22, "blue"));
    people.add(new Person("A", 87, "pink"));
    people.add(new Person("B", 13, "yellow"));
    people.add(new Person("C", 55, "black"));
    people.add(new Person("D", 4, "green"));

    try {
      FileWriter toWriteFile;
      toWriteFile = new FileWriter("data.txt");
      BufferedWriter output = new BufferedWriter(toWriteFile);

      for(int i=0; i<people.size(); i++) {
        output.write(people.get(i).getName());
        output.newLine();
        output.write(Integer.toString(people.get(i).getAge()));
        output.newLine();
        output.write(people.get(i).getColor());
        output.newLine();
        output.flush();
      }

      output.close();
    }

    catch (IOException excpt) {
      excpt.printStackTrace();
    }

    try {
      FileReader myFile;
      myFile = new FileReader("data.txt");
      BufferedReader reader = new BufferedReader(myFile);

      String name = "";
      int age = 0;
      String color = "";
      
      while (reader.ready()) {
        name = reader.readLine();
        age = Integer.parseInt(reader.readLine());
        color = reader.readLine();

        System.out.printf("%-10s %-10s %-10s %n", name, age, color);
      }

      reader.close();
    }

    catch (IOException exception) {
      exception.printStackTrace();
    }
  }
}