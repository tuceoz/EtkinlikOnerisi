import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int heat;

            System.out.print("Sıcaklık giriniz:");
            heat = input.nextInt();

            if (heat < 5){
                System.out.println("Kayağa gidebilirsiniz.");
            } else if (5 <= heat && heat <= 10){
                System.out.println("Sinemaya gidebilirsiniz.");
            } else if(10 <= heat && heat <= 15){
                System.out.println("Sinemaya gidebilirsiniz.");
                System.out.println("Pikniğe gidebilirsiniz.");
            } else if(15 <= heat && heat <= 25) {
                System.out.println("Pikniğe gidebilirsiniz.");
            } else {
                System.out.println("Yüzmeye gidebilirsiniz.");
            }

        }
    }

