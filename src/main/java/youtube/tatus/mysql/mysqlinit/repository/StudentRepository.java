package youtube.tatus.mysql.mysqlinit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import youtube.tatus.mysql.mysqlinit.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}
