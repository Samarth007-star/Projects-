import java.util.*;
public class NumberGame {
    
    public static void main(String[] args) {
        try{
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int totalAttempts=0,totalWins=0;
        boolean play=true;
        while(play){
            int numGuess=random.nextInt(100)+1;
            System.out.println("Number:"+numGuess);
            int maxAttempts=5;
            int attempts=0;
            System.out.println("******:: Welcome to the Number Guessing Game ::******");
            System.out.println("I am thinking of a number between 1 to 100");
            System.out.println("You have Total: "+maxAttempts+" Attempts to guess the Number");
            System.out.println("Best Of Luck....");
            while(attempts<maxAttempts){
                System.out.println("\nEnter the Number ::");
                int guessNo=sc.nextInt();
                attempts++;
                if(guessNo==numGuess){
                    System.out.println("Congratulations You Guessed the Right Number in "+attempts+" Attempts");
                    totalWins++;
                    totalAttempts+=attempts;
                    break;
                }
                else if(guessNo<numGuess){
                    System.out.println("Your Guess is less to Right Number");
                }
                else{
                    System.out.println("Your Guess is Greater to Right Number ");
                }
            }
            if(attempts==maxAttempts){
                System.out.println("The Attempts Are over the Number was: "+numGuess);
                totalAttempts+=maxAttempts;
             }
             System.out.println("You want to play again ?(Yes/No): ");
             String ans=sc.next().toLowerCase();
             if(ans.equals("yes")){
                play=true;
             }
             else
             play=false;
         }
         System.out.println("******::Game Over ::******");
         System.out.println("You Total wins:"+totalWins);
         if(totalWins>0){
            System.out.println("Average Attempts per win is: "+(float)totalAttempts/totalWins);
         }
        }catch(Exception e){
            System.out.println(e);
            
        }
    }
}
