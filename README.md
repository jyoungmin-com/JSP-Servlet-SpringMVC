# 📋 Simple Board Application (JSP + Servlet + Spring MVC)

## 📌 프로젝트 소개
Spring MVC를 활용하여 JSP 기반의 간단한 게시판을 구현한 실습 프로젝트입니다.
컨트롤러, 서비스, DAO, DTO 레이어를 명확히 나누어 MVC 아키텍처를 체계적으로 구성했습니다.
Spring 학습의 일환으로 기본기를 탄탄하게 다지는 것을 목표로 하였습니다.

---

## ⚙️ 기술 스택
- Java 21
- Spring Boot 3.4.4
- JSP / Servlet
- Spring MVC
- Gradle
- Embedded Tomcat 10
- JSTL

---

## 📄 주요 기능
- 기능	설명
- 게시글 목록 조회	/board/list
- 게시글 작성 폼 이동	/board/write
- 게시글 저장	POST
- 게시글 상세 보기	/board/view?id={id}

---

## 🏗️ 프로젝트 구조
```
src/
 └── main/
     ├── java/
     │    └── com.mvc.jspservletspringmvc
     │         ├── controller
     │         ├── service
     │         ├── dao
     │         └── dto
     ├── resources/
     │    └── application.properties
     └── webapp/
          └── WEB-INF/
               └── views/
                    └── board/
                         ├── list.jsp
                         ├── view.jsp
                         └── write.jsp

```
---

## 🔥 학습 포인트
- Spring MVC 아키텍처 기본 흐름 이해
- 의존성 주입 (DI) 및 생성자 기반 주입 실습
- JSP와 JSTL을 이용한 동적 데이터 출력
- Gradle을 통한 의존성 관리

---

## 🚀 실행 방법
1. 프로젝트 클론
   ```bash
   git clone https://github.com/jyoungmin-com/JSP-Servlet-SpringMVC.git
   ```
2. IDE(IntelliJ 등)로 열기
3. Gradle 프로젝트로 리프레시
4. `JspServletSpringMvcApplication` 클래스를 실행
5. 브라우저에서 `http://localhost:8080/board/list` 접속

---

## 🤝 참고사항
- 별도의 DB 연결 없이 메모리 기반 리스트를 사용했습니다.
- 실제 운영환경에서는 DAO를 DB 연결 구조로 변경해야 합니다.

---

## 📚 개인 회고
Spring MVC의 전반적인 요청-응답 흐름을 처음부터 끝까지 직접 구현해보면서, Controller → Service → DAO → View 로 이어지는 구조를 몸으로 익힐 수 있었습니다.

이번 프로젝트를 통해 JSP, Servlet, Spring MVC의 전반적인 구조와 흐름을 이해할 수 있었습니다.  

또한 MVC 패턴을 통한 역할 분리(Controller-Service-DAO-DTO) 연습을 통해 코드의 유지보수성과 확장성에 대한 중요성을 체감했습니다.

앞으로는 더 현대적인 스택으로도 다양한 프로젝트를 시도해보며, 지속적으로 개발 역량을 키워나갈 예정입니다.
