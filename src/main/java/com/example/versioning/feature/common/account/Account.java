package com.example.versioning.feature.common.account;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
    private String firstName;
    private String lastName;
}
