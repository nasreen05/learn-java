package basic.controlStatement.decisionMakingStatement;

public class MovieTicketPrice {
    public static void main(String[] args){
        int basePrice=200;
        int age=11;
        String st="Morning";
        String st1="Saturday";
        String st2="Sunday" ;
        boolean membershipCard=true;
        if (age < 12) {
      System.out.println("50% Discount");

      }else if (age > 60) {
        System.out.println("40% Discount");
      }
        if(st.equalsIgnoreCase("morning")){
          System.out.println("extra 10% Discount");
      if (st1.equalsIgnoreCase("Saturday") && st2.equalsIgnoreCase("Sunday")) {
     }else{
        System.out.println("no extra discount allowed");
          }
      }
          if(membershipCard){
              System.out.println("no extra discounts");
            }else{
              System.out.println("No discount , try next time ");
          }
          }
        }


