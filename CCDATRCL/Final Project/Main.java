import java.util.*; //import utility classes for using HashMap
import java.util.Scanner; //import scanner

public class Main{
    
    //declare hashmap
    static Map<String, String> idB;
    static Map<String, String> idVV;

    //****************************************************************************
    //main method- allows access to main menu multiple times.
    public static void main(String[] args) throws Exception {

        mainMenu(); 
    }
        
    //****************************************************************************
    //main menu method
    public static void mainMenu() {

        Scanner scannerMainMenu = new Scanner(System.in); //create scanner
        int response1 = 99; //initialize int for try-catch block
        
        System.out.println("\t\t    ***********************************");
        System.out.println("\t\t\t     Tricycle Profiler               ");
        System.out.println("\t\t    ***********************************");
        
        //Login - Accept User Input - response 1
        //do-while loop until the condition is not met
        do {

            //Exception block for incorrect user input
            try {
                System.out.println("\nPress '1' Operator Login || Press '2' Passenger Login || Press '0' to exit");
                    response1 = Integer.parseInt(scannerMainMenu.nextLine());
                
                if (response1 != 1 && response1 != 2 && response1 != 0) {
                    System.out.println("\n!! Invalid action. Please try again. !!");
                }
            } catch(NumberFormatException e) {
                System.out.println("\n!! Invalid action. Please try again. !!");
            }

        } while (response1 != 1 && response1 != 2 && response1 != 0);
    
        //Condition - Accessing different methods based on the user response
        if (response1 == 1) {
            OperatorMethodVerify();
        } else if (response1 == 2) {
            myMethodMain();
        } else if (response1 == 0) {
            System.out.println("\n\t\t=========== You have now exited. ============");
            System.exit(0); //terminate the running code
        }

        scannerMainMenu.close(); //close scanner to avoid memory leakage
    }
    
    //****************************************************************************
    //Barangay Bungad Database    
    public static Map<String, String> getidB() {
        idB = new LinkedHashMap<>();
        
        //Put - inserts key-value pairs in a hash table.
        idB.put("001", "Abella, Justine Nica");
        idB.put("002", "Adia, Ronn");
        idB.put("003", "Aranilla, Idel Lawrence");
        idB.put("004", "Babilis Winna");
        idB.put("005", "Bantegui, Moses Christian");
        idB.put("006", "Banto, John Matthew");
        idB.put("007", "Bolanos, Jap");
        idB.put("008", "Calalang, Victor Vinnie Lars");
        idB.put("009", "Cinco, Brandon");
        idB.put("010", "Dapatillo, Kean John");
        idB.put("011", "Du, Alexander John");
        idB.put("012", "Estimadora, Jhon Texter");
        idB.put("013", "Flores, Jean Angelo");
        idB.put("014", "Guansing, Iva Timothy");
        idB.put("015", "Hermosura, Jonnah");
        idB.put("016", "Jalalon, James");
        idB.put("017", "Labon, Ma. Teresa Erl");
        idB.put("018", "Lalo, Kean Jerald");
        idB.put("019", "Laureano, Neal Allen");
        idB.put("020", "Legaspie, Carlos Leslie");

        return idB; //return HashMap contents
    }

