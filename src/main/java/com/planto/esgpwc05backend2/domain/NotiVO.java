package com.planto.esgpwc05backend2.domain;

import lombok.Data;

@Data
public class NotiVO {
    private Long notiNo;
    private String notiSj;   // 제목
    private String regDtm;
}