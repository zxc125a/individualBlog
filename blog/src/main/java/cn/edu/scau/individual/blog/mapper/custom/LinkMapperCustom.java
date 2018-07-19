package cn.edu.scau.individual.blog.mapper.custom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.scau.individual.blog.entity.custom.LinkCustom;

/**
 */
public interface LinkMapperCustom {
	
	//获得链接总数
	public Integer countLink(@Param(value = "status") Integer status) throws Exception;
	
	//获得链接列表
	public List<LinkCustom> listLink(@Param(value = "status") Integer status) throws Exception;
	

}
