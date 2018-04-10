package com.solutiondots.demo.repositories;

import com.solutiondots.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Arif Heer on 04/09/2018
 *
 *
 * User repository for CRUD operations .
 *
 * its manage our database and our our database model information is given here
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
