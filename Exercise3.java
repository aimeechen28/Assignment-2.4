import java.util.Scanner;
class Exercise3{
    
public static void main(String[] args){
    
    int sum=0;
    Scanner sc = new Scanner(System.in);
        System.out.println("Let's add some integers!");
        System.out.println("[Enter negative integers to quit]");
   
        System.out.println("");
    
    for(int n=0;n>=0;n++){
    System.out.print("Add:");
    int ans =sc.nextInt();
    if(ans<0){
        break;
        
    }else{
      sum=sum+ans;  
    }
    }
    System.out.print("The total is: "+sum);
        
    }
}
