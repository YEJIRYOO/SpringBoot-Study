package com.mysite.sbb.jto_sbb;

import com.mysite.sbb.jto_sbb.question.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JtoSbbApplicationTests {

	@Autowired//DI 기증_questionRepo 객체 스프링 자동 생성
	private QuestionRepository questionRepository;

	/*
	@Test
		void testJpa() {
		Question q1=new Question();
		q1.setSubject("sbb가 무엇인가요");
		q1.setContent("sbb에 대해서 알고 싶습니다");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1); //첫번째 질문 저장

		Question q2=new Question();
		q2.setSubject("스프링부트 모델 질문입니다");
		q2.setContent("id는 자동으로 생성되나요?");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2); //두번째 질문 저장
	}
	 */
/*
	@Test//JUnit 실행
	void testJpa(){
		List<Question> all=this.questionRepository.findAll();
		assertEquals(2,all.size());//(기대값,실제값)
		//동일하지 않으면 테스트 실패
		//전체 항목 조회-> 데이터 개수 확인

		Question q=all.get(0);
		assertEquals("sbb가 무엇인가요?",q.getSubject());
		//항목 일치 확인
	}
 */
	/*
	@Test//ID값으로 조회
	void testJpa(){//return 타입 question 이 아닌 optional!(isPresent로 null여부)
		Optional<Question> oq=this.questionRepository.findById(1);
		if(oq.isPresent()){
			Question q=oq.get();
			assertEquals("sbb가 무엇인가요?",q.getSubject());
		}
	}
	 */
	/* //QuestionRepo 제목을 통해 조회
	@Test
	void testJpa(){
		Question q=this.questionRepository.findBySubject("sbb가 무엇인가요");
		assertEquals(1,q.getId());
	}
	 */
	/* //여러 항목 통해 조회
	@Test
	void testJpa(){
		Question q=this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요","sbb에 대해서 알고싶습니다");
		assertEquals(1,q.getId());
		}
	 */
}
