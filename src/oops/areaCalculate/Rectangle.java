package Area;

public class Rectangle extends Area{

    private int length;
    private int breadth;

    public Rectangle(){

    }

    public Rectangle(int length , int breadth){
        this.length=length;
        this.breadth=breadth;

    }
    protected void findArea() {
        int area = length * breadth;
        System.out.println("Area of the Rectangle is" + area);
    }

    /*public String tostring (){
  //   return "Rectangle length"+length+"breadth"+ breath;
 //   }*/

}

