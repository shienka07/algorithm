/*
17496번 스타후르츠
https://www.acmicpc.net/problem/17496


진수는 회사 생활에 지쳐 회사를 그만두고 귀농을 하여 작물들을 키우며 생활하고 있습니다. 
진수는 작물 중에서도 '스타후르츠' 라는 작물을 제일 좋아합니다.
스타후르츠 씨앗을 심으면 자라는데 T일이 걸립니다. 
i일에 스타후르츠 씨앗을 심으면 i+T일에 수확할 수 있고 수확한 날에도 같은 칸에 씨앗을 또 심을 수 있습니다.
진수에게는 스타후르츠 씨앗을 심을 수 있는 빈 칸이 C개 있고 한 칸에 한 개의 스타후르츠를 심을 수 있습니다.
오늘은 여름 1일이고 N일까지 여름이 지속됩니다. 스타후르츠는 여름이 아닌 날에는 바로 시들어버리므로 N일이 지나면 더 이상 수확할 수 없습니다.
진수는 스타후르츠 한 개를 판매하면 P원을 벌 수 있습니다. 진수는 올해 여름 동안 얼마나 많은 돈을 벌 수 있을까요?
진수는 하루에 일을 원하는 만큼 할 수 있고, 씨앗도 충분히 가지고 있다고 가정합니다.

입력
첫 번째 줄에 여름의 일 수 N (2 ≤ N ≤ 90) 과 스타후르츠가 자라는데 걸리는 일 수 T (1 ≤ T ≤ N-1) 와 
스타후르츠를 심을 수 있는 칸의 수 C (1 ≤ C ≤ 300) 와 스타후르츠 개당 가격 정수 P (1 ≤ P ≤ 1,000) 가 주어집니다.

출력
첫 번째 줄에 진수가 여름 동안 스타후르츠를 팔아 벌 수 있는 수익을 출력합니다.

예제 입력 1 
7 3 2 750
예제 출력 1 
3000
1일에 스타후르츠를 2개 심으면 4일에 스타후르츠 2개를 수확할 수 있고 4일에 스타후르츠를 2개 심으면 7일에 스타후르츠 2개를 수확하여 총 4개를 수확할 수 있습니다. 
개당 가격이 750원이므로 여름동안 4 * 750 = 3000원을 벌 수 있습니다.

예제 입력 2 
60 10 300 1000
예제 출력 2 
1500000
1, 11, 21, 31, 41 일에 스타후르츠 씨앗을 심으면 됩니다. 51일에 심으면 61일에 수확이 가능한데 여름은 60일까지 이므로 61일에는 수확할 수 없습니다. 
따라서 총 5 * 300 = 1500개의 스타후르츠를 수확할 수 있습니다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B250221 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int cnt = (N - 1) / T;
        int result = (C * P) * cnt;
        System.out.println(result);
    }
}
