package booking_tickets;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/*
 * @coder: Qusai Almhmoudi .~.
 *  @athour hp ~.
 */

/*
 * @This class is for traveler information.
 * 
 */
public class TravelerInfo extends login {
    String fullName;
    String phoneNumber;
    String Destination;
    String gender;
    int age;
   boolean pay;
	
	//file storage 
    static  Scanner sc1 = new Scanner(System.in);    
    static String filepath_Y_Aden = " DatabaseofYemenicompayAden.txt";
    static String filepath_Y_Sanna = " DatabaseofYemenicompaySanna.txt";
    static String filepath_AlSaeid_Aden = " DatabaseofAlsaeidahAden.txt ";
    static String filepath_QueenBilqis_Aden = " Databaseof Queen BilqisAden.txt";
    static String filepath_ALbarqLand = "Data Base of ALbarq Land.txt";
    static String filepath_ALbarakaLand = "Data Base ofALbaraka Land.txt";

	//some general variables 
    static byte people;
    static int capacity= 5;
	// Array of type class(TravelerInfo)
    static TravelerInfo[][] travelerInfo = new TravelerInfo[capacity][6];
    
    public static void bookingTickest()throws FileNotFoundException,IOException{ 
	    byte op;
	    do {
              println("\t1-fight" + "\n\t2-land tripe" + "\n\t0-Retreat\n----------------------------");
              print("Enter number of option :");
             op = sc4.nextByte();
           switch (op) {
		  case 1://Fight Start
			   airTicketBooking();		
			   break;      
		   case 2://land tripe
			   landTicketBooking();	 
			   break;
		   case 0:   
			   clear();			
			   break;
		   default:
			   System.err.println(" invalide choces ");
        }
    } while (op != 0);
}
	
	public static void landTicketBooking()throws FileNotFoundException,IOException{    	
		clear(); 
        print("\033[5H");         
        println("\t\t\t__________________________________\n");
        print("\033[44m");
        print("\n\t  you can enjoy choosing from a fleet of buses."
                +"\n\t  A wide variety of sizes and styles are available"
                +"\n\t  ,including economy cars and buses\n\033[0m"
                +"\n \t\t\t___________________________________\n\n\n");    
		byte op_Land;   
		Scanner scanner2;
        do {
            Shape();
            printLandTrip();

            Shape();

            println("Enter the Number of company:");

            op_Land = sc1.nextByte();

            if (op_Land == 1) {

                deletePreviousData("mounday", filepath_ALbarqLand);

                TakeInfomationFromClient(5,filepath_ALbarqLand);

                printTicket(" ALbarqLand .", 5);
                WriterInfoInFile(5, filepath_ALbarqLand);
            } else if (op_Land == 2) {
                deletePreviousData("thursday", filepath_ALbarakaLand);
                TakeInfomationFromClient(6,filepath_ALbarakaLand);
                printTicket(" ALbarakaLand .", 6);
            WriterInfoInFile(6, filepath_ALbarakaLand);
            } else if (op_Land != 0) {

                println("invalide choces ");

            }

        } while (op_Land != 0);

    }



    public static void printAirlines()throws FileNotFoundException,IOException{
        String FileAirlines ="Airlines.txt";
        readFromeFile(FileAirlines);
    }



    public static void printLandTrip()throws FileNotFoundException,IOException{
        String FileLandTrip ="LandTrip.txt";
         readFromeFile(FileLandTrip);
    }

    
    
    public static void airTicketBooking()throws FileNotFoundException,IOException{

      clear();
        print("\033[5H");
        println("\t\t\t__________________________________\n"
);
        print("\033[44m");
        print("\n\t  Let us bring you the best airlines in the world"

        +"\n\t  to take you wherever you wish and plan,and enjoy"

        +"\n\t  a travel atmosphere you have neverknown before.\n\033[0m"

        +"\n\t\t\t___________________________________\n\n\n");

        
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

                        WriterInfoInFile(1,filepath_Y_Aden);
                        printTicket("Yemenia Airways Airlines.", 1);

                    } else if (op_Airport == 2) {//sanaa

                        deletePreviousData("tuesday", filepath_Y_Sanna);

                        TakeInfomationFromClient(2, filepath_Y_Sanna);
                        WriterInfoInFile(2,filepath_Y_Sanna);
                        printTicket("Yemenia Airways Airlines.", 2);

                    }

                    break;



                case 2://Alsaeid

                    deletePreviousData("wednesday", filepath_AlSaeid_Aden);

                    TakeInfomationFromClient(3, filepath_AlSaeid_Aden);

