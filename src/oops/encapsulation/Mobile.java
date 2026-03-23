package oops.encapsulation;

public class Mobile {
       private String brand;
        private double price;
        private int ram;
        private int rom;

        // Constructor
        public Mobile(String brand, double price, int ram, int rom) {
            this.brand = brand;
            this.price = price;
            this.ram = ram;
            this.rom = rom;
        }

        // Getters
        public String getBrand() {
            return brand;
        }

        public double getPrice() {
            return price;
        }

        public int getRam() {
            return ram;
        }

        public int getRom() {
            return rom;
        }

        // Setters
        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public void setRom(int rom) {
            this.rom = rom;
        }
    }

