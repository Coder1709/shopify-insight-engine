package com.arpit.shopify_insight_engine.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stores")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // The user this store belongs to
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    @Column(unique = true, nullable = false)
    private String shopUrl; // e.g., "my-store.myshopify.com"

    @Column(nullable = false, length = 1024)
    private String accessToken; // The Shopify API token

    @Column(nullable = false)
    private String scopes;

    @Column(nullable = false)
    private Instant installedAt;

    // A Store has many insights
    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Insight> insights;
}
