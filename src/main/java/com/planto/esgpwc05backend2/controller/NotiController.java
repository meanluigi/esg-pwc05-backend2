package com.planto.esgpwc05backend2.controller;


import com.planto.esgpwc05backend2.dao.NotiDAO;

import com.planto.esgpwc05backend2.domain.NotiVO;
import com.planto.esgpwc05backend2.service.NotiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/noti")
public class NotiController {

    @Autowired
    NotiService service;

    private final NotiDAO notiDAO;
    public NotiController(NotiDAO notiDAO) {
        this.notiDAO = notiDAO;
    }
    /**
     * 알림 읽기(최근 꺼)
     */
    @GetMapping("/latest")
    public List<NotiVO> latest() {
        return notiDAO.selectLatest();
    }
    @GetMapping("/ping")
    public int ping() {
    return notiDAO.ping();
    }
    /**
     * 알림 생성
     */
    @RequestMapping(value = "/insertNoti.do")
    public ModelAndView insertNoti(@RequestBody Map<String, Object> map) {
        ModelAndView mav = new ModelAndView("jsonView");
        service.insertNoti(map);
        return mav;
    }
    /**
     * 알림 수정
     */
    @RequestMapping(value = "/updateNoti.do")
    public ModelAndView updateNoti(@RequestBody Map<String, Object> map) {
        ModelAndView mav = new ModelAndView("jsonView");
        service.updateNoti(map);
        return mav;
    }
    /**
     * 알림 삭제(수정이랑 거의 동일)
     */
    @RequestMapping(value = "/deleteNoti.do")
    public ModelAndView deleteNoti(@RequestBody Map<String, Object> map) {
        ModelAndView mav = new ModelAndView("jsonView");
        service.deleteNoti(map);
        return mav;
    }
}
