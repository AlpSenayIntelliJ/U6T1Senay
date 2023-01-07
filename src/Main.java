public class Main {
    public static void main(String[] args) {


        // exercise 1
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[i]);
        }
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[i]);
        }

        // exercise 2
        boolean[] bools = {true, false, true, false, true, false};
        bools[0] = bools[3];
        System.out.println(bools.length);
        System.out.println(bools[0]);
        System.out.println(bools[5]);


        // exercise 3
        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String temp = alphabeticalNames[2];
        alphabeticalNames[2] = alphabeticalNames[1];
        alphabeticalNames[1] = temp;
        for (int j = 0; j < 4; j++) {
            System.out.println(alphabeticalNames[j]);
        }

        // exercise 4
        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = new double[2];
        array3[0] = array1[0] + array2[0];
        array3[1] = array1[1] * array2[1];
        System.out.println(array3[0]);
        System.out.println(array3[1]);

        // exercise 5
        String[] animals = new String[4];
        for (int j = 0; j < 4; j++) {
            System.out.println(animals[j]);
        }
        animals[0] = "dog";
        animals[1] = "camel";
        animals[2] = "aardvark";
        animals[3] = "bunny";
        for (int j = 0; j < 4; j++) {
            System.out.println(animals[j]);
        }
        System.out.println(animals[3]);
        animals[2] += "s";
        System.out.println(animals[2]);
        System.out.println(animals.length);
        System.out.println(animals[2].length());
    }
}
