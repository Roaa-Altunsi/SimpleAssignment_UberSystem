/*
    Name: Roaa Hatim Altunsi
    ID: 1914946
    Class: IAR
    Subject: CPCS-203
 */
import java.util.*;
import java.io.*;
public class Project_3_Roaa_1914946{
    public static void main(String[] args) throws Exception{
        
    // Create file objects and check if the file exists
    File inputFile = new File("input.txt");
    File outputFile = new File("RiderWrite.txt");
    if(!inputFile.exists()){
        System.out.println("The file doesn't exist." + "\nCheck in " + inputFile.getAbsolutePath());
        System.exit(0); 
    }
    Scanner read = new Scanner(inputFile);
    PrintWriter write = new PrintWriter(outputFile);
        
    // Create the ArrayLists  
    ArrayList<Captain> captains = new ArrayList<>();
    ArrayList<UberAdmin> uper_Admins = new ArrayList<>();
    ArrayList<Ride> rides = new ArrayList<>();
    ArrayList<RiderBonus> riderBonus = new ArrayList<>();
    ArrayList<Payment> payments = new ArrayList<>();
    ArrayList<Rider> riders = new ArrayList<>();
    
    int captainsMaxSize = read.nextInt(); int uberAdminsMaxSize = read.nextInt();
    int ridesMaxSize = read.nextInt(); int riderBonusMaxSize = read.nextInt();
    int paymentsMaxSize = read.nextInt(); int ridersMaxSize = read.nextInt();
        
    write.println("--------------- Welcome to Uber ---------------");
        
    // Add_Captain Command
    while(read.hasNext("Add_Captain") && captains.size()<captainsMaxSize){
        read.next();
        Captain object = new Captain(read.nextInt(), read.nextInt(), 
            read.nextDouble(), read.nextInt(), read.next(), read.nextBoolean(), 
            read.nextInt(), read.next(), read.next(), 
            (new Date(read.nextInt(), read.nextInt(), read.nextInt())),
            read.next().charAt(0), read.nextInt(), read.next());
        captains.add(object);
        write.println("Command Add_Captain: Add a new captain record in the System");
        write.println("\n" + object + "\n\n----------------------------------------------------------------"); }

    // Add_UberAdmin Command
    while(read.hasNext("Add_UberAdmin") && uper_Admins.size()<uberAdminsMaxSize){
        read.next();
        UberAdmin object = new UberAdmin(read.next(), read.nextInt(), read.next(), 
            read.nextBoolean(), read.nextInt(), read.next(), read.next(), 
            (new Date(read.nextInt(), read.nextInt(), read.nextInt())),
            read.next().charAt(0), read.nextInt(), read.next());
        uper_Admins.add(object);
        write.println("Command Add_UberAdmin: Add a new Uber Admin record in the System");
        write.println("\n" + object + "\n\n----------------------------------------------------------------"); }
        
    // Add_Ride Command
    while(read.hasNext("Add_Ride")&& rides.size()<ridesMaxSize){
        read.next();
        Ride object = new Ride(read.nextInt(), read.next(), read.nextInt(), read.next());
        rides.add(object);
        write.println("Command Add_Ride: Add a new Ride record in the System\nRide Details are as follows:");
        write.println("\n" + object + "\n\n----------------------------------------------------------------");}
        
    // Add_RiderBonus Command
    while(read.hasNext("Add_RiderBonus")&& riderBonus.size()<riderBonusMaxSize){
        read.next();
        RiderBonus object = new RiderBonus(read.nextInt(), read.next(), read.nextDouble());
        riderBonus.add(object);
        write.println("Command Add_RiderBonus: Add a new Rider's Bonus record in the System");
        write.println("\n" + object + "\n\n----------------------------------------------------------------");}
        
    // Add_Payment Command
    while(read.hasNext("Add_Payment")&& payments.size()<paymentsMaxSize){
        read.next();
        Payment object = new Payment(read.nextInt(), read.next(), read.nextDouble());
        payments.add(object);
        write.println("Command Add_Payment: Add a new payment record in the System");
        write.println("\n" + object + "\n\n----------------------------------------------------------------");}
        
    // Add_Rider Command
    while(read.hasNext("Add_Rider")&& riders.size()<ridersMaxSize){
        read.next();
        Rider object = new Rider(read.nextDouble(), read.next(), read.next(),
            read.nextDouble(), (new Date(read.nextInt(), read.nextInt(), read.nextInt())),
            read.nextDouble(), read.nextInt(), read.next(), 
            read.next(), (new Date(read.nextInt(), read.nextInt(), read.nextInt())),
            read.next().charAt(0), read.nextInt(),read.next(), read.nextInt(), read.nextInt());
        riders.add(object);
        write.println("Command Add_Rider: Add a new Rider record in the System");
        write.println("\n" + object.printRiderBasicInfo() +
                "\n\n----------------------------------------------------------------");}
        
    // Assign_Captain_Rider Command
    while(read.hasNext("Assign_Captain_Rider")){
        read.next();
        Captain captain_obj = captains.get(getCaptainIndexById(read.nextInt(), captains));
        Rider rider_obj = riders.get(getRiderIndexById(read.nextInt(), riders));
        rider_obj.setCaptain(captain_obj);
        write.println("Command Assign_Captain_Rider: Successfully Processed by the System, Following are the details:");
        write.println("\t\tRider: " + rider_obj.getName());
        write.println("\t\tAssigned to Captain: " + captain_obj.getName());
        write.println("----------------------------------------------------------------"); }
        
    // Assign_Ride_Rider Command
    while(read.hasNext("Assign_Ride_Rider")){
        read.next();
        Ride ride_obj = rides.get(getRideIndexById(read.nextInt(), rides));
        Rider rider_obj = riders.get(getRiderIndexById(read.nextInt(), riders));
        rider_obj.setRide(ride_obj);
        write.println("Command Assign_Ride_Rider: Successfully Processed by the System, Following are the details:");
        write.println("\t\tRider: " + rider_obj.getName());
        write.println("\t\tAssigned to Ride:\nRide Details are as follows:\n");
        write.println(ride_obj + "\n\n----------------------------------------------------------------"); }
    
    // Assign_UberAdmin_Rider Command
    while(read.hasNext("Assign_UberAdmin_Rider")){
        read.next();
        UberAdmin uberAdmin_obj = uper_Admins.get(getUberAdminIndexById(read.nextInt(), uper_Admins));
        Rider rider_obj = riders.get(getRiderIndexById(read.nextInt(), riders));
        rider_obj.setUberAdmin(uberAdmin_obj);
        write.println("Command Assign_UberAdmin_Rider: Successfully Processed by the System, Following are the details:");
        write.println("\t\tRider: " + rider_obj.getName());
        write.println("\t\tAssigned to UberAdmin: " + uberAdmin_obj.getName());
        write.println("----------------------------------------------------------------");}
    
    // Assign_RiderBonus_Rider Command
    while(read.hasNext("Assign_RiderBonus_Rider")){
        String command = read.next();
        Rider rider_obj = riders.get(getRiderIndexById(read.nextInt(), riders));
        write.println("Command Assign_RiderBonus_Rider: Successfully Processed by the System, Following are the details:");
        write.println("\t\tRider: " + rider_obj.getName());
        int count = 0; double totalRiderBonus = 0;
        while(!read.hasNext(command) && !read.hasNext("Assign_Payment_Rider")){
            int riderBonusIndex = getRiderBonusIndexById(read.nextInt(), riderBonus);
            RiderBonus riderBonus_obj = riderBonus.get(riderBonusIndex);
            rider_obj.setRiderBonus(riderBonus_obj, count); count++; 
            totalRiderBonus += riderBonus.get(riderBonusIndex).getBonusCredit();
            write.println("\t\t Rider Bonus added:\n" + riderBonus_obj + "\n");}
        write.println("----------------------------------------------------------------");}
    
    // Assign_Payment_Rider Command
    while(read.hasNext("Assign_Payment_Rider")){
        String command = read.next();
        Rider rider_obj = riders.get(getRiderIndexById(read.nextInt(), riders));
        write.println("Command Assign_Payment_Rider: Successfully Processed by the System, Following are the details:");
        write.println("\t\tRider: " + rider_obj.getName());
        int count = 0; double totalPayment = 0;
        while(!read.hasNext(command) && !read.hasNext("Print_Report")){
            int paymentIndex = getPaymentIndexById(read.nextInt(), payments);
            Payment payment_obj = payments.get(paymentIndex);
            rider_obj.setPayment(payment_obj, count); count++; 
            totalPayment += payments.get(paymentIndex).getPaymentAmount();
            write.println("\t\t Payment added:\n" + payment_obj + "\n");}
        write.println("----------------------------------------------------------------");}
    
    // Print_Report Command
    while(read.hasNext("Print_Report")){
        read.next();
        String line = "-------------------------------------------------------------------------------------------";
        for (Rider obj : riders) {
            File subOutput = new File(obj.getId()+obj.getName().substring(0, 3)+"_Rider_Report.txt");
            PrintWriter subWrite = new PrintWriter(subOutput);
            subWrite.println("--------------- Welcome to Uber ---------------");
            subWrite.println("--------- Current Date :  " +new Date()+"--------\nCommand: Print_Report");
            subWrite.println("\n\t\t--- Rider Detail are as Follows: ---\n\n" + obj.printRiderBasicInfo().replaceAll(",",""));
            subWrite.println("\t\t--- Captain Detail are as Follows: ---\n\n" + obj.getCaptain()+"\n\t\t\t"+line);
            subWrite.println("\t\t--- UberAdmin Detail are as Follows: ---\n\n" + obj.getUberAdmin()+"\n\t\t\t"+line);
            subWrite.println("\t\t---Payment Details are as follows:---");
            for (Payment payment : obj.getPayment())
                subWrite.println("\n" + payment);
            subWrite.println("\t\t\t"+line);
            subWrite.println("\t\t---Bonus Details are as follows:---");
            for (RiderBonus rider_bon : obj.getRiderBonus())
                subWrite.println("\n" + rider_bon);
            subWrite.println("\t\t\t"+line);
            subWrite.println("\t\t---Ride Details are as follows:---\nRide Details are as follows:\n\n" 
                    + obj.getRide()+"\n\t\t\t"+line);
            subWrite.println("\t\t---Total Net Payment :" + obj.calNetPayment() + 
                    "---\n\t-----------------------------------\n\n");
            subWrite.flush(); subWrite.close();
        } }
    
    // Quit Command
    if(read.next().equals("Quit")){
        write.print("Thank you for using Uber System, Good Bye!");
        write.flush(); write.close(); } 

    }
        
