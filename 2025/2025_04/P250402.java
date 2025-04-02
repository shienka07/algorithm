/*
340202번 [PCCE 기출문제] 6번 / 물 부족
https://school.programmers.co.kr/learn/courses/30/lessons/340202


ㅇㅇ시에서는 저수지가 하나 있는데, 도시 내에서 사용하는 모든 물은 이 저수지에 저장된 물을 끌어와 사용합니다. 
이상 기후로 인해 극심한 가뭄이 예고된 상황에서, 지난 달의 물 사용량과 이번달부터 일정 기간 동안의 월별 물 사용량의 변화를 예측한 값을 이용해 몇 달 뒤 물이 부족해지는지 예측하려고 합니다.
이번달부터의 월별 물 사용량 변화를 예측한 값은 다음과 같이 리스트에 담겨 주어집니다.

[10, -10, 10, -10, 10, -10, 10, -10, 10, -10]
리스트의 각 원소는 해당 월의 물 사용량이 전 달에 비해 몇 % 만큼 증가 또는 감소하는지를 나타냅니다.
예를 들어, 이번달의 물 사용량 (리스트의 첫 번째 원소)은 지난 달 보다 10% 증가한 값이며, 다음 달(리스트의 두 번째 원소)의 물 사용량은 이번달 사용량에서 10%만큼 감소한 값입니다.
자세한 값은 입출력 예시를 참고해 주세요.
현재 저수지에 저장된 물의 양을 나타내는 정수 storage와 지난 달 물 사용량을 나타내는 정수 usage, 월별 물 사용량이 전 달 대비 어떻게 변하는지 저장된 정수 리스트 change가 주어질 때 
몇 달 뒤 물이 부족해지는지 return 하도록 solution 함수를 작성하려 합니다. 코드가 올바르게 작동하도록 한 줄을 수정해 solution 함수를 완성해 주세요. 
가뭄이 끝날때 까지 저수지의 물이 남아 있다면 -1을 return합니다.

제한사항
1,000 ≤ storage ≤ 1,000,000
500 ≤ usage ≤ 30,000
1 ≤ change의 길이 ≤ 30
-99 ≤ change[i] ≤ 500
change[i] 가 양수일 경우 물 사용량은 전 달 보다 change[i]% 만큼 증가합니다.
change[i] 가 음수일 경우 물 사용량은 전 달 보다 change[i]% 만큼 감소합니다.
change[i] 가 0일 경우 물 사용량은 전 달과 동일합니다.
매달 물 사용량은 소수점 이하를 버린 정수로 계산합니다.

입출력 예
storage	    usage	change	    result
5141	    500	     [10, -10, 10, -10, 10, -10, 10, -10, 10, -10]	    -1
1000	    2000	 [-10, 25, -33]	    1
입출력 예 설명
입출력 예 #1

매월 물 사용량은 다음과 같습니다.
n개월 뒤	    0 (이번 달)	1 (다음 달)	2	3	4	5	6	7	8	9
월 별 물 사용량	 550	495	544	490	539	485	533	479	526	474
총 물 사용량	 550	1045	1589	2079	2618	3103	3636	4115	4641	5115
예를 들어, 지난 달 물 사용량 usage = 500이므로, 이번달 물 사용량은 10% 증가한 550입니다. 
다음 달 물 사용량은 이번달 사용량 550에서 10% 감소한 495 이며, 나머지 달도 동일하게 계산합니다. 
9달 뒤까지 계산한 물 사용량은 총 5115 이며, 현재 저수지에 저장된 물의 양은 storage = 5141입니다. 
따라서 물이 부족해지지 않으므로 -1을 return합니다.

입출력 예 #2
총 사용가능한 물의 양이 1000인데 2000 * 0.9 = 1800이 필요하므로 이번 달부터 물이 부족합니다. 따라서 0을 return합니다.
*/

public class P250402 {
    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage += (usage * change[i]) / 100;
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}