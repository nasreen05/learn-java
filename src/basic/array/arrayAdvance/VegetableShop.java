package basic.array.arrayAdvance;

class VegetableShop {
    private String name;
    private long id;
    private String city;
    private int numberOfVegetables;
    private boolean isOpen;

    public VegetableShop() { }

    public VegetableShop(String name, long id) {
        System.out.println("Initialize name, id");
        this.name = name;
        this.id = id;
    }

    public VegetableShop(String name, long id, String city) {
        this(name, id);
        System.out.println("Initialize city");
        this.city = city;
    }

    public VegetableShop(String name, long id, String city, int numberOfVegetables) {
        this(name, id, city);
        System.out.println("Initialize numberOfVegetables");
        this.numberOfVegetables = numberOfVegetables;
    }

    public VegetableShop(String name, long id, String city, int numberOfVegetables, boolean isOpen) {
        this(name, id, city, numberOfVegetables);
        System.out.println("Initialize isOpen");
        this.isOpen = isOpen;
    }

    public String getName() {
		return name;
		}
    public long getId() {
		return id;
		}
    public String city() {
		return city;
		}
    public int getNumberOfVegetables() { 
	return numberOfVegetables;
	}
    public boolean getIsOpen() { 
	return isOpen; 
	}
}
