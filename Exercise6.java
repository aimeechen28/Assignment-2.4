import java.util.Scanner;

class Exercise6{

    public static void main(String[] args){
        int sum=0;
        Scanner sc = new Scanner (System.in); 
        for (int time=0;time>=0;time++){
            System.out.print("How many D6's do you want to roll? ");
            int roll = sc.nextInt();
            System.out.print("You rolled: ");

            for(int n=1;n<=roll;n++){
                int dice =(int)(1+Math.random()*6);
                sum=sum+dice;
                System.out.print(dice+" ");

            }
            System.out.println("");
            System.out.println("Total: "+sum);

            System.out.println("Again? [y,n]");
            String again = sc.next();
            if("y".equals(again)){
                time=0;
                sum=0;
            }else if("n".equals(again)){
                System.out.println("Good-Bye");

                break;
            }else{
                System.out.println("You stupid! Enter 'y' or 'n' please");
                System.out.println("Again? [y,n]");
                again = sc.next();
                if("y".equals(again)){
                    time=0;
                    sum=0;

                }else if("n" .equals(again)){
                    System.out.println("Good-Bye");

                    break;
                }

            }
         
         
         
      
         
        }
    }
}