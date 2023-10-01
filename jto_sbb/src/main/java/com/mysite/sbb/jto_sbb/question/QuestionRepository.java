package com.mysite.sbb.jto_sbb.question;

import com.mysite.sbb.jto_sbb.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
    Question findBySubject(String subject);//제목 통해 테이블 데이터 조회 : findBy Jpa 상속 통해 사용가능
    //"findBy+ 엔티티 속성 명"통해 데이터 조회 가능
    Question findBySubjectAndContent(String subject,String content);//제목+내용 통해 테이블 데이터 조회
}
//JpaRepository 인터페이스 상속하여 QuestionRepo 리포지터리 형성
//상속 시 제네릭스 타입
//<리포 대상 엔티티, 해당 엔티티의 PK 속성 타입 지정>
