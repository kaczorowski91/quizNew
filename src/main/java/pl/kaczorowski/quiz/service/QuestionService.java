package pl.kaczorowski.quiz.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kaczorowski.quiz.dto.QuestionDto;
import pl.kaczorowski.quiz.entity.Question;
import pl.kaczorowski.quiz.mapper.QuestionMapper;
import pl.kaczorowski.quiz.repository.QuestionRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class QuestionService {

    private QuestionRepository questionRepository;
    private QuestionMapper questionMapper;

    public List<QuestionDto> getQuestions() {
        return questionMapper.mapToQuestionDtoList((List<Question>) questionRepository.findAll());
    }
}
