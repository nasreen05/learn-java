package oops.arrayAdvance;

class StudioArrayRunner{
public static void main(String[] args) {
		Studio[] studios= new Studio[5];

		Studio studio= new Studio();
		studio.setStudioName("applo public school");
		studio.setCity("Delhi");
	//	System.out.println(school.getSchoolAddress());
		studios[0]=studio;
		
		Studio studio1= new Studio();
		studio1.setStudioName("Paramount Picture");
		studio1.setCity("Delhi");
	//	System.out.println(school.getSchoolAddress());
		studios[1]=studio1;
		
		Studio studio2= new Studio();
		studio2.setStudioName("warner Bros");
		studio2.setCity("Kolkata");
	//	System.out.println(school.getSchoolAddress());
		studios[2]=studio2;
		
		Studio studio3= new Studio();
		studio3.setStudioName("Sony pictures");
		studio3.setCity("siligure");
	//	System.out.println(school.getSchoolAddress());
		studios[3]=studio3;
		
		Studio studio4= new Studio();
		studio4.setStudioName("Universal Picture");
		studio4.setCity("London");
	//	System.out.println(school.getSchoolAddress());
		studios[4]=studio4;
		
		


		for(int i=0;i<studios.length;i++){
			System.out.println("Studio======="+(i+1));
			Studio localStudio= studios[i];
			System.out.println(localStudio.getStudioName());
			System.out.println(localStudio.getCity());
			System.out.println();
		}
	}
}

		
