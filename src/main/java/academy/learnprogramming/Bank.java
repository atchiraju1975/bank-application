package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> bankBranches;

    public Bank(String name, String defaultBranch) {
        this.name = name;
        bankBranches = new ArrayList<Branch>();
        addNewBranch(defaultBranch);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBankBranches() {
        return bankBranches;
    }

    public boolean addNewBranch(String branchName){
        if(findBranch(branchName)==null){
        this.bankBranches.add(new Branch(branchName,"mike"));
        return true;}
        return false;
    }

    public boolean removeBranch(String branchName){
        this.bankBranches.remove(branchName);
        return true;
    }

    public boolean listBranch(Bank bank){
        for(Branch b : bank.bankBranches){
            int i = bank.bankBranches.indexOf(b);
            System.out.println("Branch "+i + bank.bankBranches.get(i).getName());
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName,String customerName,double initialAmount){
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null){
            return existingBranch.addCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null){
            return existingBranch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for(int i=0;i< bankBranches.size();i++){
            if(bankBranches.get(i).getName()==branchName){
                return bankBranches.get(i);
            }
        }
        return null;
    }

}
