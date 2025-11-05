package com.arpit.shopify_insight_engine.dto;



import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ShopifyTokenRequest {
    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonProperty("code")
    private String code;
}
