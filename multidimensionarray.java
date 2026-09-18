public class multidimensionarray {
    public static void main(String[] args) {
        int [][] flats = new int[2][3];
        flats[0][0]=31;
        flats[0][1]=32;
        flats[0][2]=33;
        flats[1][0]=34;
        flats[1][1]=35;
        flats[1][2]=36;

        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                
                System.out.print(flats[i][j]);
                System.out.print(" ");

            }
            System.out.println("");
        }
         
    }
}
