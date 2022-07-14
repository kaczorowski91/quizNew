package pl.kaczorowski.quiz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kaczorowski.quiz.entity.UserAnswer;

@Repository
public interface UserAnswerRepository extends CrudRepository<UserAnswer, Long> {
}
