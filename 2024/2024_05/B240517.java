/*
8370번 Plane
https://www.acmicpc.net/problem/8370


Byteland Airlines recently extended their aircraft fleet with a new model of a plane. 
The new acquisition has n1 rows of seats in the business class and n2 rows in the economic class. 
In the business class each row contains k1 seats, while each row in the economic class has k2 seats.

Write a program which:
reads information about available seats in the plane,
calculates the sum of all seats available in that plane,
writes the result.

입력
In the first and only line of the standard input there are four integers 
n1, k1, n2 and k2 (1 ≤ n1, k1, n2, k2 ≤ 1 000), separated by single spaces.

출력
The first and only line of the standard output should contain one integer 
- the total number of seats available in the plane.

예제 입력 1 
2 5 3 20
예제 출력 1 
70
 */

public class B240517 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int k1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int k2 = Integer.parseInt(st.nextToken());

        int result = (n1 * k1) + (n2 * k2);
        
        System.out.println(result);
    }
}
