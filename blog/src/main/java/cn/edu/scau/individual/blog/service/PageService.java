package cn.edu.scau.individual.blog.service;

import java.util.List;

import cn.edu.scau.individual.blog.entity.Page;
import cn.edu.scau.individual.blog.entity.custom.PageCustom;

/**
 */
public interface PageService {
	//获得页面列表
	public List<PageCustom> listPage(Integer status) throws Exception;

	//根据页面key获得页面
	public PageCustom getPageByKey(Integer status,String key) throws Exception;

	//根据id获取页面
	public PageCustom getPageById(Integer id) throws Exception;

	//添加页面
	public void insertPage(Page page) throws Exception;

	//删除页面
	public void deletePage(Integer id) throws Exception;

	//编辑页面
	public void updatePage(Page page) throws Exception;
}
