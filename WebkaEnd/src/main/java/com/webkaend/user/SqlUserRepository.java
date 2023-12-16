package com.webkaend.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SqlUserRepository extends UserRepository, JpaRepository<User,Integer> {

}
