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
        int maxConsecutive=0;
        int count=0;
        while(n>0){
            if (n % 2 == 1) {
                count++;
                if(count>maxConsecutive){
                    maxConsecutive=count;
                }
            }else{
                count=0;
            }
            n = n / 2;
        }
        System.out.println(maxConsecutive);
        bufferedReader.close();
    }
}
