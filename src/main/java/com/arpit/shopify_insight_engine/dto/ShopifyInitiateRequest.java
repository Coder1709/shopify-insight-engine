package com.arpit.shopify_insight_engine.dto;




import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ShopifyInitiateRequest {
    // e.g., "my-store.myshopify.com"
    private String shopUrl;
}