                     WriterInfoInFile(3,filepath_AlSaeid_Aden);
                    printTicket(" Alseaidah  Airlines.", 3);

                    break;

                case 3://Queen Bilqis

                    deletePreviousData("friday", filepath_QueenBilqis_Aden);

                    TakeInfomationFromClient(4, filepath_QueenBilqis_Aden);

                    WriterInfoInFile(4,filepath_QueenBilqis_Aden);
                    printTicket(" Queen Bilqis  Airlines.", 4);

                    break;

                case 0:

                    break;

                default:

                    System.err.println("invalide choces ");

            }

        } while (op_AilLines != 0);

    }

    
    public static void TakeInfomationFromClient(int index,String file)throws FileNotFoundException,IOException{

//       number Of Seats Reserved = nOSR

        int nOSR = calculatNumberOfPassengers(file);

         println("[" + capacity + "/" + nOSR + "]");

        print("Enter number of people :");

        people = sc1.nextByte();
        sc1.nextLine();

        if (people + nOSR <= capacity) {

            for (int i = 0; i < people; i++) {

                travelerInfo[i][index] = new TravelerInfo();
                println("Enter your name :");

                travelerInfo[i][index].fullName = sc1.nextLine();

                println("Enter phone number :");

                travelerInfo[i][index].phoneNumber = sc1.nextLine();

                println("How old are you ? ");
                travelerInfo[nOSR][index].age = sc1.nextInt();
                println("Choos your Destination(1-One way , 2-Round-Trip)");

                byte Destination = sc1.nextByte();

                if (Destination == 1) {

                    travelerInfo[i][index].Destination = "one way";

                } else if (Destination == 2) {

                    travelerInfo[i][index].Destination = "Round-Trip";

                } else {

                    System.err.println("invalide choces ");

                }
                println("Pay down : ");
                travelerInfo[i][index].pay = sc1.nextBoolean();
                sc1.nextLine();
                println("gender : ");
                travelerInfo[i][index].gender = sc1.nextLine();
                 
            }

            
        } else {

            System.err.println(" Available seats are not enough for\n   the number of people who want to book");

        }

    }

    
    public static void WriterInfoInFile(int index,String file) throws IOException,FileNotFoundException{
       FileWriter fr = new FileWriter(file, true);
        for(int i = 0 ; i<people ;i++)
{
            fr.write(travelerInfo[i][index].fullName + ",");

            fr.write(travelerInfo[i][index].phoneNumber + ",");

            fr.write(travelerInfo[i][index].Destination + ",");

            fr.write(travelerInfo[i][index].age + ",");
            fr.write(travelerInfo[i][index].pay + ",");
            fr.write(travelerInfo[i][index].gender + ",");
            fr.write(System.lineSeparator());

            fr.flush();

        }
        fr.close();

    }


    public static void printTicket(String company, int index) {

        Date date = new Date();
        for (int i = 0; i < people; i++) {
            println("\n******************************************************************************************"

            +"\n*\t\t\t\t\t<<QSOM>>"

            +"\n*\tCompany:" + company + "\t\tDate" + date
            +"\n*\tUser Data:"
            +"\n*\t-------------------------------------------------------------------------------"
            +"\n*\tFullName:" + travelerInfo[i][index].fullName

            +"\n*\tphone number:" + travelerInfo[i][index].phoneNumber
            +"\n*\tDestination:" + travelerInfo[i][index].Destination
            +"\n*\t Pay : "+ travelerInfo[i][index].pay
            +"\n*\t Age : "+ travelerInfo[i][index].age
            +"\n*\t Gender : "+travelerInfo[i][index].gender);
            print("\n*\t---------------------------------------------------------------------------------");

            print("\n*\tDeparture station " + " \tArrival Station " + "\tFlight number ");

            print("\n*\t" + "              " + "\t                " + "\t               " + 2);

            print("\n*\t----------------------------------------------------------------------------------");

            print("\n*\t" + "\n*******************************************************************************************");
        }

    }

    public static void deletePreviousData(String day, String file)   throws FileNotFoundException,IOException{

        DayOfWeek dw = LocalDate.now().getDayOfWeek();

        String dayName;

        dayName = dw.name();

        if (dayName.equalsIgnoreCase(day)) {

            FileWriter fw = new FileWriter(new File(file));

            fw.close();

        }

    }

    
    public static void readFromeFile(String filePath) throws FileNotFoundException {
        Scanner scc;

        File file = new File(filePath);

        scc = new Scanner(file);

         
        while (scc.hasNextLine()) {

            println(scc.nextLine());



        }

    }
