# 데이터가 있는 프로젝트
* CRUD 를 구현한다.
## Create : 데이터 추가하기, 키보드에서 입력, 파일로 부터 읽어
1. 키보드에서 입력
2. 데이터 검증
3. VO 객체에 담기 : Vo 클래스를 사용하여 Vo 객체를 생성하고 setting
4. List 에 추가
5. 필요한 곳으로 이동 : file 에 저장, DBMS 에 insert

## Read : 데이터 조회하기, 저장소에 저장된 데이터를 Select 하여 보여주기
1. Data 저장소에 연결 : DbConnection, FileOpen(Scanner...)
2. 데이터를 모두 읽기
3. VO 객체에 담기 위해 적절히 분해(Encoding)
4. VO 를 list 추가
5. Console 로 보이기 등을 위하여 이동