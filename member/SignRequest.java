package com.sbb.flexrate.member;

/*
응답, 반환 이용 DTO
 */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignRequest {

    private Long id;

    private String account;

    private String password;

    private String nickname;

    private String name;

    private String email;
}
