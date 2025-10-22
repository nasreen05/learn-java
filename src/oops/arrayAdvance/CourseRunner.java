package oops.arrayAdvance;

class CourseRunner{
	public static void main(String[] args) {
		 
		 Course[] courses= new Course[5];

		 Course course1=new Course();
		 course1.setName("Engineering");
		 course1.setSubject("java");

		 Course course2= new Course();
		 course2.setName("MBBS");
		 course2.setSubject(" General Medicine");

		 Course course3=new Course();
		 course3.setName("MBA");
		 course3.setSubject("Business Management");

		 Course course4=new Course();
		 course4.setName("BA");
		 course4.setSubject("English Honours");

		 Course course5= new Course();
		 course5.setName("Digital Marketing");
		 course5.setSubject("Marketing ");

		 for(int i=0;i<courses.length;i++){
		 	if(i==0){
		 		courses[i]=course1;
		 	}else if(i==1){
		 		courses[i]=course2;
		 	}
		 	if(i==2){
		 		courses[i]=course3;
		 	}else if(i==3){
		 		courses[i]=course4;
		 }else if(i==4){
		 	courses[i]=course5;

		 }
		 	}
for(int i=0;i<courses.length;i++){
	Course course= courses[i];
	if(course !=null){
		System.out.println("Course name");
		System.out.println(course.getName());
		System.out.println("Subject ");
		System.out.println(course.getSubject());
		System.out.println();
	} 
}
}
		 	}
		 	
		 	
