package oops.arrayAdvance;

class Phone{
	
    private String name;
    private String color;
    private float price;
    private int phoneId;
    private Company company;  

    public Phone(String name, String color, float price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public Phone(String name, String color, float price, int phoneId) {
        this(name, color, price);       
        this.phoneId = phoneId;       
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public float getPrice() {
        return price;
    }

    public int getPhoneId() {
        return phoneId;
    }
}

