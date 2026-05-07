package instagram.repositorylayer;

import instagram.entitylayer.Follow;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, Long>{

}
