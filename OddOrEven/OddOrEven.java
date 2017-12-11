import javax.swing.JOptionPane;


public class OddOrEven{


  public static void main(String[] args) { //This will make sure only numbers are alloud

    String input = JOptionPane.showInputDialog ("I can tell if a number is even or odd");
    int result = Integer.parseInt(input);
    int check = (result % 1);
    int x = (result % 2);
    if (check == 0.5){
    System.out.println("I don't do decimals m8");

}else{
if (check == 0.5){
  System.out.println("Yarr that there be a decimal matey, \nI don't work with that kind");
  System.exit(0);
  //This will check to see if a decimal is being used, as any decimal number such as 2.5 when % by 1,
  //is equal to 0.5. Note: numbers that have a decimal value of 0 such as 10.0 do not cause %1 to do this
}

if(x == 0){
      System.out.println(input + " this is a even number.");
    }else{
      System.out.println(input + " this be a odd number.");
    }
  }
}
}
