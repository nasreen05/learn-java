package Family;

public class Father extends GrandFather {
    public String name;

    public void familyDetails() {

        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        name = "Nagarjune";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        name = "Akkinneni";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
