package oops.encapsulation;

public class InstagramTest {
    public static void main(String[] args) {
        Instagram i = new Instagram("Smith", "smith44", 98372493247l, "smith@123");
        System.out.println("user name is :" + i.userName);
        System.out.println("password is :" + i.getPassword());
        System.out.println("email is :" + i.getEmail());
        System.out.println("mobile is :" + i.getMobNo());
        i.setPassword("smith3333");
        System.out.println("updated password is :" + i.getPassword());
    }

    }