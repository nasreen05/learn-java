package basic.stringPrograms;

public class Exercise3 {
  public static void main(String[] args) {
    String name = "Dear <|name|> , thanks a lot";
   name= name.replace("<|name|>", "Harry");
    System.out.println(name);
  }
}