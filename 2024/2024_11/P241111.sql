/*
133024번 인기있는 아이스크림
https://school.programmers.co.kr/learn/courses/30/lessons/133024


상반기에 판매된 아이스크림의 맛을 총주문량을 기준으로 내림차순 정렬하고 총주문량이 같다면 출하 번호를 기준으로 오름차순 정렬하여 조회하는 SQL 문을 작성해주세요.

예시
예를 들어 FIRST_HALF 테이블이 다음과 같을 때

SHIPMENT_ID	    FLAVOR	            TOTAL_ORDER
101	            chocolate	        3200
102	            vanilla 	        2800
103	            mint_chocolate	    1700
104	            caramel	            2600
105	            white_chocolate	    3100
106	            peach	            2450
107	            watermelon	        2150
108	            mango	            2900
109	            strawberry	        3100
110	            melon	            3150
111	            orange	            2900
112	            pineapple	        2900
상반기 아이스크림 맛을 총주문량을 기준으로 내림차순 정렬하고 총주문량이 같은 경우 출하 번호를 기준으로 오름차순 정렬하면 
chocolate, melon, white_chocolate, strawberry, mango, orange, pineapple, vanilla, caramel, peach, watermelon, mint_chocolate 
순서대로 조회되어야 합니다. 따라서 SQL문을 실행하면 다음과 같이 나와야 합니다.

FLAVOR
chocolate
melon
white_chocolate
strawberry
mango
orange
pineapple
vanilla
caramel
peach
watermelon
mint_chocolate

*/

SELECT FLAVOR 
FROM FIRST_HALF
ORDER BY TOTAL_ORDER DESC, SHIPMENT_ID ASC;