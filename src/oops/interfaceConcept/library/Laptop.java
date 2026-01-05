package library;

public class Laptop {
        private String brand;
        private String processor;
        private int ram;

        public Laptop(String brand, String processor, int ram) {
            this.brand = brand;
            this.processor = processor;
            this.ram = ram;
        }

        @Override
        public String toString() {
            return "Laptop [Brand=" + brand + ", Processor=" + processor + ", RAM=" + ram + "GB]";
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Laptop) {
                Laptop l = (Laptop) obj;
                return this.brand.equals(l.brand) && this.processor.equals(l.processor);
            }
            return false;
        }
    }


