package academy.devdojo.maratonajava.introducao;

public class Aula08arraysMultidimensionais01 {

    public static void main(String[] args) {

        //1,2,3,4,5 Meses
        ///31,28,31,30 dias

        //3/3:
        //l,l,l
        //l,l,l
        //l,l,l


        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 22;
        dias[2][1] = 2;
        dias[2][2] = 40;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
            System.out.println();//pula um linha
        }


        for (int[] arrBase:dias) {
            for(int num:arrBase){
                System.out.println(num);
            }

            System.out.println(); //pula linha
        }

    }

}
