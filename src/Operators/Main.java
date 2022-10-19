package Operators;

public class Main {
    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);   //3
        int previousResult = result;
        System.out.println("previousResult =  " + previousResult);  //3
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result); //2
        System.out.println("previousResult =  " + previousResult); //3

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);   //20

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);   //4

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);  //1

        result++; //1 arttır
        System.out.println(result);

        result--;
        System.out.println(result);

        result *=10;
        System.out.println(result);

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not an alien!");
        }
        int topScore = 100;
        if(topScore > 100){
            System.out.println("You got the high score");
        }
        int secondTopScore =81;
        if(topScore>80 && (secondTopScore>80)){
            System.out.println(secondTopScore);
        }

    }
}
