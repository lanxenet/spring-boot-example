package org.inspireso.springboot.repository;

import java.util.List;

import org.inspireso.springboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by lanxe on 2017/3/28.
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    List<User> findByNameLike(String username);

    @Query("FROM User WHERE sex = :sex AND address LIKE :address")
    List<User> find(@Param("sex") int sex, @Param("address") String address);

    @Query(value = "SELECT * FROM user WHERE sex = :sex AND address LIKE :address", nativeQuery = true)
    List<User> findByNative(@Param("sex") int sex, @Param("address") String address);

    @Modifying
    @Query("UPDATE User SET name = :name WHERE id = :id")
    int updateNameById(@Param("id") String id, @Param("name") String name);

}
