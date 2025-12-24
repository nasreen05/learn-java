package basic.array.arrayAdvance;

class VegetableShopRunner {

    public static void main(String[] args) {
     
        VegetableShop shop1 = new VegetableShop("GreenFresh", 101L, "Bengaluru", 8, true);
        System.out.println(shop1.getName());
        System.out.println(shop1.getId());
        System.out.println(shop1.city());
        System.out.println(shop1.getNumberOfVegetables());
        System.out.println(shop1.getIsOpen());

        System.out.println();

        VegetableShop shop2 = new VegetableShop("VeggieMart", 102L, "Delhi", 5, false);
        System.out.println(shop2.getName());
        System.out.println(shop2.getId());
        System.out.println(shop2.city());
        System.out.println(shop2.getNumberOfVegetables());
        System.out.println(shop2.getIsOpen());

        System.out.println();

        VegetableShop shop3 = new VegetableShop("FreshVegetables", 103L, "Mumbai", 10, true);
        System.out.println(shop3.getName());
        System.out.println(shop3.getId());
        System.out.println(shop3.city());
        System.out.println(shop3.getNumberOfVegetables());
        System.out.println(shop3.getIsOpen());

        System.out.println();

        VegetableShop shop4 = new VegetableShop("VeggieHub", 104L, "Kolkata", 7, false);
        System.out.println(shop4.getName());
        System.out.println(shop4.getId());
        System.out.println(shop4.city());
        System.out.println(shop4.getNumberOfVegetables());
        System.out.println(shop4.getIsOpen());

        System.out.println();

        VegetableShop shop5 = new VegetableShop("FreshHarvest", 105L, "Chennai", 12, true);
        System.out.println(shop5.getName());
        System.out.println(shop5.getId());
        System.out.println(shop5.city());
        System.out.println(shop5.getNumberOfVegetables());
        System.out.println(shop5.getIsOpen());
    }
}
