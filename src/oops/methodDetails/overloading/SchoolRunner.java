package oops.methodDetails.overloading;

class SchoolRunner {
  public static void main(String[] args) {

    School school = new School("Daspara High School", 1234, "Daspara");
    System.out.println(school.getName());
    System.out.println(school.getSchoolNumber());
    System.out.println(school.getSchoolAddress());

    School school1 = new School("Delhi Public School", 2345, "Siliguri");
    System.out.println(school.getName());
    System.out.println(school.getSchoolNumber());
    System.out.println(school.getSchoolAddress());
  }
    }