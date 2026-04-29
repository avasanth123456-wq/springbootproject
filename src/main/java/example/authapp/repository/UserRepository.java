package example.authapp.repository;

import example.authapp.entity.UserAuth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserAuth, Long> {

    Optional<UserAuth> findByEmail(String email);
}