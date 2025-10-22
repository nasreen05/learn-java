package oops.arrayAdvance;

class Makeup{
	
    private String name;
    private String companyName;
    private int price;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Corrected setter name to follow setCompanyName()
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getCompanyName() {
        return companyName;
    }

    // Corrected getter for price following "getPrice"
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
