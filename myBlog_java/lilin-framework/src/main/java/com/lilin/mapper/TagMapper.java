package com.lilin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lilin.entity.Tag;
import org.apache.ibatis.annotations.Mapper;

/**
 * 标签(Tag)表数据库访问层
 *
 * @author makejava
 * @since 2022-09-12 16:04:33
 */
@Mapper
public interface TagMapper extends BaseMapper<Tag> {

}

