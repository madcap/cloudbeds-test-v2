package com.example.cloudbedstest.repository;

import java.math.BigInteger;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.cloudbedstest.entity.UserEntity;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, BigInteger> {

	// note: this search is case-sensitive
	@Query("from UserEntity user left join fetch user.address address where address.country = ?1")
	Set<UserEntity> findByCountry(String country);

}
