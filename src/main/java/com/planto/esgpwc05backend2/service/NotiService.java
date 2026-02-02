package com.planto.esgpwc05backend2.service;

import com.planto.esgpwc05backend2.dao.NotiDAO;
import com.planto.esgpwc05backend2.domain.NotiVO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Service
public class NotiService {
    private final NotiDAO notiDAO;
    public NotiService(NotiDAO notiDAO) {
        this.notiDAO = notiDAO;
    }
    public int insertNoti(@RequestBody Map<String, Object> map) {
        return notiDAO.insertNoti(map);
    }
    public int updateNoti(@RequestBody Map<String, Object> map) { return notiDAO.updateNoti(map); }
}