    //****************************************************************************
    //Veterans Village Database
    public static Map<String, String> getidVV() {
        idVV = new LinkedHashMap<>();
        
        //Put - inserts key-value pairs in a hash table.
        idVV.put("001", "Masangcay, Jenina Velle");
        idVV.put("002", "Masangcay, John Christian");
        idVV.put("003", "Mercado, Jul Seth Mari");
        idVV.put("004", "Monte de Ramos, Mariel");
        idVV.put("005", "Natividad, Michael Angelo");
        idVV.put("006", "Pagaringan, Jeremiah");
        idVV.put("007", "Paller, Richael");
        idVV.put("008", "Papina, Marianne Jovi");
        idVV.put("009", "Par, Mike Vincent Luis");
        idVV.put("010", "Pineda, Rizjake");
        idVV.put("011", "Rifarial, Neil");
        idVV.put("012", "Saavedra, Vincent Paul");
        idVV.put("013", "Tanghal, J-rhyzz");
        idVV.put("014", "Tenerife, Tristan Angelo");
        idVV.put("015", "Torres, Gavin Kyle");
        idVV.put("016", "Valencia, Jamil");
        idVV.put("017", "Vargas, Jethro Ruiz");
        idVV.put("018", "Verzosa, Luis Miguel");
        idVV.put("019", "Victoria, Elaine Grace");
        idVV.put("020", "Poncio Jr., Elizer");
  
        return idVV; //return HashMap contents
    }
    
    //****************************************************************************
    //OperatorMethodVerify (Admin Login - Admin Verification)
    //Admin Code: Admin123
    public static void OperatorMethodVerify() {
        Scanner scannerOperatorMethodVerify = new Scanner(System.in);
        String adminCode; //declare string variable for admin verification
        
        System.out.print("\n");
        System.out.println("\t\t    ***********************************");
        System.out.println("\t\t             Admin Verification        ");
        System.out.println("\t\t    ***********************************");
        
        System.out.print("\nType \"EXIT\" to return to Main Menu.");
        do {
            System.out.print("\nEnter Admin Code: ");
            adminCode = scannerOperatorMethodVerify.nextLine();
            
            //see if string input is the same with the admin/exit code to meet the condition
            if (!adminCode.equals("Admin123") && !adminCode.equals("EXIT")) {
                System.out.println("\nIncorrect Admin Code");
            }
            
        } while (!adminCode.equals("Admin123") && !adminCode.equals("EXIT"));
        
        if (adminCode.equals("Admin123")) {
            OperatorMethod();
        } else if (adminCode.equals("EXIT")) {
            mainMenu();
        }

        scannerOperatorMethodVerify.close();
    }
    
    //****************************************************************************
    //OperatorMethod (Admin Login - Choose which toda)
    public static void OperatorMethod() {
        Scanner scannerOperatorMethod = new Scanner(System.in);
        int opResponse = 99;

        System.out.print("\n");
        System.out.println("\t\t    ***********************************");
        System.out.println("\t\t              Choose Which Toda        ");
        System.out.println("\t\t    ***********************************");
        
        do {
            
            try {
                System.out.println("\nPress '1' Bungad || Press '2' Veterans Village || Press '0' return to Main Menu");
                opResponse = Integer.parseInt(scannerOperatorMethod.nextLine());
                
                if (opResponse != 1 && opResponse != 2 && opResponse != 0) {
                    System.out.println("\n!! Invalid action. Please try again. !!");
                }
            } catch(NumberFormatException e) {
                System.out.println("\n!! Invalid action. Please try again. !!");
            }
        
        } while (opResponse != 1 && opResponse != 2 && opResponse != 0);
    
        //****************************************************************************
        //Condition - Accessing HashMap based on the User Response
        if (opResponse == 1) {
            OperatorMethodDataB();
        } else if (opResponse == 2) {
            OperatorMethodVV();
        } else if (opResponse == 0) {
            mainMenu();
        }

        scannerOperatorMethod.close();
        
    }
    
