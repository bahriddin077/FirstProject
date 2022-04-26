package model;

    public class Account {

        private String id;
        private String name;
        private int balance;

        public Account(String id, String name, int balance) {
            this.id = id;
            this.name = name;
            this.balance = balance;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public int credit(int amount) {
            if (balance < amount) {
                System.out.println("Balans yetarli emas.");
            } else {
                balance -= amount;
            }
            return balance;
        }

        public int debit(int amount) {
            balance += amount;
            return balance;
        }

        public int transferTo(Account another, int amount) {
            if (balance < amount) {
                System.out.println("Balans yetarli emas");
            } else {
                balance -= amount;
                another.balance += amount;
            }
            return balance;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", balance=" + balance +
                    '}';
        }

        public void addCredit(double avtocredit) {

        }
    }