    public static int getRiderIndexById(int id, ArrayList<Rider> list){
        for (int i=0; i<list.size(); i++) 
            if(list.get(i).getId() == id)
                return i;
        return -1; }
    //--------------------------------------------------------------------------
    public static int getCaptainIndexById(int id, ArrayList<Captain> list){
        for (int i=0; i<list.size(); i++)
            if(list.get(i).getId() == id)
                return i;
        return -1; }
    //--------------------------------------------------------------------------
    public static int getRideIndexById(int id, ArrayList<Ride> list){
        for (int i=0; i<list.size(); i++) 
            if(list.get(i).getRideID() == id)
                return i;
        return -1; }
    //--------------------------------------------------------------------------
    public static int getUberAdminIndexById(int id, ArrayList<UberAdmin> list){
        for (int i=0; i<list.size(); i++) 
            if(list.get(i).getId() == id)
                return i;
        return -1; }
    //--------------------------------------------------------------------------
    public static int getRiderBonusIndexById(int id, ArrayList<RiderBonus> list){
        for (int i=0; i<list.size(); i++) 
            if(list.get(i).getBonusId() == id)
                return i;
        return -1; }
    //--------------------------------------------------------------------------
    public static int getPaymentIndexById(int id, ArrayList<Payment> list){
        for (int i=0; i<list.size(); i++) 
            if(list.get(i).getPaymentId() == id)
                return i;
        return -1; }
    
}
