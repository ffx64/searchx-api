package com.ffx64.searchx_api.dto.auth;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TokenResponseDTO(
    @JsonProperty("access_token")
    String accessToken,

    @JsonProperty("refresh_token")
    String refreshToken
) {

}