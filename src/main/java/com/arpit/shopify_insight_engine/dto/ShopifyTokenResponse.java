package com.arpit.shopify_insight_engine.dto;



import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ShopifyTokenResponse {
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("scope")
    private String scope;
}
