package cn.edu.scau.individual.blog.mapper.custom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.scau.individual.blog.entity.custom.NoticeCustom;

/**
 */
public interface NoticeMapperCustom {
	
	//获得公告总数
	public Integer countNotice(@Param(value = "status") Integer status) throws Exception;
	
	//获得公告列表
	public List<NoticeCustom> listNotice(@Param(value = "status") Integer status) throws Exception;


}
