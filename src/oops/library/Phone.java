package library;

public class Phone {
  private String brand;
  private String model;
  private double price;

  public Phone(String brand, String model, double price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Phone [Brand=" + brand + ", Model=" + model + ", Price=" + price + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Phone) {
      Phone p = (Phone) obj;
      return this.brand.equals(p.brand) && this.model.equals(p.model);
    }
    return false;
  }
    }

