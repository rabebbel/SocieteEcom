package com.net.societe.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.societe.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
