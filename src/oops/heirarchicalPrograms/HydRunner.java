package Heirarchical;

public class HydRunner {

    public static  void main(String[] args){
        HydrabadiBiryani biryani = new HydrabadiBiryani("Basmathi",   "Hyderabadi", 250);
        biryani.details();

System.out.println("-------------------------");

        DumBiryani dumBiryani = new DumBiryani("Banglore ",  "Dum",  250);
        dumBiryani.details();

    }
}

