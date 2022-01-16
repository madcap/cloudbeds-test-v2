package com.example.cloudbedstest.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.cloudbedstest.entity.AddressEntity;

@Repository
public interface AddressEntityRepository extends JpaRepository<AddressEntity, BigInteger> {
}
