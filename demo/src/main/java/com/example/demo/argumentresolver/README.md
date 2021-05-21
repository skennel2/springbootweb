# Spring Argument Resovler 

컨트롤러 클래스의 요청처리 메소드의 인자를 가로채 일괄처리 할수 있는 방법을 제공한다.  

## 하나의 파라미터는 어떤 ArgumentResolver에게 해석되는가?
일련의 순서로 내장된것과 사용자가 추가한 ArgumentResolver들이 존재하고 하나의 파라미터는 supportsParameter를 통과하는 하나의 ArgumentResolver로 묶인다.  
때문에 복수의 ArgumentResolver로 해석하는것도 불가능하다.  
(예를들면 )
  
https://github.com/spring-projects/spring-framework/blob/v5.0.0.RELEASE/spring-web/src/main/java/org/springframework/web/method/support/HandlerMethodArgumentResolverComposite.java#L115-L145  

## 참고  
https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/mvc/method/annotation/PathVariableMethodArgumentResolver.html  
https://jaehun2841.github.io/2018/08/10/2018-08-10-spring-argument-resolver/#spring-argument-resolver   
