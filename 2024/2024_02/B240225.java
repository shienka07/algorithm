/*
26530번 Shipping
https://www.acmicpc.net/problem/26530


Your animals have begun producing products, and you’re honestly a little strapped for cash. 
Since you have far more animal byproducts than you know what to do with, you’ve decided to begin shipping them for extra money. 
Given the information in your shipping ledger, determine how much money you can expect to make.

입력
The first line will contain a single integer n that indicates the number of data sets that follow. 
Each data set will start with a single integer x denoting how many items follow. 
The next x lines consist of a string, and integer, and a floating point number to two decimal places, 
representing the name of what was sold, the quantity, and the unit price of each item.

출력
For each test case, output the amount of money you expect to make with all of the goods you sold, rounded to two decimal places.

예제 입력 1 
2
3
Eggs 12 0.75
Milk 1 2.00
Feathers 50 .02
2
Cow 1 100.00
Cheese 3 0.54
예제 출력 1 
$12.00
$101.62
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n; i++){
            int x = Integer.parseInt(br.readLine());
            double sum = 0;

            for(int j = 0; j < x; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String item = st.nextToken();
                double psc = Double.parseDouble(st.nextToken());
                double price = Double.parseDouble(st.nextToken());

                sum += psc * price;
            }

            System.out.println("$" + String.format("%.2f", sum));
        }
    }
}
