package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int array[] = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double[] fraction = {1.57, 7.654, 9.986};
        int[] random = {5, 7, 12, 20};
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(fraction[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print(random[i] + ",");
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(fraction[i] + ",");
        }
        System.out.println();
        for (int i = 3; i >= 0; i--) {
            System.out.print(random[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            if(array[i] / 2 != 0){
                i++;
            }
            System.out.print(array[i]);
        }
    }


}






