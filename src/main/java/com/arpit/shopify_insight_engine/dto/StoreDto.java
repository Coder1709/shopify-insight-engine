package com.arpit.shopify_insight_engine.dto;



import lombok.Builder;
import lombok.Data;
import java.time.Instant;

@Data
@Builder
public class StoreDto {
    private Long id;
    private String shopUrl;
    private Instant installedAt;
    private boolean isConnected; // Simple boolean for the UI
    private int insightCount;
}