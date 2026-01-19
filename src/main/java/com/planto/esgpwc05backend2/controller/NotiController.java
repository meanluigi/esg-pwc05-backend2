package com.planto.esgpwc05backend2.controller;


import com.planto.esgpwc05backend2.dao.NotiMapper;
import com.planto.esgpwc05backend2.domain.NotiVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/noti")
public class NotiController {
    private final NotiMapper notiMapper;
    public NotiController(NotiMapper notiMapper) {
        this.notiMapper = notiMapper;
    }
    @GetMapping("/latest")
    public List<NotiVO> latest() {
        return notiMapper.selectLatest();
    }
    @GetMapping("/ping")
    public int ping() {
    return notiMapper.ping();
    }
}
