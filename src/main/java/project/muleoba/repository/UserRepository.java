package project.muleoba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import project.muleoba.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByuID(Long uID);



    @Query("select u from User u where u.name = :name")
    User findByName(@Param("name") String name);

    @Query("select u from User u where u.email = :email")
    User findEmailUser(@Param("email") String email);

}
