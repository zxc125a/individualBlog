package cn.edu.scau.individual.blog.mapper.custom;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.scau.individual.blog.entity.Tag;
import cn.edu.scau.individual.blog.entity.custom.ArticleCustom;
import cn.edu.scau.individual.blog.entity.custom.TagCustom;

/**
 */
public interface TagMapperCustom {
	//获得标签总数
	public Integer countTag(@Param(value = "status") Integer status) throws Exception;
	
	//获得标签列表
	public List<TagCustom> listTag(@Param(value = "status")Integer status) throws Exception;

	//获得带有该标签的文章列表
	public List<ArticleCustom> listArticleWithTagByPage(@Param(value = "status") Integer status,@Param(value = "tagId") Integer tagId, @Param(value="startPos") Integer startPos, @Param(value="pageSize") Integer pageSize) throws Exception;

	//根据标签名获取标签
	public Tag  getTagByName(String name) throws Exception;

}
