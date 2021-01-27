알고리즘 해석
============


[이 문제의 링크✈](https://www.acmicpc.net/problem/1780)




## 문제 해결에 필요한 알고리즘

* 분할 정복 (Divide & Conquer)
재귀 알고리즘을 주로 활용해서, 복잡해보이는 과제를 패턴을 찾아 잘게 나누어 해결하는 풀이법.






## 문제 해결 후 얻은 Insight

2630번 문제와 매우 유사하나, 이번엔 4분할이 아닌 9분할이다. 때문에 통일되지않은 사각형을 찾았을때 불필요한 코드 작성을 피하기위해 반복문을 사용해봤다.

    for(int i=0;i<n;i+=n/3) {// 디버깅 노트: 
      for (int j=0;j<n;j+=n/3){
                
처음엔 i<n을 i<x+n으로 두었다. 이 이중 for문의 의미를 되새겨보자. 위치에 상관없이 9번의 반복을 통해 행렬을 자르는것이 목표이다. 좌표인 x가 들어가면 행렬의 최대범위를 넘겨버린다.
따라서 분할을 위한 반복문엔 범위를 N까지로 정해주어야한다. 