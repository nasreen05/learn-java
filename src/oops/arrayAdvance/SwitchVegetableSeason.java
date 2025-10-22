package oops.arrayAdvance;

class SwitchVegetableSeason {
    public static void main(String[] args) {

        String vegetable = "Tomato";

        
        if (vegetable.equals("Tomato")) {
            System.out.println("Tomato is a Summer vegetable.");
        } else if (vegetable.equals("Cauliflower")) {
            System.out.println("Cauliflower is a Winter vegetable.");
        } else if (vegetable.equals("Pumpkin")) {
            System.out.println("Pumpkin is an Autumn vegetable.");
        } else if (vegetable.equals("Spinach")) {
            System.out.println("Spinach is a Winter vegetable.");
        } else if (vegetable.equals("Bitter Gourd")) {
            System.out.println("Bitter Gourd is a Rainy Season vegetable.");
        } else {
            System.out.println("Unknown vegetable.");
        }

       
        String season = "";

        switch (vegetable) {
            case "Tomato":
                season = "Summer";
                System.out.println("Tomato grows in: " + season);
                break;
            case "Cauliflower":
                season = "Winter";
                System.out.println("Cauliflower grows in: " + season);
                break;
            case "Pumpkin":
                season = "Autumn";
                System.out.println("Pumpkin grows in: " + season);
                break;
            case "Spinach":
                season = "Winter";
                System.out.println("Spinach grows in: " + season);
                break;
            case "Bitter Gourd":
                season = "Rainy Season";
                System.out.println("Bitter Gourd grows in: " + season);
                break;
            default:
                System.out.println("Season not found for vegetable: " + vegetable);
        }
    }
}
