package oops.abstractionConcept;
    public class College extends Abstraction.University {
            public String name;
            public College(){}
            public College(String name, String universityName){
                super(universityName);
                this.name=name;

            }
            @Override
            public void examination() {
                System.out.println("Conduction final examination");
            }

            public void InternalTest(){
                System.out.println("Internal test / assessment conducted by college");
            }
        }
