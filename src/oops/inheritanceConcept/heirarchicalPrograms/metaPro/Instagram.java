package oops.inheritanceConcept.heirarchicalPrograms.metaPro;
public class Instagram extends Meta {

    int noOfFollowers;

    public Instagram(String userName, String password, int noOfFollowers){
        super(userName, password);
        this.noOfFollowers = noOfFollowers;
    }

    public void displayInstagram(){
        System.out.println("Instagram details are");
        System.out.println("User name is: " + userName);
        System.out.println("Password is: " + password);
        System.out.println("No of followers: " + noOfFollowers);
        System.out.println("--------------------------");
    }
}

