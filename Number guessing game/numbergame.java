import java.util.*;

public class numbergame {
    static void guess_number(int num) {
        Scanner input = new Scanner(System.in);
        int j = 1;
        do 
        {
            System.out.println("if u want to play  then press 1 \t for exit press another number");
            int n = input.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter limit the number of attempts the user has to guess the number");
                    int guess_attempt = input.nextInt(); //  number of attempts
                    System.out.println("Now we try to guess the number ");
                    int count = 0, i = 1;
                    while(i <= guess_attempt)
                    {
                        if (i == guess_attempt) {
                            System.out.println("Enter " + i + " guess number It is last , so be careful");
                        } else {
                            System.out.println("Enter " + i + " guess number");
                        }
                        int guess_num = input.nextInt();
                        if (guess_num > num) {
                            System.out.println("very high try again");
                            count++;
                            i++;
                        }

                        else if (guess_num == num) {
                            count++;
                            System.out.println(" Guess is correct, in " + count + "attempts");
                            break;

                        }

                        else {
                            System.out.println(" very low try again");
                            count++;
                            i++;
                        }
                    }
                    break;
                default:
                    j = 0;
            }
        } while (j > 0);
        System.out.println("Thanks for playing");
        input.close();
    }
    public static void main(String[] args) {
        System.out.println("Generate  random number with in  the specified range  1 to 100");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter range ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("So range is " + a + " To " + b);
        System.out.print("Enter number for guess  ");
        for(int i = a; i <=b; i++)
        {
            int num = input.nextInt();
            if (num >= a && num <= b) {
                System.out.println("The Generated number is " + num);
                guess_number(num);
                break;
            } else {
                System.out.println(" Number is not in range try again !");
            }
        }
        input.close();
        
    }
}