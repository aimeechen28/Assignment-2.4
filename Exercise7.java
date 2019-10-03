import java.util.Scanner;
public class Exercise7{
 public static void main(String[] args){
       Scanner sc = new Scanner (System.in); 
       int sum=0;
       System.out.println("I've picked a random number between 1 and 100.");
       System.out.println("Try to guess it!");
       int num =(int)(1+Math.random()*100);
       //System.out.println("The number is" +num);
       for(int guess=1;guess>0;guess++){
        System.out.print("What is your guess?" );
           int numg=sc.nextInt();
         if(numg<num){
             System.out.println("Too low!");
             sum=sum+1;
            }else if(numg>num){
             System.out.println("Too high!");   
             sum=sum+1;
            }else{
              sum=sum+1;
                break;
              
            }
         
        }
       System.out.println("You've guessed my number! Good job!");
              System.out.print("It only took you " + sum +" terms!");
    }
}
