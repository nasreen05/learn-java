package oops.encapsulation;

public class Student {
    private String name;
    private int age;
    private int id;
    public String gender;
    public String courseType;

    public Student(String name, int age, int id, String gender, String courseType) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.courseType = courseType;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return id;
    }

    public int getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
  public void  setId(int id){
        this.id=id;
  }
}


