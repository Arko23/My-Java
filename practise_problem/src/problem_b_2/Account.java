package problem_b_2;

public class Account {

        private double amount;
        private int id;
        private String name;
        public Account(String n , int i , double a) {
            this.name = n;
            this.id = i;
            this.amount = a;
        }
        public void withDraw(double c) {
            this.amount-=c;
            System.out.println("Withdraw amount : "+c+"\nCurrent balance : "+amount);
        }
        public void deposit(double d) {
            this.amount+=d;
            System.out.println("Deposit amount : "+d+"\nCurrent balance : "+amount);
        }
        public int getId() {
            return id;
        }
        public int setId(int newId) {
            this.id = newId;
            return id;
        }
        public String getName() {
            return name;
        }
        public String setName(String n) {
            this.name = n;
            return name;
        }
        public double getAmount() {
            return amount;
        }
        public double setAmount(double newMoney) {
            this.amount = newMoney;
            return amount;
        }
    }

