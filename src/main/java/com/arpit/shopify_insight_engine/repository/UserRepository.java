package com.arpit.shopify_insight_engine.repository;



import com.arpit.shopify_insight_engine.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Spring Security will use this to find a user by their email
    Optional<User> findByEmail(String email);

    // We'll need this for registration
    boolean existsByEmail(String email);
}
