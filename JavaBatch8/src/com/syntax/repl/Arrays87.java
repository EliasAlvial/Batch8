package com.syntax.repl;

public class Arrays87 {
    public static void main(String[] args)
    {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}

		};

        for (int i = 0; i <a.length ; i++) {
            if(a[i][i]%2!=0&&a[i][i]>0){
                System.out.println(a[i][i]);

            }
        }





    }
}
