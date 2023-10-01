package com.mysite.sbb.jto_sbb.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequiredArgsConstructor //questionRepository 속성 포함 생성자 생성
//final 붙은 속성 포함 자동생성->questionRepository 객체 자동 주입
@Controller
public class QuestionController {

    private final QuestionRepository questionRepository;

    @GetMapping("/question/list")
//    @ResponseBody //템플릿 사용해서 불필요
    public String list(Model model){
        //Model 클래스 이용 QuestRepo 조회 질문 목록 Model 클래스 이용 템플릿에 전달
        List<Question> questionList=this.questionRepository.findAll();//questionList 새엇ㅇ
        model.addAttribute("questionList",questionList);//모델 객체에 questionList 담음
        return "question_List";
    }
}
