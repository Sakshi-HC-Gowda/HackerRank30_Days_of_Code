import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int result=0;
        int i=1;
        while(i<=10){
            
            result=n*i;
             System.out.println(n+" x "+i+" = "+result);
               i++; 
               
            }
        bufferedReader.close();
    }
}
