package advance.collectionConcept.wrapperConcept;

public class WrapperClassDemo {
  public static void main(String[] args) {

    // Wrapper class - Primitive type to object or object to Primitive type
    // Wrapper classes - will be used in collections

    int a = 10;
    Integer a1 = new Integer(10);
    long b = 20;
    Long b1 = new Long(20);
    float c = 10.40f;
    Float c1 = new Float(10.40);
    double d = 23.45;
    Double d1 = new Double(23.45);
    char e = 'a';
    Character e1 = new Character('a');
    byte f = 3;
    Byte f1 = new Byte((byte) 3);
    short g = 56;
    Short g1 = new Short((short) 56);
    boolean h = true;
    Boolean h1 = new Boolean(true);
    System.out. println("Primitive types Value==========");



      System.out. println("Int"+a1);
      System.out. println("Long"+b1);
      System.out. println("Float"+c1);
      System.out. println("Double"+d1);
      System.out. println("Character"+e1);
      System.out. println("Byte"+f1);
      System.out. println("Short"+g1);
      System.out. println("Boolean"+h1);

      a1.intValue();
      b1.longValue();
      c1.floatValue();
      d1.doubleValue();
      e1.charValue();
      f1.byteValue();
      g1.shortValue();
      h1.booleanValue();

    }
}
//new Wrapper to wrapper class - wrapper class
//xxxValue()  -intValue(), floatValue() -Wrapper class to primitiive
//Parsexxx() - parseInt() , parseDouble(),  String class to primetive
// value Of() - primitive to wrapper class
//toString() - Wrapper class to String

// Conversion to primitive  to 