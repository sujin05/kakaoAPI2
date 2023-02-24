package com.example.kakaologin.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SocialUserInfoDTO {
    private Long id;
    private String name;
    private String email;

    public SocialUserInfoDTO(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}