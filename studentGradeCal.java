import java.util.*;
public class studentGradeCal {
    public static String calCulateGrade(double avg)throws Exception
    {
        if(avg>=90){
            return "A+";
        }
        else if(avg>=80){
            return "A";
        }
        else if(avg>=70){
            return "B+";
        }
        else if(avg>=60){
            return "B";
        }
        else if(avg>=50){
            return "C";
        }else{
            return "F";
        }
    
    
    }
    public static void main(String[] args) {
        try{
        Scanner sc =new Scanner(System.in);
        int sum=0;
        System.out.println("Enter No.Of Subjects: ");
        int subjects=sc.nextInt();
        for(int i=1;i<=subjects;i++){
            int marks;
            while(true){
                System.out.println("Enter Marks for Subject:"+i+" (Out of 100)");
                marks=sc.nextInt();
                if(marks>=0 && marks<=100)
                {
                    break;
                }
                else{
                    System.out.println("Invalid Input Marks Should be Between 0 to 100");
                }

            }
            sum+=marks;
        }

        double avg=(sum/subjects);
        String grade =studentGradeCal.calCulateGrade(avg);
          System.out.println("Total Obtained Marks:"+sum);
          System.out.println("Percentage is:"+avg+"%");
          System.out.println("Grade is : "+grade);
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
