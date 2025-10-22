package oops.methodDetails.overloading;

class TeachersRunner{
	public static void main(String[]agrs){
		
    /*     Teachers teachers = new Teachers("Seauly farhan begum", 500000, "Math");
        System.out.println(teachers.getName());
        System.out.println(teachers.getSalary());
        System.out.println(teachers.getSubject());

        Teachers teachers1 = new Teachers("Rafiqul islam", 340000, "Chemistry");
        System.out.println(teachers1.getName());
        System.out.println(teachers1.getSalary());
        System.out.println(teachers1.getSubject());
    }
}*/


        Teachers teacher1 = new Teachers("Seualy farhan begum", "Math", 50000.00);
        System.out.println(teacher1.getName());
        System.out.println(teacher1.getSubject());
        System.out.println(teacher1.getSalary());

        Teachers teacher2 = new Teachers("Rafiqul islam", "Chemistry", 34000.00);
        System.out.println(teacher2.getName());
        System.out.println(teacher2.getSubject());
        System.out.println(teacher2.getSalary());
    }
}
