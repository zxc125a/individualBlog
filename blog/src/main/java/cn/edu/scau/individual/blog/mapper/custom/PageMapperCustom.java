package cn.edu.scau.individual.blog.mapper.custom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.scau.individual.blog.entity.custom.PageCustom;

/**
 */
public interface PageMapperCustom {
	//获得页面列表
	public List<PageCustom> listPage(@Param(value="status") Integer status) throws Exception;

	//根据key获得页面
	public PageCustom getPageByKey(@Param(value="status") Integer status,@Param(value="key")String key) throws Exception;
}
