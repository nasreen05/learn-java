package ClassTypeCasting;

public class Cafe {

    public Beverage vendingMachine(int choice){
        Beverage beverage;

        if(choice ==1){
            beverage= new Tea();
            }else if(choice ==2){
            beverage=new Coffee();
            }else {
            beverage=null;
            }
        return beverage;

            }
        }

