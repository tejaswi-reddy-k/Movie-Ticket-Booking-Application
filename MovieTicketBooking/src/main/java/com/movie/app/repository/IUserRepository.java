ackage com.movie.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.app.entity.User;

public interface IUserRepository extends JpaRepository<User, Long> {


	
}
