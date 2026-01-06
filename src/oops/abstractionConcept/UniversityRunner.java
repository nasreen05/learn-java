package oops.abstractionConcept;

public class UniversityRunner {
  public static void main(String[] args) {

    // University university1= new University();
    // university1.examination();
    // shape- area()- if circle =rectagle
    // Tight cupling
    // Shap- circle , Rectangle

    College college = new College();
    college.examination();
    college.InternalTest();

    Abstraction.University university = new College();
    // Implementation Object
    // Loosen Coupling

    university.examination();
    //    university.internalTest();

    if (university instanceof College) {
      College college1 = (College) university;
      college1.InternalTest();
      college1.examination();
    }
   }
   }














   /*  College coll = new College("SDC", "bnu");
    coll.examination();
    coll.InternalTest();
    System.out.println("the college name " + coll.name);
    System.out.println("the univercity" + coll.universityName);
    // upcasting
    University uni = new College();

    uni.examination();
    // down casting
    if (uni instanceof College) {
      College college = (College) uni;
      college.InternalTest();
      college.examination();
    }
  }
        }
*/