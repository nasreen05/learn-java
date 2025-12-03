package basic.operatorPrograms;

public class TrafficSignal {
  public static void main(String[] args) {
    int signal = 5;
    String traffic = checkTrafficSignal(signal);
    System.out.println(traffic);
  }

  public static String checkTrafficSignal(int signal) {
    if (signal == 0) {
      // System.out.println("Stop");
      return "stop";
    }
    if (signal == 1) {
      // System.out.println("ready to go");
      return "ready to go";
    }
    if (signal == 2) {
      // System.out.println("Stop");
      return "Go";
    }
    return "Invalid signal option";
  }
}


//calculateGrade(int marks)
//enterExamination