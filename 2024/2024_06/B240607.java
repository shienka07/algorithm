/*
10189번 Hook
https://www.acmicpc.net/problem/10189


Print out the word Hook as shown below.

출력
Print out the word Hook as shown below.

예제 입력 1 
예제 출력 1 
#  # #### #### #  #
#### #  # #  # # #
#### #  # #  # # #
#  # #### #### #  #
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240607 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 4; i++) {
            String str;
            if (i % 3 == 0) {
                str = "#  # #### #### #  #";
            } else {
                str = "#### #  # #  # # #";
            }

            System.out.println(str);
        }
    }
}
