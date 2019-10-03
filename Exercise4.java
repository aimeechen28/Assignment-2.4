import java.util.Scanner;
class Exercise4{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("What character do you want your bar made of? ");
      String c = sc.next();
     System.out.print("How long do you want your bar? ");
      int n = sc.nextInt();
    System.out.println("Here's your bar!");
     for(int x=1;x<=n;x++){
    System.out.print(c);
   
    }
    
    
    }
}
