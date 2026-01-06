package oops.constructorConcept.constructorOverload;

import javax.net.ssl.HostnameVerifier;

public class Hopital {
    final int id;
    String name;

    Hopital(int idNo) {
        id = idNo;
    }

    Hopital(String n, int id1) {
        id = id1;
        name = n;

    }

    void details() {
        System.out.println("Name :" + name);
        System.out.println("Id :" + id);

    }
}
    class Cnmc{
        public static void main(String[] args) {
            Hopital h1= new Hopital(201);
            h1.name="CNMC ";
            h1.details();
            Hopital h2=new Hopital(202);
            h2.name="KMC";
            h2.details();
        }
    }


