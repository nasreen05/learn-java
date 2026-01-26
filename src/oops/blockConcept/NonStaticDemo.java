package oops.blockConcept;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.imageio.stream.ImageInputStream;

public class NonStaticDemo {
    static int i;
    NonStaticDemo(){
        System.out.println("Constructor () executed i; "+i);
        i=10;
    }
    {
        System.out.println("non static block executed i :"+i);
        i=20;
    }
    static {
        System.out.println("Static block executed i :"+ i);
        i=30;
}
void m() {
    System.out.println("m() executed i :"+i);
    i = 40;
}

    public static void main(String[] args) {
        System.out.println("Main() executed i "+ i);
        NonStaticDemo nb1= new NonStaticDemo();
        System.out.println("Inside main() after object creation "+i);
        nb1.m();
        System.out.println("inside main() after m() called i"+ i);


    }

    }

