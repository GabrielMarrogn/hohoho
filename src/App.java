import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        sc.close();

        for(int i = 1; i <= a; i++){
            if(i ==a){
                System.out.println(" Ho!");
            }else if(i == 1){
                System.out.print("Ho");
            }else{
                System.out.print(" Ho");
            }
        }
    }
}
