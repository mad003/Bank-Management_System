package devang;
import java.util.*;
import java.io.*;

class user{
    
    
    private static String a[][]=new String [1000][2];
    /* store name and password */
 public static int d=0;
    public static void new_user(){
        Scanner sc=new Scanner(System.in);
       
        try {
        	 File file=new File("R.txt");
             if(file.createNewFile())
             {
            	
             }
             else
             {
            	 FileWriter f=new FileWriter("file");
             	f.write("file is created ");
             	f.write("2 second line");
             	f.close();
             }
             
        	
        }
        catch(IOException e)
        {
        	System.out.println("error occur!");
        }
        
        
        String name,number,pass1,pass2;
           
        
        System.out.println("\t\t\t*****************Welcome**********************\t\t\t\n");
        System.out.println("\n\t\t\tEnter your Name :\n");
        name=sc.nextLine();
        System.out.println("\n\t\tEnter your Mobile number :\n");
        number=sc.nextLine();
 
        System.out.println("\n\t\tEnter your Password :\n");
        pass1=sc.nextLine();
 
        System.out.println("\n\t\tConfirm your Password :\n");
        pass2=sc.nextLine();
 
        	if(pass1.equals(pass2))
        	{
        		a[d][0]=name;
        		a[d][1]=pass1;
        		d++;     
        		System.out.println("\n\t\t***********************Registeration Completed*****************************************\n");
        	}
        	else
        	{
        		System.out.println("\n\t\t$$$$$$$$$$$$$$$$$$$$$$$Incorrect Password$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        	}}
    
public static  boolean login() {
    Scanner sc=new Scanner(System.in);
    int b=0;
    String name,password;
    	System.out.println("\n\t\tEnter your Name\n");
    	name=sc.nextLine();
    	System.out.println("\n\t\tEnter your Password\n");
    	password=sc.nextLine();
    	for(int i=0;i<user.d;i++)
    	{
    		if(a[i][1].equals(password) && a[i][0].equals(name)) {
    			b++;
    			break;
        }}
    	if(b!=0)
    		return true;
    	else
    		return false;
 }}
 
public class project {
    public static void Ms(){
        while(true) {
            Scanner sc=new Scanner(System.in);    
            
            System.out.println("\t\tWhich crop's information do you need now?");
            System.out.println("\n \t\t1. Bajra");
            System.out.println("\n \t\t2. Sweet Corn");
            System.out.println("\n \t\t3. Go Back");
            int choose_crop;
            choose_crop=sc.nextInt();
            corn c1=new corn();
            switch (choose_crop) {
                case 1 -> Monsoon.Bajra();
                case 2 -> c1.Sweet_Corn();
                case 3 -> project.Info();
                default -> System.out.println("\n\t\tPlease Choose vaild choice\n"); }}}
    public static void Info(){
        while(true) {
                        System.out.println("Which season's crop's information do you need?");
                        System.out.println("\n 1. Monsoon");
                        System.out.println("\n 2. Winter");
                        System.out.println("\n 3. Summer");
                        System.out.println("\n 4. Exit");
                        Scanner sc=new Scanner(System.in);
                        int choose_season;
                        choose_season=sc.nextInt();
                        
                        if(choose_season==1) {
                            project.Ms();
                        }
                        else if(choose_season==2) {
                            /*code for winter*/
                        }
                        else if(choose_season==3) {
                            /*code for summer*/
                        }
                        else if(choose_season==4){
                            System.exit(0);
                        }
                        else{
                            System.out.println("Please Choose vaild choice");
                        }
                    }
        }
    
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int choice,choose_crop;
        System.out.println("\n\t\t\t***************Wecome to Seed: The rise*************************\n");
        
        while (true) {    
            System.out.println("\n \t\t\t\tSelect choice\n");
            System.out.println("\n \t\t\t\t1. Register\n");
            System.out.println("\n \t\t\t\t2. login \n");
            System.out.println("\n \t\t\t\t3. exit\n");
            choice=sc.nextInt();
             switch (choice) {
                case 1 -> user.new_user();
                    case 2 -> {
                	boolean c=user.login();
                    if(c)
                    {
                        System.out.println("You Entered\n");
                        project.Info();
                    }
                    else {
                        System.out.println("Complete your registration first.");
                        System.exit(0);
                    }
                }
                case 3 -> {
                    System.out.println("Thanks for coming.");

                }
                default -> System.out.println("Please Choose vaild choice");
            }
        }
    } 
}
