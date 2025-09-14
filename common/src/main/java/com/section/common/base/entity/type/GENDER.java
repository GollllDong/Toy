package com.section.common.base.entity.type;

import lombok.Getter;

@Getter
public enum GENDER {
    M("남자"), G("여자");

    private final String desc;

    GENDER(String desc) {this.desc = desc;}
}