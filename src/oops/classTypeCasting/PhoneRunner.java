package ClassTypeCasting;

import com.sun.org.apache.xpath.internal.operations.And;

class Phone{

}
class AndroidPhone extends  Phone{

}
class IPhone extends  Phone{

}
class PhoneRunner{
    public static void main(String[]args){

        Phone phone=new AndroidPhone();
        Phone phonee =new IPhone();

        System.out.println(phone instanceof AndroidPhone);
        System.out.println(phone instanceof IPhone);

       AndroidPhone androidPhone=(AndroidPhone) phone;
       IPhone iPhone=(IPhone) phonee;


        }


    }

