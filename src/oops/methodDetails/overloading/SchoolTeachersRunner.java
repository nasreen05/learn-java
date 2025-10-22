package oops.methodDetails.overloading;

class SchoolTeachersRunner{

public static void main(String[]args){

School school= new School("Daspara  high school",1234,"Daspara");

System.out.println("School Details ");
System.out.println(school.getName());
System.out.println(school.getSchoolAddress());

Teachers teachers = new Teachers("Rafiqul islam","Math",50000.0);
school.setteachers(teachers);

Teachers teachers1= teachers;
System.out.println("Teachers Details");
System.out.println(teachers.getName());
System.out.println(teachers.getSubject());
System.out.println(teachers.getSalary());

}
}