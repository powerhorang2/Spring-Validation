# Spring-Validation
Spring Validation 프로젝트

## Custom Validation

1. AssertTrue / False 와 같은 method 지정을 통해서 Custom Logic 적용 가능
2. ConstraintValidator 를 적용하여 재사용이 가능한 Custom Logic 적용 가능

## Validation 시 주의할 사항

- Validation 하는 Object 에 Object Field 가 있을 시 그 필드도 Validation 하고 싶다면 @Valid Annotation 을 붙여줘야한다.
