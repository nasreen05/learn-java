package oops.arrayAdvance;

class EyeHospitalRunner {
   

    public static void main(String[] args) {
        EyeHospital hospital1 = new EyeHospital("SightCare", 5001L, "Bengaluru", 15, true);
        System.out.println(hospital1.getName());
        System.out.println(hospital1.getId());
        System.out.println(hospital1.city());
        System.out.println(hospital1.getNumberOfOphthalmologists());
        System.out.println(hospital1.getHasEmergencyServices());

        System.out.println();

        EyeHospital hospital2 = new EyeHospital("VisionPlus", 5002L, "Chennai", 12, false);
        System.out.println(hospital2.getName());
        System.out.println(hospital2.getId());
        System.out.println(hospital2.city());
        System.out.println(hospital2.getNumberOfOphthalmologists());
        System.out.println(hospital2.getHasEmergencyServices());

        System.out.println();

        EyeHospital hospital3 = new EyeHospital("EyeCare", 5003L, "Mumbai", 18, true);
        System.out.println(hospital3.getName());
        System.out.println(hospital3.getId());
        System.out.println(hospital3.city());
        System.out.println(hospital3.getNumberOfOphthalmologists());
        System.out.println(hospital3.getHasEmergencyServices());

        System.out.println();

        EyeHospital hospital4 = new EyeHospital("ClearSight", 5004L, "Delhi", 20, false);
        System.out.println(hospital4.getName());
        System.out.println(hospital4.getId());
        System.out.println(hospital4.city());
        System.out.println(hospital4.getNumberOfOphthalmologists());
        System.out.println(hospital4.getHasEmergencyServices());

        System.out.println();

        EyeHospital hospital5 = new EyeHospital("BrightVision", 5005L, "Kolkata", 10, true);
        System.out.println(hospital5.getName());
        System.out.println(hospital5.getId());
        System.out.println(hospital5.city());
        System.out.println(hospital5.getNumberOfOphthalmologists());
        System.out.println(hospital5.getHasEmergencyServices());
    }
}

