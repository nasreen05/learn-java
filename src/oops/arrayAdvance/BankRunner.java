package oops.arrayAdvance;

class BankRunner{
    public static void main(String[] args) {
        Bank[] banks = new Bank[5];

        Bank bank1 = new Bank();
         bank1.setName("SBI"); 
         bank1.setMarketAdd("Kolkata");

        Bank bank2 = new Bank();
         bank2.setName("HDFC");
          bank2.setMarketAdd("Delhi");

        Bank bank3 = new Bank();
         bank3.setName("ICICI"); 
         bank3.setMarketAdd("Mumbai");

        Bank bank4 = new Bank();
         bank4.setName("Axis");
          bank4.setMarketAdd("Chennai");

        Bank bank5 = new Bank(); 
        bank5.setName("Kotak"); 
        bank5.setMarketAdd("Jaipur");

        for(int i=0; i<banks.length;i++){
            if(i==0){
             banks[i]=bank1; 
        }else if(i==1){
         banks[i]=bank2;
          }
            if(i==1){ 
                banks[i]=bank2;
                 }else if(i==2){
                  banks[i]=bank3;
                   }else if(i==3){ 
                    banks[i]=bank4;
                    }else if(i==4){
                     banks[i]=bank5; }
        }
        for(int i=0;i<banks.length;i++){
            Bank bank=banks[i];
            if(bank !=null){
                System.out.println("Bank name");
                System.out.println(bank.getName());
                System.out.println("Bank MarketAddress");
                System.out.println(bank.getMarketAdd());
                System.out.println();
            }
        }
    }
}
