package oops.arrayAdvance;

class FactoryArrayRunner{
	public static void main(String[] args) {
        Factory[] factorys = new Factory[5];

        Factory factory = new Factory();
        factory.setFactoryName("Kabhi");
        factory.setLocation("Delhi");
        factorys[0] = factory;

        Factory factory1 = new Factory();
        factory1.setFactoryName("Kabhi");
        factory1.setLocation("Delhi");
        factorys[1] = factory;
       
        Factory factory2 = new Factory();
        factory2.setFactoryName("Kabhi");
        factory2.setLocation("Delhi");
        factorys[2] = factory;

         Factory factory3 = new Factory();
        factory3.setFactoryName("Kabhi");
        factory3.setLocation("Delhi");
        factorys[3] = factory;

         Factory factory4 = new Factory();
        factory4.setFactoryName("Kabhi");
        factory4.setLocation("Delhi");
        factorys[4] = factory;

        for (int i = 0; i < factorys.length; i++) {
            System.out.println("Factory " + (i + 1) + ":");
            Factory localFactory = factorys[i];
            System.out.println("Name: " + localFactory.getFactoryName());
            System.out.println("Location: " + localFactory.getLocation());
            System.out.println();
        }
    }
}

