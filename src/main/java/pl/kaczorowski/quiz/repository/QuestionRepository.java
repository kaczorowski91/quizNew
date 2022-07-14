package pl.kaczorowski.quiz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kaczorowski.quiz.entity.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question,Long> {

    Question findByQuestionNumber(String number);
}
