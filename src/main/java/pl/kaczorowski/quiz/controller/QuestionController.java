package pl.kaczorowski.quiz.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.kaczorowski.quiz.dto.QuestionDto;
import pl.kaczorowski.quiz.service.QuestionService;

import java.util.List;

@RestController
@RequestMapping("/v1/question")
@AllArgsConstructor
public class QuestionController {

    private QuestionService questionService;

    @GetMapping
    public List<QuestionDto> getQuestions() {
        return questionService.getQuestions();
    }

}
