package Area;

public class Circle extends  Area{
    private final  float PIE =3.14f;
    private  int radius;

    public Circle() {
    }
    public  Circle(int radius) {
        this.radius = radius;
    }
    protected  void findArea(){
        float area = PIE * radius *radius;
        System.out.println("Area of the circle  is "+area);
    }
}

