# Spring Quick Start 학습

Spring Quick Start 책을 학습한 내용입니다.



## 스프링 설정 파일(applicationContext.xml)정의

init-method="initMethod"  : 멤버변수 초기화 작업 수행

destroy-method="destroyMethod" : 스프링 컨테이너가 객체를 삭제하기 전에 호출될 임의의 메소드를 지정할 수 있다.

applicationContext.xml에 **bean** 엘리먼트로 클래스를 매핑하고 태그를 추가하는 것으로 스프링 컨테이너 관리 가능