package com.planto.esgpwc05backend2.dao;

import com.planto.esgpwc05backend2.domain.NotiVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface NotiDAO {

    @Select("select 1")
    int ping();

    List<NotiVO> selectLatest();

    int insertNoti(Map<String, Object> map);
    int updateNoti(Map<String, Object> map);
    int deleteNoti(Map<String, Object> map);
}
