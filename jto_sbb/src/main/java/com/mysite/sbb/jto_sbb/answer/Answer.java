package com.mysite.sbb.jto_sbb.answer;

import java.time.LocalDateTime;

import com.mysite.sbb.jto_sbb.question.Question;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.ManyToOne;
import javax.persistence.*;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")//글자 수 제한x
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;
    //엔티티와 연결된 속성임 명시 필요
    //import javax.persistence.ManyToOne;
    //질문1 -> 여러개의 답변 _ 1:N관계
    //여러개의 답변 -> 답변의 속성 List형태 구성
}
