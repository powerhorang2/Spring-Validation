# Spring-Validation
Spring Validation 프로젝트

## Custom Validation

1. AssertTrue / False 와 같은 method 지정을 통해서 Custom Logic 적용 가능 - 재활용 불가능함
2. ConstraintValidator 를 적용하여 재사용이 가능한 Custom Logic 적용 가능 - 재활용 가능함

## Validation 시 주의할 사항

- @AssertTrue Annotation 사용 시 리턴 타입이 boolean 일 경우 method 의 이름이 is 로 시작해야함
- Validation 하는 Object 에 Object Field 가 있을 시 그 필드도 Validation 하고 싶다면 @Valid Annotation 을 붙여줘야함


출처 : [해당 프로젝트는 패스트 캠퍼스 : 초격자 패키지 : 한번에 끝내는 Java/Spring 웹 개발 마스터 강의의 내용입니다. ](https://github.com/steve-developer/fastcampus-springboot-introduction)
