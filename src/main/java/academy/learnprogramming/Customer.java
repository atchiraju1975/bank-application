package academy.learnprogramming;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transactionAmount){

        this.transactions.add(transactionAmount);
        return;

    }

    public void removeTransaction(double transactionAmount){

        this.transactions.remove(transactionAmount);

        return;

    }

    public void displayTransactions(){
for(double d : this.transactions){
    int i = this.transactions.indexOf(d);
    System.out.println(" Transaction "+ i + this.transactions.get(i));
}
    }

}
