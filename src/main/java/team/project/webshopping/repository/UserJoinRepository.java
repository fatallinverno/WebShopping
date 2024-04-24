package team.project.webshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.project.webshopping.entity.UserJoinEntity;

public interface UserJoinRepository extends JpaRepository<UserJoinEntity, String> {

}
