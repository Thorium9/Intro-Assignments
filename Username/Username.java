import java.util.Scanner;


public class Username {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    String user1, pass1;
    String user, pass;
      System.out.println("Please enter your username: ");
      user1 = input.nextLine();
      user = user1.trim();

      System.out.println("Enter your password: ");
      pass1 = input.nextLine();
      pass = pass1.trim();

    //  System.out.println(user1 + pass1 + user + pass); //just a debug to make sure that the inputs are working correctly

   if(user.equals("") && pass.equals("")){
     System.out.println("Listen here bucko you need to type something next time ok?");
     System.exit(0);
   }
      if(user.equals("Thorium") && pass.equals("joung")){
        String temp;
        int n;
        Scanner a = new Scanner(System.in);
        System.out.println("Welcome, Please input the amount of names you want to enter: ");
        n = a.nextInt();
        String names[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter the names: ");
        for (int i = 0; i < n; i++){
          names[i] = s1.nextLine();
        }
        for (int i = 0; i <n; i++){
          for (int j = i + 1; j< n; j++){
            if(names[i].compareTo(names[j]) > 0){
                temp = names[i];
                names[i] = names[j];
                names[j] = temp;
              }
            }
          }
          System.out.println("Here are the names in sorted order: ");
          for (int i = 0; i < n; i++){
            System.out.print(names[i] + ",");
          }
          System.out.println(names[n - 1]);
        }
        else{
          System.out.println("Excuse me sir that is not the right user name/password, please try again");
        }
      }
  }
