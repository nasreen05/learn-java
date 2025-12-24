package basic.array.arrayAdvance;

class MedicineRunner{
   
    public static void main(String[] args) {
        Medicine[] medicines = new Medicine[5];

        Medicine medicine1 = new Medicine();
        medicine1.setMedicineName("Paracetamol");
        medicine1.setCompanyName("Cipla");

        Medicine medicine2 = new Medicine();
        medicine2.setMedicineName("Ibuprofen");
        medicine2.setCompanyName("Lupin");

        Medicine medicine3 = new Medicine();
        medicine3.setMedicineName("Amoxicillin");
        medicine3.setCompanyName("Mankind Pharma");

        Medicine medicine4 = new Medicine();
        medicine4.setMedicineName("Cetirizine");
        medicine4.setCompanyName("Zydus Lifescience");

        Medicine medicine5 = new Medicine();
        medicine5.setMedicineName("Azithromycin");
        medicine5.setCompanyName("Applo Pharma");

        for (int i = 0; i < medicines.length; i++) {
            if (i == 0) {
                medicines[i] = medicine1;
            } else if (i == 1) {
                medicines[i] = medicine2;
            }
            if (i == 1) {
                medicines[i] = medicine2;
            } else if (i == 2) {
                medicines[i] = medicine3;
            } else if (i == 3) {
                medicines[i] = medicine4;
            } else if (i == 4) {
                medicines[i] = medicine5;
            }
        }

        for (int i = 0; i < medicines.length; i++) {
            Medicine medicine = medicines[i];
            if (medicine != null) {
                System.out.println("Medicine Name");
                System.out.println(medicine.getMedicineName());
                System.out.println("Company Name");
                System.out.println(medicine.getCompanyName());
                System.out.println();
            }
        }
    }
}
