package com.planto.esgpwc05backend2.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class NotiVO {

    private int notiNo;          // NOTI_NO
    private String notiFrom;      // NOTI_FROM
    private String notiSj;        // NOTI_SJ
    private String jumpParam;     // JUMP_PARAM (JSON 문자열)
    private LocalDateTime regDt;  // REG_DT
    private String regId;         // REG_ID
    private LocalDateTime updateDt; // UPDATE_DT
    private String updateId;      // UPDATE_ID
    // --- getter / setter ---
}