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
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < fraction.length; i++) {
            if (i == fraction.length - 1) {
                System.out.print(fraction[i]);
                break;
            }
            System.out.print(fraction[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < random.length; i++) {
            if (i == random.length - 1) {
                System.out.print(random[i]);
                break;
            }
            System.out.print(random[i] + ",");
        }
        System.out.println();
        for (int i = array.length; i >= 0; i--) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ",");
            System.out.println();
            for (int y = fraction.length; y >= 0; y--) {
                if (y == fraction.length - 1) {
                    System.out.print(fraction[y]);
                    break;
                }
                System.out.print(fraction[y] + ",");
            }
            System.out.println();
            for (int z = random.length; z >= 0; z--) {
                if (z == random.length - 1) {
                    System.out.print(random[z]);
                    break;
                }
                System.out.print(random[z] + ",");
            }
            System.out.println();
            for (int x = 0; x < 3; x++) {
                if (array[x] / 2 == 0) {
                    array[x] += 1;
                }
                System.out.print(array[x]);
            }
        }


}






