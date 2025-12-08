package basic.controlStatement.loopsConcept.whileLoopConcept;

public class BusStandDoWhile {

        public static void main(String[] args) {

            int i = 2;
            int num = 1;

            do {

                if (i == 1 && num == 1) {
                    System.out.println("Daspara Bus Stand");
                }

                if (i == 2 && num == 2) {
                    System.out.println("City Market Bus Stand");
                }

                if (i == 3 && num == 3) {
                    System.out.println("Siliguri Bus Stand");
                }

                if (i == 4 && num == 4) {
                    System.out.println("Raiganchh Bus Stand");
                }

                if (i == 5 && num == 5) {
                    System.out.println("Islampur City Bus Stand");
                }

                num++;

            } while (num <= 5);
        }
    }

