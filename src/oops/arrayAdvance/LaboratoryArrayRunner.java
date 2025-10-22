package oops.arrayAdvance;

class LaboratoryArrayRunner{
 public static void main(String[] args) {
        Laboratory[] laboratorys = new Laboratory[5];

        Laboratory  laboratory = new Laboratory();      
        laboratory.setLabName("software eng..");
        laboratory.setField("CSE");
        laboratorys[0] = laboratory;

        Laboratory  laboratory1= new Laboratory();      
        laboratory1.setLabName("Biochemistry Lab");
        laboratory1.setField("Biology");
        laboratorys[1] = laboratory1;

         Laboratory  laboratory2 = new Laboratory();      
        laboratory2.setLabName("Physics Research Lab");
        laboratory2.setField("Physics");
        laboratorys[2] = laboratory2;
        
         Laboratory  laboratory3 = new Laboratory();      
        laboratory3.setLabName("Microbiology Lab");
        laboratory3.setField("Microbiology");
        laboratorys[3] = laboratory3;

        Laboratory  laboratory4 = new Laboratory();      
        laboratory4.setLabName("Forensic Science Lab");
        laboratory4.setField("MBBS");
        laboratorys[4] = laboratory4;


          

        for (int i = 0; i <laboratorys.length; i++) {
            System.out.println("Laboratory " + (i + 1) + ":");
            Laboratory localLaboratory = laboratorys[i];
            System.out.println("Name: " + localLaboratory.getLabName());
            System.out.println("Location: " + localLaboratory.getField());
            System.out.println();
        }
    }
}	
