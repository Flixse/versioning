package com.example.versioning.feature.common.account;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class HRef {
    private List<HRefDetail> address;
}
