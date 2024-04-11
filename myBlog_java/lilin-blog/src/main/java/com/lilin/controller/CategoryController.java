package com.lilin.controller;
import com.lilin.annotation.SystemLog;
import com.lilin.service.CategoryService;
import com.lilin.utils.ResponseResult;
import com.lilin.vo.CategoryVo;
import com.plumelog.trace.annotation.Trace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by LiLin on 2022/9/5/10:45:30
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @SystemLog(businessName = "获取文章分类")
    @GetMapping("/getCategoryList")
    @Trace
    public ResponseResult<Object> getCategoryList() {
        List<CategoryVo> categoryList = categoryService.getCategoryList();
        return ResponseResult.okResult(categoryList);
    }
}