    //****************************************************************************
    //OperatorDataB (Admin Login - Bungad Access)
    public static void OperatorMethodDataB() {
        idB = new LinkedHashMap<>();
        Scanner scannerMethodDataB = new Scanner(System.in);
        String bodynumB, nameB;
        int opResponse2 = 99, amountB = 0;
        char opResponse2_1;

        System.out.print("\n");
        System.out.println("\t\t    ***********************************");
        System.out.println("\t\t             Bungad Admin Access       ");
        System.out.println("\t\t    ***********************************");
        
        getidB(); //call getidB method to access hash map
        
        do {

            try {
                System.out.println("\nPress '1' View Active Drivers || Press '2' Add Driver || Press '3' Remove Driver");
                System.out.println("  Press '4' Clear Data || Press '5' return to Main Menu || Press '0' to exit");
                opResponse2 = Integer.parseInt(scannerMethodDataB.nextLine());
                
                if (opResponse2 != 1 && opResponse2 != 2 && opResponse2 != 3 && opResponse2 != 4 && opResponse2 != 5 && opResponse2 != 0) {
                    System.out.println("\n!! Invalid action. Please try again. !!");
                } 
            } catch(NumberFormatException e) {
                System.out.println("\n!! Invalid action. Please try again. !!");
            }
        
        } while (opResponse2 != 1 && opResponse2 != 2 && opResponse2 != 3 && opResponse2 != 4 && opResponse2 != 5 && opResponse2 != 0);
        
        if (opResponse2 == 1) {

            System.out.print("\n");
            System.out.println("\t\t    ***********************************");
            System.out.println("\t\t            Bungad Drivers Profile     ");
            System.out.println("\t\t    ***********************************");
            
            //print hash mapcontent in table form
            System.out.print("\n");
            for (String i : idB.keySet()) {
                System.out.print(i + "\t");
                System.out.println(idB.get(i));
            }
            System.out.println("|| Number of Registered Drivers: " +idB.size()+ " ||"); //get hashmap size
            
            //see if hashmap is empty
            if (idB.isEmpty()) {
                System.out.println("\nDriver Profile Directory is Empty!");
                System.out.println("Register the drivers.");
            }
            
            BackMethod1(); //call BackMethod1
        
        } else if (opResponse2 == 2) {
           
            do {
                
                try {
                    System.out.print("\nHow many drivers to register (maximum 10): ");
                    amountB = Integer.parseInt(scannerMethodDataB.nextLine());
                    
                    if (amountB <= 0 || amountB > 10) {
                        System.out.println("\n!! Invalid action. Please try again. !!");
                    } 
                } catch(NumberFormatException e) {
                    System.out.println("\n!! Invalid action. Please try again. !!");
                }

            } while (amountB <= 0 || amountB > 10);
            
            if (amountB >= 1 || amountB <= 10 ) {
                //loop through the amount of drivers to register
                for(int inputB = 0; inputB < amountB; inputB++) { 
                    System.out.print("Enter tricycle body number: ");
                    bodynumB = scannerMethodDataB.nextLine(); //input tricycle body number
                    System.out.print("Enter driver name: ");
                    nameB = scannerMethodDataB.nextLine(); //input driver name
                    
                    idB.put(bodynumB, nameB); //input bodynumB and nameB as the key and value to be inserted in HashMap idB
                }           
            }
            
            System.out.print("\n");
            for (String i : idB.keySet()) {
                System.out.print(i + "\t");
                System.out.println(idB.get(i));
            }
            System.out.println("|| Number of Registered Drivers: " +idB.size()+ " ||");
            
            BackMethod1();
            
        } else if (opResponse2 == 3) {
            System.out.print("\nEnter the body number to remove (xxx): ");
            String bodynumBRemove = scannerMethodDataB.nextLine();  // Read user input

            
            String compareB1 = idB.get(bodynumBRemove); //access hashmap and see if user input bodynumbRemove has an existing key
            
            if (compareB1 == null) {
                System.out.println("Record Not Existing!"); //check if compareB1 has an existing hashmap key
            } else {
                idB.remove(bodynumBRemove);

                System.out.print("\n");
                for (String i : idB.keySet()) {
                    System.out.print(i + "\t");
                    System.out.println(idB.get(i));
                }
                System.out.println("|| Number of Registered Drivers: " +idB.size()+ " ||");
            }
                        
            BackMethod1();
            
        } else if (opResponse2 == 4) {
            do {
                System.out.println("\nAre you sure you want to delete all Data? (Y/N)");
                opResponse2_1 = scannerMethodDataB.next().charAt(0); //scan char at index 0
                
                if ((opResponse2_1 != 'Y' && opResponse2_1 != 'N') && (opResponse2_1 != 'y' && opResponse2_1 != 'n')) {
                    System.out.println("\n!! Invalid action. Please try again. !!");
                }
                    
            } while ((opResponse2_1 != 'Y' && opResponse2_1 != 'N') && (opResponse2_1 != 'y' && opResponse2_1 != 'n'));
            
            if (opResponse2_1 == 'Y' || opResponse2_1 == 'y'){
                idB.clear(); //clear hashmap content when condition proves true
                
                if (idB.isEmpty()) {
                    System.out.println("\nDriver Profile Directory is Now Empty!");
                    System.out.println("|| Number of Registered Drivers: " +idB.size()+ " ||");
                    System.out.println("Register the drivers.");
                }
                
                BackMethod1();
                
            } else {
                System.out.print("\n");
                for (String i : idB.keySet()) {
                    System.out.print(i + "\t");
                    System.out.println(idB.get(i));
                }
                System.out.println("|| Number of Registered Drivers: " +idB.size()+ " ||");
                
                BackMethod1();
            }

        } else if (opResponse2 == 5) {
            mainMenu(); //call mainMenu method and go back to main menu
            
        } else if (opResponse2 == 0) {
            System.out.println("\n\t\t=========== You have now exited. ============");
            System.exit(0);
        }

        scannerMethodDataB.close();
    }
    
    
    //****************************************************************************
    //OperatorMethodVV (Admin Login - Veterans Village Access)
    public static void OperatorMethodVV() {
        idVV = new LinkedHashMap<>();
        Scanner scannerMethodDataVV = new Scanner(System.in);
        String bodynumVV, nameVV;
        int opResponseV2 = 99, amountVV = 0;
        char opResponseV2_1;
        
        System.out.print("\n");
        System.out.println("\t\t    ***********************************");
        System.out.println("\t\t       Veterans Village Admin Access   ");
        System.out.println("\t\t    ***********************************");
        
        getidVV();
        
        do {

            try {
                System.out.println("\nPress '1' View Active Drivers || Press '2' Add Driver || Press '3' Remove Driver");
                System.out.println("  Press '4' Clear Data || Press '5' return to Main Menu || Press '0' to exit");
                opResponseV2 = Integer.parseInt(scannerMethodDataVV.nextLine());
                
                if (opResponseV2 != 1 && opResponseV2 != 2 && opResponseV2 != 3 && opResponseV2 != 4 && opResponseV2 != 5 && opResponseV2 != 0) {
                    System.out.println("\n!! Invalid action. Please try again. !!");
                }
            } catch(NumberFormatException e) {
                System.out.println("\n!! Invalid action. Please try again. !!");
            }
        
        } while (opResponseV2 != 1 && opResponseV2 != 2 && opResponseV2 != 3 && opResponseV2 != 4 && opResponseV2 != 5 && opResponseV2 != 0);
        
        if (opResponseV2 == 1) {
            
            System.out.print("\n");
            System.out.println("\t\t    *************************************");
            System.out.println("\t\t       Veterans Village Drivers Profile  ");
            System.out.println("\t\t    *************************************");

            System.out.print("\n");
            for (String i : idVV.keySet()) {
                System.out.print(i + "\t");
                System.out.println(idVV.get(i));
            }
            
            System.out.println("|| Number of Registered Drivers: " +idVV.size()+ " ||");
            
            if (idVV.isEmpty()) {
                System.out.println("\nDriver Profile Directory is Empty!");
                System.out.println("Register the drivers.");
            }
            
            BackMethod1();
        
        } else if (opResponseV2 == 2) {
            
            do {

                try { 
                    System.out.print("\nHow many drivers to register (maximum 10): ");
                    amountVV = Integer.parseInt(scannerMethodDataVV.nextLine());
                    
                    if (amountVV <= 0 || amountVV > 10) {
                        System.out.println("\n!! Invalid action. Please try again. !!");
                    } 
                } catch(NumberFormatException e) {
                    System.out.println("\n!! Invalid action. Please try again. !!");
                }

            } while (amountVV <= 0 || amountVV > 10);
            
            if (amountVV >= 1 || amountVV <= 10 ) {
                for(int inputVV = 0; inputVV < amountVV; inputVV++) {
                    System.out.print("Enter tricycle body number: ");
                    bodynumVV = scannerMethodDataVV.nextLine();
                    System.out.print("Enter driver name: ");
                    nameVV = scannerMethodDataVV.nextLine();
                    
                    idVV.put(bodynumVV, nameVV);
                }           
            }
            
            System.out.print("\n");
            for (String i : idVV.keySet()) {
                System.out.print(i + "\t");
                System.out.println(idVV.get(i));
            }
            System.out.println("|| Number of Registered Drivers: " +idVV.size()+ " ||");
            
            BackMethod1();
            
        } else if (opResponseV2 == 3) {
            System.out.print("\nEnter the body number to remove (xxx): ");
            String bodynumVRemove = scannerMethodDataVV.nextLine();  // Read user input

            
            String compareV1 = idVV.get(bodynumVRemove);
            
            if (compareV1 == null) {
                System.out.println("Record Not Existing!");
            } else {
                idVV.remove(bodynumVRemove);

                System.out.print("\n");
                for (String i : idVV.keySet()) {
                    System.out.print(i + "\t");
                    System.out.println(idVV.get(i));
                }
                System.out.println("|| Number of Registered Drivers: " +idVV.size()+ " ||");
            }
            
            BackMethod1();
            
        } else if (opResponseV2 == 4) {
            do {
                System.out.println("\nAre you sure you want to delete all Data? (Y/N)");
                opResponseV2_1 = scannerMethodDataVV.next().charAt(0);
                
                if ((opResponseV2_1 != 'Y' && opResponseV2_1 != 'N') && (opResponseV2_1 != 'y' && opResponseV2_1 != 'n')) {
                    System.out.println("\n!! Invalid action. Please try again. !!");
                }
                    
            } while ((opResponseV2_1 != 'Y' && opResponseV2_1 != 'N') && (opResponseV2_1 != 'y' && opResponseV2_1 != 'n'));
            
            if (opResponseV2_1 == 'Y' || opResponseV2_1 == 'y'){
                idVV.clear();
                
                if (idVV.isEmpty()) {
                    System.out.println("\nDriver Profile Directory is Now Empty!");
                    System.out.println("|| Number of Registered Drivers: " +idVV.size()+ " ||");
                    System.out.println("Register the drivers.");
                }
                
                BackMethod1();
                
            } else {
                System.out.print("\n");
                for (String i : idVV.keySet()) {
                    System.out.print(i + "\t");
                    System.out.println(idVV.get(i));
                }
                System.out.println("|| Number of Registered Drivers: " +idVV.size()+ " ||");
                
                BackMethod1();
            }

        } else if (opResponseV2 == 5) {
            mainMenu();
            
        } else if (opResponseV2 == 0) {
            System.out.println("\n\t\t=========== You have now exited. ============");
            System.exit(0);
        }

        scannerMethodDataVV.close();
    }
    
