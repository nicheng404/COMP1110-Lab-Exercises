package comp1110.lab2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //System.out.println("Enter a height : ");
        int height = input.nextInt();
        //System.out.println("The height is : " + height);


        for (int i=1; i<=height; i++){
            if (i==height){
                for (int j=1; j<=2*height-1; j++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }else{
                for (int j=1; j<=height+i-1; j++){
                    if (i+j==height+1 || j-i==height-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");

            }
        }

    }
}
