알고리즘 해석
============


[이 문제의 링크✈](https://www.acmicpc.net/problem/11654)




## 문제 해결에 필요한 알고리즘

[BufferedWriter의 특징및 장점](https://takeknowledge.tistory.com/44)

## 문제 해결 후 얻은 Insight


### 1. BufferedWriter

BufferedWriter는 System.out 과 다르게 조금은 복잡하지면 출력 속도가 훨씬 빠르다는 장점이있다.
이 외에도, 

    br.write();
    
를 사용해 숫자를 출력하면, 그 숫자의 아스키코드표에 대응하는 문자를 출력한다. 이를 간단히 회피하려면 아래처럼

    bw.write(ascii[0]+"\n"); // 하지만 이렇게 개행문자를 추가해 다른 자료형을 출력하게 하면 그대로 Stirng으로 인식, 아스키코드로 출력된다.  
    
개행문자를 추가해 String으로 변환시키면 된다. 
