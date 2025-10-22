package college;

public class HodRunner {
    public static void main(String[] args) {

        // --- College Array Example ---
        College[] colleges = new College[5];

        colleges[0] = new College();
        colleges[0].setCollegeName("Aliah University");
        colleges[0].setGrade('A');

        colleges[1] = new College();
        colleges[1].setCollegeName("Jadavpur University");
        colleges[1].setGrade('B');

        colleges[2] = new College();
        colleges[2].setCollegeName("Calcutta Medical College");
        colleges[2].setGrade('C');

        colleges[3] = new College();
        colleges[3].setCollegeName("North Bengal University");
        colleges[3].setGrade('D');

        colleges[4] = new College();
        colleges[4].setCollegeName("Presidency University");
        colleges[4].setGrade('A');

        // Print Colleges
        System.out.println("===== College List =====");
        for (int i = 0; i < colleges.length; i++) {
            if (colleges[i] != null) {
                System.out.println("College " + (i + 1));
                System.out.println("Name  : " + colleges[i].getCollegeName());
                System.out.println("Grade : " + colleges[i].getGrade());
                System.out.println();
            }
        }

        // --- HOD Array Example ---
        Hod[] hods = new Hod[3];

        hods[0] = new Hod("Aliah University", 'A',
                "Computer Science", 101, "AI Lab", "Dr. Rahman", 9001);

        hods[1] = new Hod("Jadavpur University", 'B',
                "Mechanical Engineering", 102, "Robotics Lab", "Prof. Ghosh", 9002);

        hods[2] = new Hod("Calcutta Medical College", 'C',
                "Physics", 103, "Quantum Lab", "Dr. Banerjee", 9003);

        // Print HODs
        System.out.println("===== HOD List =====");
        for (int i = 0; i < hods.length; i++) {
            System.out.println("HOD " + (i + 1));
            hods[i].showDetails();
            System.out.println();
        }
    }
}

