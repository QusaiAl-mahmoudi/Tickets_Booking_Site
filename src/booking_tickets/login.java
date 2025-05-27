/*
 * @coder: Qusai Almhmoudi .~.
 *  @athour hp ~.
 */
 
package booking_tickets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
 * @This class is for logging into the program.
 * We will also use it as a register .
 */
public class login   {
      static String name;
     static String password;
    
      static Scanner sc4 = new Scanner(System.in);
      static String SFOAROS = "Accounts.txt";
      static String PassWordstorageFileForAllAcounts = "Password.txt";
      static String oldpass;
   public static void Login() throws InterruptedException, IOException {

       println("\033[46m") ;
        println("\t\t⟨⟨ ⟨⟨ Sign Up Site ⟩⟩ ⟩⟩");println("\033[0m");
        println("Enter your name: ");

         name =sc4.nextLine();
        checkCustomersAccounts(name);

        loading();

        print("\nSign up successfully (:");

        TimeUnit.SECONDS.sleep(1);

        print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");

        print("Welcome to our app Mr." + name + "!\n\n");

        TimeUnit.SECONDS.sleep(1);

    }

      
      
      public static void checkCustomersAccounts(String name) throws InterruptedException, FileNotFoundException, IOException {
        login log = new login();

        File file = new File(SFOAROS);

         
        Scanner scfile = new Scanner( SFOAROS);

        //Check if the user has an account before
         
        if (isPassengerFound( SFOAROS, name) >= 0) {

            checkPasswordLogin(PassWordstorageFileForAllAcounts);

        } else {

            FileWriter frname = new FileWriter(SFOAROS, true);

            FileWriter frpass = new FileWriter(PassWordstorageFileForAllAcounts, true);

            println("\nCreate password: ");

            password = sc4.next();

            //storage password in file PassWordstorageFileForAllAcounts.
            frpass.write(password + System.lineSeparator());

            frpass.flush();frpass.close();

            //storage name in file SFOAROS.
            frname.write(name + System.lineSeparator());

            frname.flush();frname.close();

        }

    }
      
      
      public static int  isPassengerFound(String filePath, String sreachName) throws FileNotFoundException, IOException {

       BufferedReader reader = new BufferedReader(new FileReader(filePath));

        int counter = 0;

        String storedNames;

        while ((storedNames = reader.readLine()) != null) {
              ++counter;

            if (storedNames.trim().equalsIgnoreCase(sreachName)) {
                return counter;

            }

        }

        return -1;

    }

      
      
      public static int calculatNumberOfPassengers(String file) throws FileNotFoundException {

        Scanner scanner1 = new Scanner(new File(file));

        int count = 0;

        while (scanner1.hasNextLine()) {

            count++;

            scanner1.nextLine();

        }

        return count;

    }

      
      //this method print texts 
      public static void println(Object taxt) {

        System.out.println(taxt);

    }



      
    public static void print(Object taxt) {

        System.out.print(taxt);

    }

     public static void println() {

        System.out.println();

    }



    public static void clear() {

        print("\033[H\033[2J");

        System.out.flush();

    }



    public static void Shape() {

        println("===*===*===*===*===*===*===*===");

    } 
      
      
      public static void checkPasswordLogin(String file) throws InterruptedException, FileNotFoundException, IOException {

        println("\nEnter your old password: ");
        oldpass = sc4.next();

        File f = new File(file);
        Scanner s = new Scanner(f);
        String passwordStorageInFile[] = new String[calculatNumberOfPassengers(file)];
        
        for(int i=0;i<passwordStorageInFile.length;i++ ){
            passwordStorageInFile[i] = s.next();
        }
        int countet = calculatNumberOfPassengers(file);
       String n; 
        isFound:

        while (true) {

            for (int i = 0; i < countet; i++) {
                 n = passwordStorageInFile[i] ;
                if (n.equals(oldpass)) {

                    break isFound;

                }

            }

            println("Wrong password, try again.");

            println("\nold-Password: ");

            oldpass = sc4.next();

        }

    }

      
      public static void loading() throws InterruptedException {

        print("Loading");

        for (int i = 0; i <= 3; i++) {

            Thread.sleep(280);

            print(".");

        }

        Thread.sleep(130);

        print("\b\b\b   \b\b\b");

         
        for (int i = 0; i < 3; i++) {

            Thread.sleep(180);

            print(".");

        }

        Thread.sleep(130);

        print("\b\b\b   \b\b\b");



        print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");

        print("                ");

    }
}

 
