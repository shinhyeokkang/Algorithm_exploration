알고리즘 해석
============


[이 문제의 링크✈](https://www.acmicpc.net/problem/4344)




## 문제 해결에 필요한 알고리즘

* 알고리즘은 없고, 단순 수학 문제.            




## 문제 해결 후 얻은 Insight


### 1. Casting

    			double result = (double)count/n; // int간의 계산 결과를 double로 반드시 캐스팅해야 data loss가 생기지 않는다.
    
위 코드처럼 int 간의 계산을 통해 소수점 아래까지 값이 나오는 결과값을 받고 싶다면 꼭 double로 캐스팅을 해줘야한다.      
안해보면 어떻게 나오나도 실험해봤는데 소수점아래는 깔-끔하게 무시하고 int 값으로 출력한다. 

### 2. printf

이 문제의 변별력이 있다고 한다면 소수점아래 3번째까지만 출력하는 부분일것이다.      
난 printf 의 서식 출력을 이용해 이 문제를 풀었다. 친절한 설명은 아래 링크에 있다. 

[printf(), 서식문자를 이용해서 출력하기!](https://the-duchi.tistory.com/12)


 
