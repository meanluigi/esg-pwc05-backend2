package com.planto.esgpwc05backend2.dao;

import com.planto.esgpwc05backend2.domain.NotiVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NotiMapper {

    @Select("select 1")
    int ping();

    List<NotiVO> selectLatest();
}
