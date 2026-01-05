package oops.exceptionConcept;

public class UserDefinedException {
    public static void main(String[] args) {
        int age = 17;
//        try {
        voting(age);
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println(e);
//        }
    }
    public static void voting(int age)  {
        if (age >= 18) {
            System.out.println("voting is eligible");
        } else {
            System.out.println("Not eligible for voting");
//            throw new InvalidAgeException("Not eligible for voting and age is" + age);
            throw new InvalidAgeException();
        }
    }
}

