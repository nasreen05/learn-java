package oops.methodConcept.basicProgram;
class Girl{
    String name;
    long phone;
    byte age;
}
class Harshitt {
    static void saveGirlName(String name) {
        System.out.println("Girl Name Sunny" + name);
    }

    static void saveGirlNumber(long phone) {
        System.out.println("Harshit sharing the girl Number");
    }

    static void saveGirlsNumber(long[] arr) {
        System.out.println("Harshit saving the phone number");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Saving number" + arr[i]);
        }
    }

    static void savaGirlDetails(Girl g) {
        System.out.println("Harshit is saving girl Details");
        System.out.println("Name :" + g.name);
        System.out.println("Phone :" + g.phone);
        System.out.println("Age :" + g.age);
    }
}

public class Deepak {
    public static void main(String[] args) {
        System.out.println("Now Deepak receiver the phone number and dailing that number");
        Harshitt.saveGirlName("Reshma");
        System.out.println("Now Deepaak  receive all the phone number");
        Harshitt.saveGirlNumber(8634287164l);
        System.out.println("Deepak sharing all the phone numbers to HArshit");
       long[] arr ={98645875l, 987532495l,89750938523490l,8768324975l};
       Harshitt.saveGirlsNumber(arr);
        System.out.println("Deepak sharing girl details with Harshit");
        Girl g= new Girl();
         g.name="Reshma";
         g.phone=983473298l;
         g.age=25;
        Harshitt.savaGirlDetails(g);
    }
}
