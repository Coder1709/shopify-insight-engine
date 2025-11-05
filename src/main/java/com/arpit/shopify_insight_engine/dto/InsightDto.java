package com.arpit.shopify_insight_engine.dto;



import lombok.Builder;
import lombok.Data;
import java.time.Instant;

@Data
@Builder
public class InsightDto {
    private Long id;
    private String title;
    private String description;
    private String suggestedAction;
    private String category;
    private String severity;
    private Instant createdAt;
    private boolean isRead;
}