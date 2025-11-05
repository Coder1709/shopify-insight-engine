package com.arpit.shopify_insight_engine.dto;



import lombok.Builder;
import lombok.Data;
import java.util.Set;

@Data
@Builder
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Set<String> roles;
    private StoreDto store; // Include StoreDto if it exists
}