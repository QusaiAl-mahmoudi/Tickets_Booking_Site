/*
 *  >> Al mhmoidi .~
 *  creat by/ Qusai adam >>
 */
package booking_tickets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
 * @coder: Qusai Almhmoudi .~.
 *  @athour hp ~.
 */

public class Booking_Tickets1 extends TravelerInfo   {  
    static String PassWordManager = "1";
    static String MESSAGE="⟨⟨ ⟨⟨ Welcome To The QSOM Website ⟩⟩ ⟩⟩";
  
    public static void mainMune(){
        Shape();
        println("\t\t<<My mune>>"
        + "\n\t1- about us."
        + "\n\t2- Inquiry about flights ."
        + "\n\t3- Inquire about land trips ."
        + "\n\t4- book tickets ."
        + "\n\t5- See the database ."
        + "\n\t6- delete client ."
        + "\n\t7- Settings."
        + "\n\t0- Exit.");
        Shape();
    }
    
    public static void userInterface()throws IOException{
        int Mune_Option;
        do {
            clear();
            println("\033[46m\t"+MESSAGE+"\033[0m\b\n");
            mainMune();
            print("Enter option :");
            Mune_Option = sc1.nextInt();
            switch (Mune_Option) {
                case 1:
                clear();
                aboutAs();
                sc1.next();
                MESSAGE="⟨⟨ ⟨⟨ Welcome To The QSOM Website ⟩⟩ ⟩⟩";
                break;
                //Inquiry about flights.
                case 2:
                InquiryAboutFlights();
                MESSAGE="⟨⟨ ⟨⟨ Welcome To The QSOM Website ⟩⟩ ⟩⟩";
                break;
                case 3: //Inquire about land trips
                InquireAboutLandTrips();
                MESSAGE="⟨⟨ ⟨⟨ Welcome To The QSOM Website ⟩⟩ ⟩⟩";
               break;
                case 4://booking tickest
                clear();
                bookingTickest();
                MESSAGE="⟨⟨ ⟨⟨ Welcome To The QSOM Website ⟩⟩ ⟩⟩";
                break;
                case 5://see Database 
                clear();
                seeTheSiteDatabase();
                MESSAGE="⟨⟨ ⟨⟨ Welcome To The QSOM Website ⟩⟩ ⟩⟩";
                break;
                case 6://delet Client
                deleteClient();
                MESSAGE="⟨⟨ ⟨⟨ Welcome To The QSOM Website ⟩⟩ ⟩⟩";
                break;
                case 7://Settings of site
                Settings();
                MESSAGE="⟨⟨ ⟨⟨ Welcome To The QSOM Website ⟩⟩ ⟩⟩";
                break;
                case 0://exit of site
                Mune_Option = 0;
                break;
                default:
                 MESSAGE = " ⟨⟨ ⟨⟨ invalide choces ⟩⟩ ⟩⟩ ";
            }
        } while (!(Mune_Option == 0));
    }

    private static void displayAlbarakaLandTransportCompany()throws IOException {
       clear();
        Shape();
        String FileAlbarakaLandTransportCompany ="AlbarakaLandTransportCompany.txt";
         readFromeFile(FileAlbarakaLandTransportCompany);
        sc1.next();
    }
    private static void displayAlbarqLandTransportCompany() throws IOException{
      clear();Shape();
        String FileAlbarqLandTransportCompany ="AlbarqLandTransportCompany.txt";
         readFromeFile(FileAlbarqLandTransportCompany);
        Shape();sc1.next();
    }
    
