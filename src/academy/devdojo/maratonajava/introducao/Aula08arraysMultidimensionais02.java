package academy.devdojo.maratonajava.introducao;

public class Aula08arraysMultidimensionais02 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][]; // possui três posições

        arrayInt[0] = new int[2]; //posição 0 terá 2 posições
        arrayInt[1] = array; //posição 1 terá 3 posições
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6}; // posição 2 terá 6 posições

        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};


        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
            System.out.print("\n-----\n");
        }

        System.out.println();

        for (int[] arrayBase : arrayInt2) {
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
            System.out.print("\n-----\n");
        }


    }

}
