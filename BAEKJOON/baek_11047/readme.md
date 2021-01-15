알고리즘 해석
============


[이 문제의 링크✈](https://www.acmicpc.net/problem/11047)




## 문제 해결에 필요한 알고리즘

* 그리디 알고리즘의 개념
[그리디 알고리즘의 개념](https://velog.io/@cyranocoding/%EB%8F%99%EC%A0%81-%EA%B3%84%ED%9A%8D%EB%B2%95Dynamic-Programming%EA%B3%BC-%ED%83%90%EC%9A%95%EB%B2%95Greedy-Algorithm-3yjyoohia5)      


## 문제 해결 후 얻은 Insight


### 1. 반복문 while에서의 조건

    while(coinlist[i]<=left&&left>0) { // ex) 1000원권이 4200원보다 작을때 
    
처음엔 left>0 조건을 for문 바깥에 걸어두었더니 무한루프가 돌아버렸다.
다음으로 coinlist[i]<left 이렇게 조건을 해두었더니 마지막 동전은 카운팅이 되지않았다. 