     public static void InquiryAboutFlights()throws IOException{
        byte Airline_Option;
        MESSAGE = "⟨⟨ ⟨⟨ AirLine Department ⟩⟩ ⟩⟩";
        do {clear();
            println("\033[46m\t"+MESSAGE+"\033[0m\b\n");
            Shape();
            printAirlines();
            Shape();
            println("Enter the company number you want to inquire about.");
            Airline_Option = sc1.nextByte();
            switch (Airline_Option) {
               case 1:// Yemenia Airways Airline
                displayYemeniCompanyInquiries();
                 break;
                case 2://   Alsaeidah Airlines
                displayAlsaeidahCompanyInquiries();
                break;
                case 3://   Queen Bilqis Airlines
                displayQueenBilqisCompanyInquiries();
                break;
                case 0:
                break;
                default:
                MESSAGE="⟨⟨ ⟨⟨ Choice Invalid ! ⟩⟩ ⟩⟩";
            }

        } while (Airline_Option != 0);
    
      public static void InquireAboutLandTrips()throws IOException{
        MESSAGE = "⟨⟨ ⟨⟨ AirLine Department ⟩⟩ ⟩⟩";
        byte Land_option;
        do {
            clear();
            println("\033[46m\t"+MESSAGE+"\033[0m\b\n");
            Shape();
            printLandTrip();
            Shape();
            println("Enter numuber of option: ");
            Land_option = sc1.nextByte();
            switch (Land_option) {
                case 1:  //Al Barq Land Transport Company                                  
                displayAlbarqLandTransportCompany();
                break;
                case 2:  //Al Baraka Land Transport Company
                displayAlbarakaLandTransportCompany();
                break;
                case 0:
                break;
                default:
                MESSAGE="⟨⟨ ⟨⟨ Choice Invalid ! ⟩⟩ ⟩⟩";
            }

        } while (Land_option != 0);

    }             
    
    public static void aboutAs() throws IOException{
        MESSAGE = "⟨⟨ ⟨⟨ Information About The Site Creators ⟩⟩ ⟩⟩";
        println("\033[46m\t"+MESSAGE+"\033[0m\b\n");
        String FileaboutAs =" aboutAs.txt";
        readFromeFile(FileaboutAs);
    }
  
    public static void displayYemeniCompanyInquiries() throws IOException{
        byte Airports_Option;
        clear();
        do {         
            Shape();
            println("\n\t\t<<Airports>>"
                    + "\n\t1-Aden Airport."
                    + "\n\t2-Sanaa Airport."
                    + "\n\t0-Retreat\n");
            Shape();
            print("Enter the number of Airport :");
            Airports_Option = sc1.nextByte();
            switch (Airports_Option) {
                case 1:clear();
                Shape();
                String FileYemeniCompanyInquiries_Aden ="YemeniCompanyInquiries_Adan.txt";
               readFromeFile(FileYemeniCompanyInquiries_Aden);
                break;      
                case 2:
                    clear();
                    Shape();
                    String FileYemeniCompanyInquiries_Sanaa ="YemeniCompanyInquiries_Sanaa.txt";
                    readFromeFile(FileYemeniCompanyInquiries_Sanaa);
                  break;       
                case 0:
                clear();
                Airports_Option = 0;
                break;
                default:
                    System.err.println("Choice invalid !");
            }
        } while (Airports_Option != 0);
    }//end print Yemeni Company Inquiries Method
    
    public static void displayAlsaeidahCompanyInquiries()throws IOException {
         clear();
        String FileAlsaeidahCompanyInquiries ="AlsaeidahCompanyInquiries.txt";
         readFromeFile(FileAlsaeidahCompanyInquiries);
        Shape();
        sc1.next();
    }//end  print Alsaeidah Company Inquiries mothod 

    public static void displayQueenBilqisCompanyInquiries() throws IOException {
        clear();
        Shape();
        String FileQueenBilqisCompanyInquiries ="QueenBilqisCompanyInquiries.txt";
         readFromeFile(FileQueenBilqisCompanyInquiries);
        Shape();
        sc1.next();
    }//end of print Queen Bilqis Company Inquiries method
    
    public static void airTicketBooking() throws IOException, FileNotFoundException {
      clear();
        println("\033[5H\t\t\t__________________________________\n"
                + "\n\t\t\tLet us bring you the best airlines in the world"
                + "\n\t\t\tto take you wherever you wish and plan,and enjoy"
                + "\n\t\t\ta travel atmosphere you have neverknown before."
                + "\n \t\t\t___________________________________\n\n\n");
        
        byte op_AilLines;
        do {        
            Shape();
            printAirlines();
            println("Enter the company you want:");
            op_AilLines = sc1.nextByte();
            switch (op_AilLines) {
                case 1:
                    Scanner scanner1;
                    Shape();
                    println("\n\t\t<<Airports>>"
                            + "\n\t1-Aden Airport."
                            + "\n\t2-Sanaa Airport."
                            + "\n\t0-Retreat\n");
                    Shape();
                    println("Enter the Number of Airport :");
                    byte op_Airport = sc1.nextByte();
                    if (op_Airport == 1) {//Aden
                        deletePreviousData("monday", filepath_Y_Aden);
                        TakeInfomationFromClient(1, filepath_Y_Aden);
                        printTicket("Yemenia Airways Airlines.", 1);
                    } else if (op_Airport == 2) {//sanaa
                        deletePreviousData("tuesday", filepath_Y_Sanna);
                        TakeInfomationFromClient(2, filepath_Y_Sanna);
                        printTicket("Yemenia Airways Airlines.", 2);
                    }
                    break;
                case 2://Alsaeid
                    deletePreviousData("wednesday", filepath_AlSaeid_Aden);
                    TakeInfomationFromClient(3, filepath_AlSaeid_Aden);
                    printTicket(" Alseaidah  Airlines.", 3);
                    break;
                case 3://Queen Bilqis
                    deletePreviousData("friday", filepath_QueenBilqis_Aden);
                    TakeInfomationFromClient(4, filepath_QueenBilqis_Aden);
                    printTicket(" Queen Bilqis  Airlines.", 4);
                    break;
                case 0:
                    break;
                 default:
                    System.err.println("invalide choces ");
            }
        } while (op_AilLines != 0);
    }    
    public static void loadClientOfFlightFromFile(String filePath) throws FileNotFoundException {
        println("-----------------------------------------------------------------------------------------------------------------------------------------");
        println("            Name            |            Phone Number            |            Destintion      |    pay      |    age   |  gender                 ");
        println("-----------------------------------------------------------------------------------------------------------------------------------------");
        readingFromeFile(filePath);
    }
    
    public static void readingFromeFile(String filePath) throws FileNotFoundException {
        Scanner scc;
        File file = new File(filePath);
        scc = new Scanner(file);    
        while (scc.hasNextLine()) {
            readLineFromFile(scc.nextLine());
        }
    }
    
      public static void seeTheSiteDatabase()throws IOException , FileNotFoundException{
          byte op;
          MESSAGE= "⟨⟨ ⟨⟨ Database Department ⟩⟩ ⟩⟩";
          println("\033[46m\t"+MESSAGE+"\033[0m\b\n");
          sc1.nextLine();
          Shape();
          print("Enter passwored Manager : ");
          String EnterPassword = sc1.next();
          if (EnterPassword.equals(PassWordManager)) {
              println("------------------------");
              println("\t1-flight" + "\n\t2-land tripe" + " \n----------------------------");
              print("Enter number of option :");
              op = sc1.nextByte();
              File file;
              Scanner scc;
              switch (op) {
                  case 1:
                  clear();
                  MESSAGE= "⟨⟨ ⟨⟨ Database Of Flight Department ⟩⟩ ⟩⟩";
                 println("\033[46m\t"+MESSAGE+"\033[0m\b\n");
                  DatabaseOfFlight();
                  break;
                  case 2://print Data Base of Land
                  clear();
                  MESSAGE= "⟨⟨ ⟨⟨ Database Of Land Department ⟩⟩ ⟩⟩";
                  println("\033[46m\t"+MESSAGE+"\033[0m\b\n");
                  Shape();
                  printLandTrip();
                  println("Enter the Number of company:");
                  byte op_Land = sc1.nextByte();
                  if (op_Land == 1) {
                      loadClientOfFlightFromFile(filepath_ALbarqLand);
                  } else if (op_Land == 2) {
                        loadClientOfFlightFromFile(filepath_ALbarakaLand);
              } else {
                  System.err.println("Invalide Choces");
              }
                  break;
                  default:
                   MESSAGE = "⟨⟨ ⟨⟨ Invalide Choces ⟩⟩ ⟩⟩";
              }
          } else {
              System.err.println("Error in password manager ! ");
          }
      } 
    
    public static void DatabaseOfFlight()throws IOException, FileNotFoundException{   //printDataBaseOfFlight
        printAirlines();
        println("Enter the company you want:");
        byte op_AilLines = sc1.nextByte();
        switch (op_AilLines) {
            case 1:
            clear();
            Shape();
            println("\n\t\t<<Airports>>" + "\n\t1-Aden Airport." + "\n\t2-Sanaa Airport." + "\n");
            Shape();
            println("Enter the Number of Airport :");
            byte op_Airport = sc1.nextByte();
            if (op_Airport == 1) {
                loadClientOfFlightFromFile(filepath_Y_Aden);
                println();
            } else if (op_Airport == 2) {loadClientOfFlightFromFile(filepath_Y_Sanna);
        } else {
            System.err.println("Invalide Choces");
        }
            break;
            case 2:
            clear();
            loadClientOfFlightFromFile(filepath_AlSaeid_Aden);
            break;
            case 3:
            clear();
            loadClientOfFlightFromFile(filepath_QueenBilqis_Aden);
            break;
           default:
            System.err.println("Invalide Choces");
        }
    }
    /*
    * This Method divides the line that comes out of the file into several parts,
    * such as the name and phone number.....
    * This division is done by the useDelimiter()  method in the scanner class. 
    */

    public static void  readLineFromFile(String scc) {
        Scanner scan;
        String phoneNumber,name,Destintion,pay,gender;
        scan = new Scanner(scc);
        scan.useDelimiter(",");
        while (scan.hasNext()) {
            name = scan.next();
            phoneNumber = scan.next();
            Destintion = scan.next();
            pay = scan.next();
            gender = scan.next();
            System.out.printf("|  %-25s  |  %-24s    |  %-18s  |%-10d  | %-15s", name, phoneNumber, Destintion,pay,gender);
            println();
        }
        println("--------------------------------------------------------------------------");
        scan.close();
    }
    
    public static void loadClientOfLandFromFile() throws FileNotFoundException {
        readingFromeFile(filepath_Y_Aden);
    }//end of printDataBeseOfLand
    
    public static void Settings() throws IOException, FileNotFoundException {
        Shape();
        println("\t1-Change password. \n\t2-Clean cache.");
        Shape();
        print("Enter number of option : ");
        byte option = sc1.nextByte();
        FileWriter fr;
        switch (option) {
            case 1: 
                changePassWord();
                 break;
            case 2:
            cleanCache();
            break;
            default:
            System.err.println("invalide choces ");
        }
    }

 public static void changePassWord(){
        FileWriter fr;
        println("Enter old password : ");
        String oldPassword = sc1.next();
     
        if (oldPassword.equals(oldpass)) {
            println("Enter New password : ");
            String newPasswored;
            newPasswored = sc1.next();
            fr = new FileWriter(new File("Password.txt"));
            fr.write(newPasswored);
            fr.flush();
            fr.close();
            println("Successfully changed");
        } else {
            System.err.println("Error in password ");
              }
    }
    
    public static void cleaningFile(String filePath) throws IOException {
        FileWriter fw;
        fw = new FileWriter(new File(filePath));
        fw.close();
    }
 
    public static void deleteClient() throws IOException {
        sc1.nextLine();
        println("Enter name you want to deleted :");
        String name = sc1.nextLine();
        println("select the company you want to  remove his from :");
        println("1-flight\n2-Land");
        byte typeChoc = sc1.nextByte();   
        String filePath = null;
        if (typeChoc == 1) {
            printAirlines();
            print("Choose one :");
            byte cho = sc1.nextByte();
            if (cho == 1) {
                Shape();
                println("\n\t\t<<Airports>>"
                        + "\n\t1-Aden Airport."
                        + "\n\t2-Sanaa Airport.");
                filePath = (sc1.nextByte() == 1) ? filepath_Y_Aden : 
                    filepath_Y_Sanna;
            } else if (cho == 2) {
                filePath = filepath_AlSaeid_Aden;
            } else if (cho == 3) {
                filePath = filepath_QueenBilqis_Aden;
            } else {
                println("invalide choces");
            }
        } else if (typeChoc == 2) {
            printLandTrip();
            filePath = sc1.nextByte() == 1 ? filepath_ALbarqLand : 
                filepath_ALbarakaLand;
        } else {
            println("invalide choces");
        }
        deleteClientFromFile(filePath, name);
    }
    public static void deleteClientFromFile(String fileOfCompany, String name) throws FileNotFoundException, IOException {
        String info[][] = new String[calculatNumberOfPassengers(fileOfCompany)][5];
        File file = new File(fileOfCompany);
        Scanner scf = new Scanner(file);
        int i = 0;
        Scanner sc;
        while (scf.hasNextLine()) {
            sc = new Scanner(scf.nextLine());
            sc.useDelimiter(",");
            while (sc.hasNext()) {
                info[i][0] = sc.next();
                info[i][1] = sc.next();
                info[i][2] = sc.next();
                info[i][3] = sc.next();
                info[i][4] = sc.next(); 
                info[i][5] = sc.next();
            }
            i++;
        }
        int isfound = isPassengerFound(fileOfCompany, name);
       DisplacementOfClientFromArray(info,isfound);
        retrieveDataFromFile(info, fileOfCompany);
    }  

public static void DisplacementOfClientFromArray(String info[][],int isfound)throws IOException {
    if (isfound >= 0) {
        for (int i = isfound - 1; i < info.length - 1; i++) {        
            info[i][0] = info[i + 1][0];
            info[i][1] = info[i + 1][1];
            info[i][2] = info[i + 1][2];
            info[i][3] = info[i + 1][3];
            info[i][4] = info[i + 1][4];
            info[i][5] = info[i + 1][5];
        }

        info[info.length - 1][0] = null;
        info[info.length - 1][1] = null;
        info[info.length - 1][2] = null;
        info[info.length - 1][3] = null;
        info[info.length - 1][4] = null;
        info[info.length - 1][5] = null;
    }
}    
    public static void retrieveDataFromFile(String info[][], String filePath) throws IOException {
        FileWriter fr = new FileWriter(filePath);
        for (int i = 0; i < info.length; i++) {
            if (info[i][0] != null) {
                fr.write(info[i][0] + ",");
                fr.write(info[i][1] + ",");
                fr.write(info[i][2] + ",");
                fr.write(info[i][3] + ",");
                fr.write(info[i][4] + ",");
                fr.write(System.lineSeparator());
            }
        }
        fr.flush(); fr.close();
        println("Deleted successfully (:");
    }

    public static void cleanCache()throws IOException{
            sc1.nextLine();
            println("Enter passwored Manager :");
            String Password = sc1.next();
                if (PassWordManager.equals(Password)) {
                    Shape();
                    println("\t1-fight" + "\n\t2-land tripe" + " \n----------------------------");
                    print("Enter number of option :");
                    byte choces = sc1.nextByte();
                }
    }

}
