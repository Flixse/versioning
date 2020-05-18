package com.example.versioning.feature.common.account;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountV3 {
    private String firstName1;
    private String firstName2;
    private String lastName1;
    private String lastName2;
    private HRef href;
}
