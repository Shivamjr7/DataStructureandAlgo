package matrx;

import java.util.Arrays;

public class FlippingImage {


    public static void main(String[] args) {

        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }

    public static  int[][] flipAndInvertImage(int[][] image) {


        int length = image.length;

        for (int i = 0; i < length; i++) {

            int start = 0;
            int end = length - 1;

            while (start < end) {
                int temp = image[i][start]  ;
                image[i][start] = image[i][end]  ;
                image[i][end] = temp ;

                start++;
                end--;
            }


        }


//        for(int i =0;i<length;i++)
//        {
//            for(int j =0;j<length;j++)
//            {
//                if(image[i][j]==0)
//                    image[i][j] =1;
//                else
//                    image[i][j]=0;
//            }
//        }

        return image;


    }


}
