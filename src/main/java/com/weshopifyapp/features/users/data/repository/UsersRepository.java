package com.weshopifyapp.features.users.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weshopifyapp.features.users.data.models.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
