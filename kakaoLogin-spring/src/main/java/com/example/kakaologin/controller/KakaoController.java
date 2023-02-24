package com.example.kakaologin.controller;

import com.example.kakaologin.dto.SocialUserInfoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kakaologin.service.KakaoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
public class KakaoController {

    private final KakaoService kakaoService;

    /**
     * https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=9cc2a09d65ff48ddf1f2da3d2ff03e43&redirect_uri=http://localhost:8080/callback
     * 위의 결과로 code를 받아와서, 해당 코드를 통해 카카오 인증 서버에서 accessToken/refreshToken을 받아옵니다.
     */
    @GetMapping("/callback")
    public SocialUserInfoDTO getSocialUserInfoDTO(@RequestParam("code") String code) {
        log.debug("code = {}", code);
        return kakaoService.getInfo(code).getSocialUserInfoDTO();
    }
}
