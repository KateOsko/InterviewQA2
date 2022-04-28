import java.util.Scanner;

public class Question15 {
    /*15
    FINRA
    total number is 30. if num divided by3 and 5 print FINRA,in num divided by 3
    print FIN,if num divided by 5 print RA

            */
    public static String fiNra(int num) {
        String word ="";
        for (int i=0; i<=30; i++){
            if(num%3==0 && num%5==0){
                word+= "FINRA";
                break;
            } else if (num%3==0){
                word+= "FIN";
                break;
            } else if (num%5==0){
                word+= "RA";
                break;
            }
        }
        return word;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println(fiNra(num));
    }


}
