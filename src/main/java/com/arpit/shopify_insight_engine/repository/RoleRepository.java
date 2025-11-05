package com.arpit.shopify_insight_engine.repository;




import com.arpit.shopify_insight_engine.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    // We'll use this to find our default "ROLE_USER"
    Optional<Role> findByName(String name);
}
