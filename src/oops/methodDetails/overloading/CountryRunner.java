package oops.methodDetails.overloading;

class CountryRunner{

    public static void main(String[] args){

        Country cont = new Country();
        cont.setName("India");

        System.out.println("Country name is " + cont.getName());

        cont.setNumberofStates(28);

        System.out.println("in india no of states" + cont.getNumberOfStates());

        cont.setPrimeMinister("Narenda Modi");

        System.out.println("India prime minister is: " + cont.getPrimeMinister());

        

        State s1 = new State();
        s1.setChiefMinister("Shiddaramaya");
        s1.setNoOfDistrics(31);
        s1.setNoOfMLAS(276);

        System.out.println("Karanata chief Minister is " + s1.getChiefMinister());
        System.out.println("In karnataka total districs " + s1.getNoOfDistrics());
        System.out.println("karnataka total MALS " + s1.getNoOfMLAS());

        State states[] = new State[30];
        s1.setName("Karnataka");

        states[0] = s1;

       State s2 = new State();
        s2.setName("Rajasthan");
          states[1] = s2;

          State s3 = new State();
        s3.setName("Andhra Pradesh");
          states[2] = s3;

          State s4 = new State();
        s4.setName("Arunachal Pradesh");
          states[3] = s4;

          State s5 = new State();
        s5.setName("Assam");
          states[4] = s5;

          State s6 = new State();
        s6.setName("Bihar");
          states[5] = s6;

          State s7 = new State();
s7.setName("Chhattisgarh");
states[6] = s7;

State s8 = new State();
s8.setName("Goa");
states[7] = s8;

State s9 = new State();
s9.setName("Gujarat");
states[8] = s9;

State s10 = new State();
s10.setName("Haryana");
states[9] = s10;

State s11 = new State();
s11.setName("Himachal Pradesh");
states[10] = s11;

State s12 = new State();
s12.setName("Jharkhand");
states[11] = s12;

State s13 = new State();
s13.setName("Kerala");
states[12] = s13;

State s14 = new State();
s14.setName("Madhya Pradesh");
states[13] = s14;

State s15 = new State();
s15.setName("Maharashtra");
states[14] = s15;

State s16 = new State();
s16.setName("Manipur");
states[15] = s16;

State s17 = new State();
s17.setName("Meghalaya");
states[16] = s17;

State s18 = new State();
s18.setName("Mizoram");
states[17] = s18;

State s19 = new State();
s19.setName("Nagaland");
states[18] = s19;

State s20 = new State();
s20.setName("Odisha");
states[19] = s20;

State s21 = new State();
s21.setName("Punjab");
states[20] = s21;

State s22 = new State();
s22.setName("Sikkim");
states[21] = s22;

State s23 = new State();
s23.setName("Tamil Nadu");
states[22] = s23;

State s24 = new State();
s24.setName("Telangana");
states[23] = s24;

State s25 = new State();
s25.setName("Tripura");
states[24] = s25;

State s26 = new State();
s26.setName("Uttar Pradesh");
states[25] = s26;

State s27 = new State();
s27.setName("Uttarakhand");
states[26] = s27;

State s28 = new State();
s28.setName("West Bengal");
states[27] = s28;






        cont.setStates(states);

        System.out.println("country names and it's states");

        State[] countryStates = cont.getStates();

        for(int i = 0; i<countryStates.length; i++){
            State state = countryStates[i];
            if(state !=null) {
                System.out.println("The states are "+ i + ") " + state.getName());
            }
        }

        
    }
}