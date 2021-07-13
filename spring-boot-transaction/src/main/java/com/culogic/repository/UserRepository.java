package com.culogic.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.culogic.modal.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}