package cn.edu.scau.individual.blog.entity.custom;

import cn.edu.scau.individual.blog.entity.User;

/**
 * 用户信息的扩展
 */
public class UserCustom extends User {
    //用户的文章数
    private Integer articleCount;

    public Integer getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(Integer articleCount) {
        this.articleCount = articleCount;
    }
}
