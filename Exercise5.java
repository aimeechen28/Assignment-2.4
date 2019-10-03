import java.util.Scanner;
class Exercise5{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("What character do you want your bar made of? ");
      String c = sc.next();
     System.out.print("How tall do you want your triangle? ");
     int n = sc.nextInt();
    System.out.println("Here's your triangle!");
     for(int x=1;x<=n;x++){
    for(int j=1; j<=x;j++){
    System.out.print(c);
    }
    System.out.println("");
    
    
    }
}
}
