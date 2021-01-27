알고리즘 해석
============


[이 문제의 링크✈](https://www.acmicpc.net/problem/1992)




## 문제 해결에 필요한 알고리즘

* 분할 정복



## 문제 해결 후 얻은 Insight


### 1. BufferedWriter의 특징

    bw.write("1");
    
BufferedWriter는 기본적으로 String을 출력하는 기능을 수행하기 때문에, 그냥 int 1을 넣으면 1에 해당하는 아스키 문자를 출력해버린다.
이를 방지하기 위해 char 1을 출력하게 처리.
