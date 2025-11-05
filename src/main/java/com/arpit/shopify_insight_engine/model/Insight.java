package com.arpit.shopify_insight_engine.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "insights")
public class Insight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // The store this insight belongs to
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id", nullable = false)
    private Store store;

    @Column(nullable = false)
    private String title; // e.g., "Returning Customers Dropped 18%"

    @Column(nullable = false, length = 2048)
    private String description; // "Why this matters..."

    @Column(nullable = false, length = 1024)
    private String suggestedAction; // "Suggested Action: Offer a loyalty discount."

    @Column(nullable = false)
    private String category; // e.g., "RETENTION", "SALES_OPPORTUNITY"

    @Column(nullable = false)
    private String severity; // e.g., "LOW", "MEDIUM", "HIGH"

    @Column(nullable = false)
    private Instant createdAt;

    @Builder.Default
    private boolean isRead = false;
}
