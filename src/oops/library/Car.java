package library;

public class Car {

        private String model;
        private String brand;
        private int year;

        public Car(String model, String brand, int year) {
            this.model = model;
            this.brand = brand;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Car [Model=" + model + ", Brand=" + brand + ", Year=" + year + "]";
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Car) {
                Car c = (Car) obj;
                return this.model.equals(c.model) && this.brand.equals(c.brand);
            }
            return false;
        }
    }

