package com.tolgu.blog.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AccessResponseDTO {
    private final String name;
    private final int amount;
}
