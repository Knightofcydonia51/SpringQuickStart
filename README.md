# Spring Quick Start 학습

Spring Quick Start 책을 학습한 내용입니다.



## 스프링 설정 파일(applicationContext.xml)정의

init-method="initMethod"  : 멤버변수 초기화 작업 수행

destroy-method="destroyMethod" : 스프링 컨테이너가 객체를 삭제하기 전에 호출될 임의의 메소드를 지정할 수 있다.

applicationContext.xml에 **bean** 엘리먼트로 클래스를 매핑하고 태그를 추가하는 것으로 스프링 컨테이너 관리 가능



# IoC(Invertion of Control)

제어 역행.

스프링의 의존성 주입(DI:Dependcy Injection) 기능을 활용해 클래스간 결합도를 낮추는 설계를 가능하게 한다.

객체에 대한 제어권이 개발자로부터 프레임워크(스프링)으로 넘어감.

스프링 프레임워크는 컨테이너를 통해 객체의 생성부터 소멸까지 생명주기 관리를 도맡아 한다.

이처럼 제어권의 흐름이 바뀌는 것을 제어의 역전(IoC)라고 한다.

https://jongmin92.github.io/2018/02/11/Spring/spring-ioc-di/#ioc%EB%9E%80

IoC에 대한 설명이 매우 잘 나와있는 블로그.



# AOP(Aspect-Oriented Programming)

XML 파일 수정을 통해 관심을 분리하여 메소드 간 응집도를 약하게 유지하면서 수정하고 싶은 부분들을 손쉽게 수정할 수 있다.

디펜던시에 AOP 관련 라이브러리를 추가하고 xml 파일에 aop 설정 구문들을 추가하면 원하는 메인 로직이 수행되기 전 시점에 추가해놓은 메소드를 동작시킬 수 있다.

IoC가 모듈 간 결합도를 낮추어 프로그램에 대한 수정이 필요할 때 유연성을 늘리는 기능이라면, AOP는 모듈 내 기능의 응집도를 높여 한 모듈이 본래의 목적만 잘 수행할 수 있게 돕는다.



# Interface를 사용하는 이유

메소드 형식을 정의해줌으로써 협업 시 코드를 통일하는데 용이하다.

또한, 메소드의 개선이 필요해 수정이 필요할 때 역시 간편하게 수정이 가능하다.

