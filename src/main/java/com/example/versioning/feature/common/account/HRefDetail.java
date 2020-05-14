package com.example.versioning.feature.common.account;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class HRefDetail {
    private String href;
    private String httpMethod;
    private List<String> neededFields;
    private List<String> neededHeaders;
}