    //****************************************************************************
    //MyMethodMain (User Login - Choose which toda)
    public static void myMethodMain() {
        Scanner scannerMethodMain = new Scanner(System.in);
        int response3 = 99;
        
        System.out.print("\n");
        System.out.println("\t\t    ***********************************");
        System.out.println("\t\t              Choose Which Toda        ");
        System.out.println("\t\t    ***********************************");
        
        do {

            try {
                System.out.println("\nPress '1' Bungad || Press '2' Veterans Village || Press '0' return to Main Menu");
                response3 = Integer.parseInt(scannerMethodMain.nextLine());
                
                if (response3 != 1 && response3 != 2 && response3 != 0) {
                    System.out.println("\n!! Invalid action. Please try again. !!");
                } 
            } catch(NumberFormatException e) {
                System.out.println("\n!! Invalid action. Please try again. !!");
            }
        
        } while (response3 != 1 && response3 != 2 && response3 != 0);
    
        //Condition - Accessing HashMap based on the User Response
        if (response3 == 1) {
            myMethodB();
        } else if (response3 == 2) {
            myMethodVV();
        } else if (response3 == 0) {
            mainMenu();
        }
        
        scannerMethodMain.close();
    }
    
    //****************************************************************************
    //Bungad (User Login - profile bungad driver)
    public static void myMethodB() {
        Scanner scannerB = new Scanner(System.in);
        
        getidB();

        System.out.print("\n");
        System.out.println("\t\t********************************************");
        System.out.println("\t\t     Identify your Bungad Tricycle Driver   ");
        System.out.println("\t\t********************************************");
        
        System.out.print("\nEnter the body number (xxx): ");
        String bodynum = scannerB.nextLine();  // Read user input
        
        String compare = idB.get(bodynum);
        if (compare == null) {
            System.out.println("The tricycle is not registred!");
        } else {
            System.out.println("The tricycle driver is: " + compare);
        } 

        RetryMethod(); //call RetryMethod
        scannerB.close();
    }
    
