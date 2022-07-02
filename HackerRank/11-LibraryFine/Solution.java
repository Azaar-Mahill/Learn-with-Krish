     
package javaapplication1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'libraryFine' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d1
     *  2. INTEGER m1
     *  3. INTEGER y1
     *  4. INTEGER d2
     *  5. INTEGER m2
     *  6. INTEGER y2
     */

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    // Write your code here
    	int fine=0;

        if(y1==y2){
            if(m1==m2){
            	if(d1<=d2) {
            		fine=0;
            	}else {
            		fine=15*(d1-d2);
            	}
                
            }else if(m1>m2){
                fine=500*(m1-m2);
            }else {
            	fine=0;
            }

        
        }else if(y1>y2){
        	fine=10000;
        }else {
        	fine=0;
        }
        return fine;
    }

}

public class Hello {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");*/

        int d1 = 5;//Integer.parseInt(firstMultipleInput[0]);

        int m1 = 6;//Integer.parseInt(firstMultipleInput[1]);

        int y1 = 2015;//Integer.parseInt(firstMultipleInput[2]);

        //String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d2 = 9;//Integer.parseInt(secondMultipleInput[0]);

        int m2 = 6;//Integer.parseInt(secondMultipleInput[1]);

        int y2 = 2015;//Integer.parseInt(secondMultipleInput[2]);

        int result = Result.libraryFine(d1, m1, y1, d2, m2, y2);
        System.out.println(result);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
