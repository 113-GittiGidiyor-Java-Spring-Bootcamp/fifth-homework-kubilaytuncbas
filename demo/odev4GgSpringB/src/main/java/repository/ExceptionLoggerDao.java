package repository;

import model.EducationAppErrorResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExceptionLoggerDao extends JpaRepository<EducationAppErrorResponse,Integer> {
}
