package com.lilin.controller;

import com.lilin.annotation.SystemLog;
import com.lilin.service.ArticleService;
import com.lilin.utils.ResponseResult;
import com.lilin.vo.ArticleDetailVo;
import com.lilin.vo.PageVo;
import com.plumelog.trace.annotation.Trace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by LiLin on 2022/9/3/16:11:44
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * @Author lilin
     * @Date 2022/9/4 15:11:08
     * @Return
     * @Description 获取热门文章
     */
    @SystemLog(businessName = "获取热门文章")
    @GetMapping("hotArticleList")
    @Trace
    public ResponseResult<Object> hotArticleList() {
        return articleService.getHotArticleList();
    }

    /**
     * @Author lilin
     * @Date 2022/9/5 15:22:10
     * @param pageNum 分页数量
     * @param pageSize 每页的大小
     * @param categoryId 文章 id
     * @Return
     * @Description 查询文章内容
     */
    @SystemLog(businessName = "查询文章内容")
    @GetMapping("/articleList")
    @Trace
    public ResponseResult<Object> articleList(Integer pageNum, Integer pageSize, Long categoryId) {
        PageVo pageVo = articleService.getArticleList(pageNum, pageSize, categoryId);
        return ResponseResult.okResult(pageVo);
    }

    /**
     * @Author lilin
     * @Date 2022/9/6 15:14:03
     * @param id 文章 id
     * @Return
     * @Description 查询文章详情
     */
    @SystemLog(businessName = "查询文章详情")
    @GetMapping("/{id}")
    @Trace
    public ResponseResult<Object> getArticleDetail(@PathVariable("id") Long id) {
        ArticleDetailVo articleDetailVo = articleService.getArticleDetail(id);
        return ResponseResult.okResult(articleDetailVo);
    }

    /**
     * @Author lilin
     * @Date 2022/9/12 13:21:24
     * @param id 文章 id
     * @Return
     * @Description 修改文章浏览量
     */
    @SystemLog(businessName = "修改文章浏览量")
    @PutMapping("/updateViewCount/{id}")
    @Trace
    public ResponseResult<Object> updateViewCount(@PathVariable Long id) {
        return articleService.updateViewCount(id);
    }
}
