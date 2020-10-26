package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println(" Welcome to Banking Software Setup and Maintain"+
                            "\n Select your Option to Proceed");

        boolean runTheApp = true;
        int selectedMainMenuOption;
       // boolean choiceEntered = false;

        while(runTheApp){

            selectedMainMenuOption = displayMainMenuOptionsToSelect();

            switch(selectedMainMenuOption){

                case 1:
                    int selectedBankMenuOption = displayBankOptions();
                    boolean bankSelectionStatus =  processBankSelection(selectedBankMenuOption);
                    if(bankSelectionStatus){
                    System.out.println("Processed Selected Bank Option Successfully");
                    }
                    else
                    {
                        System.out.println("Not Processed Selected Bank Option due to issues");
                    }
                    break;
                case 2:
                    int selectedBranchMenuOption = displayBranchOptions();
                    boolean branchSelectionStatus = processBranchSelection(selectedBranchMenuOption);

                    if(branchSelectionStatus){
                        System.out.println("Processed Selected Branch Option Successfully");
                    }
                    else
                    {
                        System.out.println("Not Processed Selected Branch Option due to issues");
                    }
                    break;
                case 3:
                    int selectedCustomerMenuOption = displayCustomerOptions();
                    boolean customerSelectionStatus = processCustomerSelection(selectedCustomerMenuOption);
                    if(customerSelectionStatus){
                        System.out.println("Processed Selected Customer Option Successfully");
                    }
                    else
                    {
                        System.out.println("Not Processed Selected Customer Option due to issues");
                    }
                    break;
                case 4:
                    int selectedTransactionMenuOption = displayTransactionOptions();
                    boolean transactionSelectionStatus = processTransactionSelection(selectedTransactionMenuOption);
                    if(transactionSelectionStatus){
                        System.out.println("Processed Selected Transaction Option Successfully");
                    }
                    else
                    {
                        System.out.println("Not Processed Selected Transaction Option due to issues");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the App");
                    runTheApp = false;
                    break;
                default:
                    System.out.println("No Valid Option Selected, Pls Select Valid Option");
                    break;

            }

        }


    }

    public static int displayMainMenuOptionsToSelect(){

        int INVALID_SELECTION = 5;

        System.out.println("Available Options: \n" +
                "1. Manage Bank \n" +
                "2. Manage Branch \n" +
                "3. Manage Customer \n" +
                "4. Manage Transactions \n" +
                "5. Exit Application");

        boolean choiceEntered = scanner.hasNextInt();
        if(choiceEntered){
            int mainMenuOption = scanner.nextInt();
            if (mainMenuOption > 0){
        return mainMenuOption;}
            else {
                System.out.println("Invalid Choice enetered terminating the program");
                return INVALID_SELECTION;
            }
        }
        else{
            System.out.println("Invalid Choice enetered terminating the program");
            return INVALID_SELECTION ;
        }
    }

    public static int displayBankOptions(){
        System.out.println("Select Bank Options :\n" +
                "1. Add New Bank \n" +
                "2. Modify Existing Bank \n" +
                "3. List Banks \n" +
                "4. Delete A Bank \n" +
                "5. Go to Previous Menu \n" +
                "6. Exit Application \n");

        boolean choiceEntered = scanner.hasNextInt();
        if(choiceEntered){
            int BankMenuOption = scanner.nextInt();
            return BankMenuOption;
        }
        else{
            System.out.println("Invalid Choice enetered terminating the program");
            return -1 ;
        }
    }

    public static int displayBranchOptions(){
        System.out.println("Select Branch Options :\n" +
                "1. Add New Branch \n" +
                "2. Modify Existing Branch \n" +
                "3. List Branches \n" +
                "4. Delete A Branch \n" +
                "5. Go to Previous Menu \n" +
                "6. Exit Application \n");

        boolean choiceEntered = scanner.hasNextInt();
        if(choiceEntered){
            int BranchMenuOption = scanner.nextInt();
            return BranchMenuOption;
        }
        else{
            System.out.println("Invalid Choice enetered terminating the program");
            return -1 ;
        }
    }

    public static int displayCustomerOptions(){
        System.out.println("Select Customer Options :\n" +
                "1. Add New Customer \n" +
                "2. Modify Existing Customer \n" +
                "3. List Customers \n" +
                "4. Delete A Customer \n" +
                "5. Go to Previous Menu \n" +
                "6. Exit Application \n");

        boolean choiceEntered = scanner.hasNextInt();
        if(choiceEntered){
            int CustomerMenuOption = scanner.nextInt();
            return CustomerMenuOption;
        }
        else{
            System.out.println("Invalid Choice enetered terminating the program");
            return -1 ;
        }
    }

    public static int displayTransactionOptions(){
        System.out.println("Select Customer Transaction Options :\n" +
                "1. Add New Transaction \n" +
                "2. Modify Existing Transaction \n" +
                "3. List Customer Transactions \n" +
                "4. Delete A Customer Transaction \n" +
                "5. Go to Previous Menu \n" +
                "6. Exit Application \n");
        boolean choiceEntered = scanner.hasNextInt();
        if(choiceEntered){
            int transactionMenuOption = scanner.nextInt();



            return transactionMenuOption;
        }
        else{
            System.out.println("Invalid Choice entered terminating the program");
            return -1 ;
        }
    }


    public static boolean processBankSelection(int bankMenuOption){
        if(bankMenuOption<=0){
            return false;
        }

        switch(bankMenuOption){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
        }
        return true;
    }

    public static boolean processBranchSelection(int branchMenuOption){
        if(branchMenuOption<=0){
            return false;
        }

        switch(branchMenuOption){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
        }
        return true;
    }
    public static boolean processCustomerSelection(int customerOption){
        if(customerOption<=0){
            return false;
        }

        switch(customerOption){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
        }
        return true;
    }

    public static boolean processTransactionSelection(int transactionOption){
        if(transactionOption<=0){
            return false;
        }

        switch(transactionOption){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
        }
        return true;
    }

}
