package global;

import java.util.Scanner;

public class Test {


    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
     int number = scanner.nextInt();
block:
{
    System.out.print("start");
    if (number>0) {
        break block;
    }
    System.out.print("finish");
    }
}

    }



