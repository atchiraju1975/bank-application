package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> branchCustomers = new ArrayList<Customer>();

    public Branch(String name, String customerName) {
        this.name = name;
        branchCustomers = new ArrayList<Customer>();
        boolean statusOfCustomerAddition = addCustomer(customerName,150.00);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }

    public boolean addCustomer(String customerName, double initialAmount){
        if (findCustomer(customerName)==null){
            this.branchCustomers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }
    public boolean removeCustomer(String customerName){
        this.branchCustomers.remove(customerName);
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer!=null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i=0;i<this.branchCustomers.size();i++){
            Customer checkedCustomer = this.branchCustomers.get(i);

            if (checkedCustomer.getName()==customerName){
                return branchCustomers.get(i);
            }
        }
        return null;
    }

    public boolean displayCustomers(Branch branch){
        for(Customer c: branch.branchCustomers){
            int i = branch.branchCustomers.indexOf(c);
            System.out.println("Customer "+ i + branch.branchCustomers.get(i).getName());
            return true;
        }
        return false;
    }

}
