     
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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    double numOfPositive = 0;
    double numOfNegative = 0;
    double numOfZero = 0;
    double size=arr.size();
    
    
    for(int a=0;a<size;a++){

        if(arr.get(a)>0){
            numOfPositive=numOfPositive+1.00000;
        }else if(arr.get(a)<0){
            numOfNegative=numOfNegative+1.00000;
        }else{
            numOfZero=numOfZero+1.00000;
        }
    }

    System.out.println(String.format("%.6f", (numOfPositive/size)));
    System.out.println(String.format("%.6f", (numOfNegative/size)));
    System.out.println(String.format("%.6f", (numOfZero/size)));
    }

}

public class Hello {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        /*List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());*/
        
        List<Integer> arr = new ArrayList<>(List.of(-1,-1,0,1,1));
        
        Result.plusMinus(arr);

        //bufferedReader.close();
    }
}