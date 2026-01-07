package oops.abstractionConcept;
abstract  class   Animal1{

    public  abstract  void sound();

    public void  sleep(){
        System.out.println("Animal makes sound");
    }

        }

        class Dog1 extends  Animal1{
    @Override
            public void sound(){
        System.out.println("Dogs sound like:boow boow");

    }
        }

        class RunnerAnimal{
    public static void main(String[]args){

        Animal1 animal=new Dog1();

        animal.sound();
        animal.sleep();
    }
        }