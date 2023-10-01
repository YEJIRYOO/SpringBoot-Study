package com.mysite.sbb.jto_sbb.answer;

import com.mysite.sbb.jto_sbb.answer.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer,Integer> {
}
