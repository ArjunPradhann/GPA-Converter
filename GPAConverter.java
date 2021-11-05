import java.util.Scanner;

public class GPAConverter {
    public static void main(String[]args){
        System.out.println("How many courses you had this semsters");

        Scanner input = new Scanner(System.in);
         int Enter = input.nextInt();

         double[] TotalCourses = new double[Enter];
         double sum = 0;

         for(int i = 0 ; i < TotalCourses.length; i++){
             System.out.println("Enter your Average for the course "+(i+1)+":");
             TotalCourses[i]= input.nextInt();
         }
         for(int i = 0 ; i < TotalCourses.length; i++){
             sum = sum + TotalCourses[i];

         }
         double average = sum/ TotalCourses.length;

         if(average>90){
             System.out.println("You have Grade A");
         }
         else if(average<90 && average>80){
             System.out.println("You have Grade B");
         }
         else if(average<80 && average>70){
             System.out.println("You have Grade C");
         }
         else if(average<70 && average>60) {
             System.out.println("You have Grade D");
         }
         else if(average<60) {
             System.out.println("You have Failed");
         }
         else{
             System.out.println("Please Try Again");
         }

    }
}
