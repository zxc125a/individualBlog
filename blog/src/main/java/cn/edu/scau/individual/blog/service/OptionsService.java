package cn.edu.scau.individual.blog.service;

import cn.edu.scau.individual.blog.entity.Options;
import cn.edu.scau.individual.blog.entity.custom.OptionsCustom;


/**
 */
public interface OptionsService {
	//获得基本信息
	public OptionsCustom getOptions() throws Exception;

	//新建基本信息
	public void insertOptions(Options options) throws Exception;

	//更新基本信息
	public void updateOptions(Options options) throws Exception;
}
