package oops.encapsulation;

public class Shoe {
        public String brand;
        private double price;
        private String color;
        private int size;
        private String type;

        // Constructor
        public Shoe(String brand, double price, String color, int size, String type) {
            this.brand = brand;
            this.price = price;
            this.color = color;
            this.size = size;
            this.type = type;
        }

        // Getters
        public double getPrice() {
            return price;
        }

        public String getColor() {
            return color;
        }

        public int getSize() {
            return size;
        }

        public String getType() {
            return type;
        }

        // Setters
        public void setPrice(double price) {
            this.price = price;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

