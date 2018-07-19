package cn.edu.scau.individual.blog.service;

import java.util.List;

import cn.edu.scau.individual.blog.entity.Menu;
import cn.edu.scau.individual.blog.entity.custom.MenuCustom;

public interface MenuService {
    //获得菜单列表
    public List<MenuCustom> listMenu(Integer status) throws Exception;

    //添加菜单项目
    public void insertMenu(Menu menu) throws Exception;

    //删除菜单项目
    public void deleteMenu(Integer id) throws Exception;

    //更新菜单项目
    public void updateMenu(Menu menu) throws Exception;

    //根据id获得菜单项目信息
    public MenuCustom getMenuById(Integer id) throws Exception;
}
