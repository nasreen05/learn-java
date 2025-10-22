package Account;

         class PersonalAccount  extends  Account {

        private String panNumber;

        public PersonalAccount(int accountNumber, String holderName, double balance, String panNumber) {
            super(accountNumber, holderName, balance);
            this.panNumber = panNumber;
        }
        public PersonalAccount(){



        }
    }
