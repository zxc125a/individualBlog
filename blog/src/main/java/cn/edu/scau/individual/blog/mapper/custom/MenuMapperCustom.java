package cn.edu.scau.individual.blog.mapper.custom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.scau.individual.blog.entity.custom.MenuCustom;

public interface MenuMapperCustom {
    //获得菜单列表
    public List<MenuCustom> listMenu(@Param(value = "status") Integer status) throws Exception;
}
