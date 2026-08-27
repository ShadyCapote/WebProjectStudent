package edu.slsu.it205.lab03;

public class CounterLoop {
    public static void main(String[] args) {
      
        //Problem B - Counter Loop

        int count,sum = 0;

        for (count = 1; count <= 10; count++) {
            sum += count;
            System.out.println("Count: " + count);
        }
        System.out.println("Sum: " + sum);
        System.out.println();
    }
}
