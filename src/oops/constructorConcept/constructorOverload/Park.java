package oops.constructorConcept.constructorOverload;

public class Park {
    final int roomNo;
    String name;

    Park(int reg) {
        roomNo=reg;
    }
        Park(String n, int reg){
            name = n;
            roomNo = reg;
        }

    void details() {
        System.out.println(name);
        System.out.println(roomNo);

    }
    }

    class EcoPark {
        public static void main(String[] args) {
            Park p1 = new Park("Eco Park", 505);
            p1.name="Eco park";
            p1.details();
            Park p2 = new Park("Neco Park", 506);
          p2.name="Neco park";
            p2.details();
        }
    }

