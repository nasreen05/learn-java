package oops.interfacePrograms;
public class RBIRunner {
    public static void main (String [] args){
        RBI rbi = new SBI();
        rbi.OpenAccount("Raj","Shivamogga");

        System.out.println(rbi.getRateOfInterset());
        if(rbi instanceof SBI){
            SBI sbi1= (SBI) rbi;
            System.out.println("NAme of the Account holder is " + sbi1.getName());
        }

        SBI sbi2 =  new SBI();
        sbi2.OpenAccount("Shuraj", "Mysur");
        System.out.println(sbi2.getName());
        System.out.println(sbi2.getRateOfInterset());

        String bankName = "SBI";

        if(bankName == "SBI"){
            SBI sbi3 = new SBI();
        }else if (bankName=="ICICI"){
      ICICI icic = new ICICI();
            //icic.OpenAccount();
        }
    }
}