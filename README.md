# TTT

![TTT Logo](https://github.com/ljh88820/TTT/assets/128678384/0f045a3f-a044-4695-9aa1-e2525192813e)


   ## 목차
>   + [서비스 소개](#서비스-소개)
>   + [선정 이유](#선정-이유)
>   + [요구사항 명세서](#요구사항-명세서)
>   + [데이터베이스 설계](#데이터베이스-설계)
>   + [개발 환경 및 웹사이트 소개](#개발-환경-및-웹사이트-소개)
<br/>

----
## 서비스 소개
<br/>

- 국내의 다양한 여행지를 쉽고 빠르게 한눈에 여행객들이 서로 좋았던 여행지를 추천하고, 다양한 여행루트를 만들어 카테고리, 테마 별로 구성하고 공유하는 서비스입니다.

----


## 선정 이유
<br/>

- 코로나 19 이후 침체된 관광 산업을 살리고자 다양한 관광지를 소개하고 싶었습니다.

- 바쁜 현대인들은 여행을 가고 싶지만 시간을 쪼개서 여행 준비가 힘듭니다. 그래서 여행 계획 및 유용한 정보들을 서로 공유하고자 하는
커뮤티니를 만들고 싶었습니다.

----

## 요구사항 명세서
<br/>


![image](https://github.com/ljh88820/TTT/assets/128678384/dff0e11c-7d6a-4ff8-a311-6eddca43a882)


![image](https://github.com/ljh88820/TTT/assets/128678384/f7a937ac-3787-4492-95f0-484ce3357645)

----

## 데이터베이스 설계
<br/>


![KakaoTalk_20230511_174638713](https://github.com/BeakJW/TTT/assets/104333195/62618711-f5e8-478d-ae99-9e4eebe7cfc4)


----

## 기능 소개
<br/>

- 메인화면 
  -  슬라이드 시 테마별로 다른 화면이 보여진다


![메인화면 image](https://github.com/ljh88820/TTT/assets/128678384/cce929e1-9baa-442d-bd51-2f9b56235c10)


---

- 로그인 & 회원가입
   - 아이디 비밀번호 일치 시 로그인
 
   - 아이디 비밀번호 불일치 시 "일치하는 회원정보가 없습니다"
 
   - 아이디찾기 ( 이름과 전화번호 - 취소 시 메인으로 / 로그인 시 로그인으로 ): 회원이 없을 시 "일치하는 회원정보가 없습니다" / 존재 시 아이디를 알려 줄 수 있다
 
   - 비밀번호찾기 ( 아이디와 이메일 - 취소 시 메인으로 / 로그인 시 로그인으로): 회원이 없을 시 "일치하는 회원정보가 없습니다" / 임시비밀번호 이메일 발송
 
   - 비밀번호 암호화(BCryptPasswordEncoder)
  
  
![로그인 & 회원가입 image](https://github.com/ljh88820/TTT/assets/128678384/36756536-1016-4cfd-972e-9f100f6181d8)


---

- 로그인&회원가입 ( 아이디 찾기 , 비밀번호 찾기 )
  - 아이디: 중복확인 (ajax 사용하여 데이터베이스에 있는 아이디를 확인하여 0개이면 아이디 사용 가능)
 
  - 비밀번호: 비밀번호 확인 (특수문자 사용 가능)

  - 이름 : 한글, 영문 가능

  - 이메일 : 중복확인 (ajax 사용하여 데이터베이스에 있는 아이디를 확인하여 0개이면 아이디 사용 가능)

  - 체크박스 모두 동의 (required)

  - 취소 시 메인으로 / 가입시 로그인으로

  - 아이디 중복확인 통과, 비밀번호 확인, 이메일 중복 통과 시 회원가입이 가능할 수 있다


![로그인&회원가입 image](https://github.com/ljh88820/TTT/assets/128678384/f615e414-47ec-4d44-80b4-2e7cc6275789)


---

- 루트공유 게시판 ( 루트공유 게시판 목록 조회 )
  - 사용자와 다른 사용자가 작성한 루트공유 게시물을 확인할 수 있게 구현
  
  - 글쓰기 버튼을 누르면 글쓰기 화면으로 넘어가게 현구현

  - 검색 기능 구현 ( 데이터들을 plan테이블에서 가져오며 제목과 아이디 검색 시 게시물을 검색할 수 있는 기능을 구현 )

  - 페이징 기능 구현


![루트공유 게시판 image](https://github.com/ljh88820/TTT/assets/128678384/14a7f16d-93a2-4f7b-b74f-5a2080b35d31)


---

- 루트공유 게시판 ( 작성 화면 )
   - 카카오 맵 API 사용 ( 지도 화면을 구현)
   
   - 한국관광 API 데이터 사용 (한국관광공사 API를 JSON 방식으로 불러와 관광 데이터를 연동시켰고 데이터들의 경도와 위도 정보를 받아오면 JS로 카카오 맵 위치에 마커           를 찍어줄 수 있게 구현 )

   - 루트 작성 구현 (받아온 데이터들을 폼으로 변환하여 나의 일정에 장소 , 여행 시작시간, 설명들을 여행 일수 별로 추가할 수 있게 하였고  이후 일정 등록 버튼을 누            르면 SCHEDULE  데이터베이스에 저장되게 구현)


![루트공유 게시판 image](https://github.com/ljh88820/TTT/assets/128678384/9e92cb57-6775-4a72-a5d0-d2fa71fad4c1)


---

- 루트공유 게시판 ( 작성한 글 확인 )
  - 루트공유 게시판 수정 삭제 기능 구현 (사용자 게시글이 아니면 수정과 삭제 버튼이 나타나지 않게구현 )


![루트공유 게시판 image](https://github.com/ljh88820/TTT/assets/128678384/2cc5df24-9236-4f88-b4bc-93239ff492c0)


---

- 자유게시판 ( 자유게시판 목록 조회 )
  - 등록하기 버튼을 누르면 새로운 게시글을 등록할 수 있다
  
  - 검색 기능 구현
  
  - 자유게시판에 글번호, 제목, 작성자, 작성일자, 조회수로 페이지당 10개의 게시물이 출력되게 구현
게시물의 검색 기능을 구현했다. 
  
![자유게시판 image](https://github.com/ljh88820/TTT/assets/128678384/1546087d-efc4-48ec-8ed4-ddb30a801345)


---

- 자유게시판 ( 검색기능 )
  - 옵션에 맞는 검색 기능을 수행시 조건에 맞게 게시물이 출력되게 한다
  
  - 검색된 게시물이 없을 시에 일치하는 게시글이 없다고 출력한다



![자유게시판 image](https://github.com/ljh88820/TTT/assets/128678384/726c7901-6c4f-4953-8e92-18811c1cb812)


---

- 자유게시판 ( 게시글 작성 )
  - 초기화 버튼 클릭 시 javascript로 작성했던 모든 내용이 초기화 시킨다
  
  - 글쓰기를 눌렀을 때 제목과 내용을 넣지 않았을 때 제목(또는 내용)을 입력해달라는 알림창과 focus     가 이동한다
  
  - 목록 이동


![자유게시판 image](https://github.com/ljh88820/TTT/assets/128678384/c847059e-aa80-4698-ac00-36fabe045381)


---

- 자유게시판 ( 자유게시판 상세 조회)
  - 북마크 기능 (비동기 방식으로 북마크가 추가/삭제 버튼으로 바로 변경된다. 토글 방식으로 작동되게 구현)
  
  - 게시글 신고 기능 ( 팝업창으로 따로 창을 띄워 신고를 할 수 있는 양식이 출력되게 구현 )
  
  - 이전글 다음글 이동 ( 이전글과 다음글로 이동할 수 있게 구현 )

  - 수정/삭제 ( 게시글에 대해 수정할 수 있고, 삭제가 가능하다. 단 인증을 받은 사용자 본인만 수정/삭제가 가능하게 현 )


![자유게시판 image](https://github.com/ljh88820/TTT/assets/128678384/5610227e-9f18-4ae7-af34-239931316a3e)


---

- 자유게시판 ( 댓글작성 및 수정 )
  - 비동기 방식 댓글 조회( 입력시 바로 새로고침을 하거나 리다이렉트를 하지않아도 출력될 수 있도록 구현하였다)
  
  - 비동기 방식 댓글 수정 (댓글을 댓글 내용 안에서 바로 수정할 수 있게끔 댓글 내부에서 구현하였다)
  
 
![자유게시판 image](https://github.com/ljh88820/TTT/assets/128678384/39745182-b508-40c5-a78e-507a235f7c3e)
 
 
 ---
 
 - QnA ( QnA게시판 목록 조회 )
   - 비밀글에는 잠긴 자물쇠가 화면에 보이게 표시하고 공개글에는 열린 좌물쇠가 화면에 보이게 답변여부 표기
   
   - 로그인시 프로필 사진이 보이게 표시
   
   - 로그인시 등록화기 버튼이 생김


![QnA image](https://github.com/ljh88820/TTT/assets/128678384/5c3f4030-9b63-4748-af04-5c6cbf0fa7ea)


---

- QnA ( 작성 화면 )
  - 게시판 작성 화면에 들어갈 시 현재 로그인한 회원 아이디가 보이게 구현
 
  - 파일 업로드 구현
 
  - 공개 비공개 구현


![QnA image](https://github.com/ljh88820/TTT/assets/128678384/2a3fa9b0-56ef-45f3-9ada-327888ada9b2)


---

- QnA ( 답변 화면 )
  - admin계정만 댓글 달 수 있게 구현
  
  - QnA게시판에 답변완료 표기 구현
  
  - admin계정이 답변시 답변되었다고 메일전송 구현
  

![QnA image](https://github.com/ljh88820/TTT/assets/128678384/32bd0b7b-0dd9-44af-9e62-0e56503b22bc)


---

- 마이페이지 ( 회원정보 조회, 회원정보 수정 , 회원탈퇴 ) 
  - 회원정보 수정 시 비밀번호, 이메일, 전화번호, 프로필 사진 수정가능
  
  - 회원정보수정 비밀번호 일치시 수정 가능
  
  - 회원탈퇴 시 비밀번호 입력 후 로그인 정보와 일치 시 탈퇴 가능, 이유 입력 


![마이페이지 image](https://github.com/ljh88820/TTT/assets/128678384/4cc11eb7-1b81-424b-a53c-47982794c98e)


---

- 마이페이지 ( 나의 작성 글 , 내가 쓴 댓글 )
  - 제목 클릭 시 게시물로 이동 가능
  
  - 작성날짜 오름차순으로 정렬


![마이페이지 image](https://github.com/ljh88820/TTT/assets/128678384/b9c7a877-dd89-4265-b1c2-bdec8f66361b)


---

- 마이페이지 ( 북마크 목록 , 체크리스트 )
  - 제목 클릭 시 게시물로 이동 가능
  
  - 체크리스트 체크/ 아이템/ 메모  추가/ 수정/ 삭제 가능


![마이페이지 image](https://github.com/ljh88820/TTT/assets/128678384/09490e60-fd54-4f52-a1e8-e18f9984a2ad)


---

- 마이페이지 ( 관리자 계정 , 신고 목록 )
  - admin 체크리스트대신 신고테이블 볼 수 있다
  
  - 글번호 클릭 시 게시물로 이동 가능
  
  - 탈퇴 버튼 클릭시 회원테이블에서 타겟유저의 상태가 탈퇴로 업데이트. 취소 버튼 클릭시 탈퇴취소 가능
  
  
  ![마이페이지 image](https://github.com/ljh88820/TTT/assets/128678384/4fe861ca-952d-425c-9618-780fb85e4b8b)


---

- 공지사항 ( 공지사항 리스트 , 상세 조회 )
  - 글 작성시 상단 고정 / 비고정 선택 할 수 있다
  
  - admin 계정만 작성, 수정, 삭제 가능


![공지사항 image](https://github.com/ljh88820/TTT/assets/128678384/48c52efc-6200-4de3-93c1-a389e9aca18f)

  
---

- 공지사항 ( 공지사항 수정 , 삭제 )
  - admin 계정으로 로그인 시 공지사항 글 작성, 수정, 삭제 가능  
  
  
  ![공지사항 image](https://github.com/ljh88820/TTT/assets/128678384/f8461e64-0ff6-4717-8904-b3edfb70812a)


----

## 주요 자료
<br/>

----
## 기술 스택 🐈
<br/>

### Environment
![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-007ACC?style=for-the-badge&logo=Visual%20Studio%20Code&logoColor=white&logoWidth=30&logoHeight=30)
![Eclipse IDE](https://img.shields.io/badge/-Eclipse%20IDE-black?style=for-the-badge&logo=Eclipse-IDE&logoColor=white&logoWidth=30&logoHeight=30)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white&logoWidth=30&logoHeight=30)
![Github](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=GitHub&logoColor=white&logoWidth=30&logoHeight=30)

### Config
![Apache Tomcat](https://img.shields.io/badge/-Apache%20Tomcat-F8DC75?style=for-the-badge&logo=Apache-Tomcat&logoColor=black&logoWidth=30&logoHeight=30)

### Development
![HTML5](https://img.shields.io/badge/-HTML5-E34F26?style=for-the-badge&logo=HTML5&logoColor=white&logoWidth=30&logoHeight=30)
![CSS3](https://img.shields.io/badge/-CSS3-1572B6?style=for-the-badge&logo=CSS3&logoColor=white&logoWidth=30&logoHeight=30)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=Javascript&logoColor=black&logoWidth=30&logoHeight=30)
![jQuery](https://img.shields.io/badge/-jQuery-0769AD?style=for-the-badge&logo=jQuery&logoColor=white&logoWidth=30&logoHeight=30)
![Spring](https://img.shields.io/badge/-Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white&logoWidth=30&logoHeight=30)
![Spring Security](https://img.shields.io/badge/-Spring%20Security-6DB33F?style=for-the-badge&logo=Spring&logoColor=white&logoWidth=30&logoHeight=30)
![Maven](https://img.shields.io/badge/-Maven-C71A36?style=for-the-badge&logo=Apache-Maven&logoColor=white&logoWidth=30&logoHeight=30)
![Bootstrap](https://img.shields.io/badge/Bootstrap-7952B3?style=for-the-badge&logo=Bootstrap&logoColor=white&logoWidth=30&logoHeight=30)
![JUnit 5](https://img.shields.io/badge/-JUnit%205-25A162?style=for-the-badge&logo=JUnit5&logoColor=white&logoWidth=30&logoHeight=30)
----
