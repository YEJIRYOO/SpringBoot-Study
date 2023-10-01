package com.mysite.sbb.jto_sbb.question;

import java.time.LocalDateTime;
import java.util.List;

import com.mysite.sbb.jto_sbb.answer.Answer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.CascadeType; //for Answer
import javax.persistence.OneToMany; //for Answer


@Getter
@Setter
@Entity
public class Question {
    @Id
    //id 속성을 기본키(PK)로 지정->db 저장 시 동일 값으로 저장(중복X)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //1씩 자동 증가하여 저장
    //strategy->동일 시퀀스 번호 생성, 고유번호 유도
    private Integer id;

    @Column(length = 200)
    //엔티티의 속성 테이블의 컬럼명과 일치 -> column 통해 컬럼세부 설정
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question",cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
    //답변 참조하려면 question.getAnserList() 호출
    //mappedBy: 참조 엔티티 속성명
    //질문 하나에 여러개의 답변 작성 가능
    //cascade=CascadeType.REMOVE-> 질문 삭제 시 그에 달린 답변들도 모두 삭제
}