    //****************************************************************************
    //VETERANS VILLAGE (User Login - profile Veterans Village driver)
    public static void myMethodVV() {
        Scanner scannerVV = new Scanner(System.in);

        getidVV();
        
        System.out.print("\n");
        System.out.println("\t   ******************************************************");
        System.out.println("\t        Identify your Veterans Village Tricycle Driver   ");
        System.out.println("\t   ******************************************************");
        
        System.out.print("\nEnter the body number (xxx): ");
        String bodynumV2 = scannerVV.nextLine();  // Read user input
        
        String compareV2 = idVV.get(bodynumV2);
        if (compareV2 == null) {
            System.out.println("The tricycle is not registred!");
        } else {
            System.out.println("The tricycle driver is: " + compareV2);
        }

        RetryMethod();
        scannerVV.close();
    }
    
    //****************************************************************************
    //ReturnMethod
    public static void BackMethod1() {
        Scanner scannerBM = new Scanner(System.in);
        int bmResponse = 99;
        
        do {

            try {
                System.out.println("\nPress '1' return to Main Menu || Press '0' to exit");
                bmResponse = Integer.parseInt(scannerBM.nextLine());
                
                if (bmResponse != 1 && bmResponse != 0) {
                    System.out.println("\n!! Invalid action. Please try again. !!");
                }
            } catch(NumberFormatException e) {
                System.out.println("\n!! Invalid action. Please try again. !!");
            }
        
        } while (bmResponse != 1 && bmResponse != 0);
        
            if (bmResponse == 1) {
                mainMenu();
            } else if (bmResponse == 0) {
                System.out.println("\n\t\t=========== You have now exited. ============");
                System.exit(0);
            }

        scannerBM.close();
    }
    
    //****************************************************************************
    //RetryMethod
    public static void RetryMethod() {
        Scanner scannerretry = new Scanner(System.in);
        char responseretry;
        
        //Retry
        do {
            System.out.println("\nWould you like to try again? (Y/N)");
            responseretry = scannerretry.next().charAt(0);
            
            if ((responseretry != 'Y' && responseretry != 'N') && (responseretry != 'y' && responseretry != 'n')) {
                System.out.println("\n!! Invalid action. Please try again. !!");
            }
                
        } while ((responseretry != 'Y' && responseretry != 'N') && (responseretry != 'y' && responseretry != 'n'));
        
        if (responseretry == 'Y' || responseretry == 'y'){
            myMethodMain();
        } else {
            mainMenu();
        }

        scannerretry.close();
    }
} 
