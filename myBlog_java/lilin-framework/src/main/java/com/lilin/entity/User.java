package com.lilin.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户表(User)表实体类
 *
 * @author makejava
 * @since 2022-09-07 13:44:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("sys_user")
public class User {
    //主键
    @TableId
    private Long id;
    //用户名
    @TableField("user_name")
    private String username;
    //昵称
    @TableField("nick_name")
    private String nickName;
    //密码
    private String password;
    //用户类型：0代表普通用户，1代表管理员
    private String type;
    //账号状态（0正常 1停用）
    private String status;
    //邮箱
    private String email;
    //手机号
    private String phonenumber;
    //用户性别（0男，1女，2未知）
    private String sex;
    //头像
    private String avatar;
    //创建人的用户id
    @TableField("create_by")
    private Long createBy;
    //创建时间
    @TableField("create_time")
    private Date createTime;
    //更新人
    @TableField("update_by")
    private Long updateBy;
    //更新时间
    @TableField("update_time")
    private Date updateTime;
    //删除标志（0代表未删除，1代表已删除）
    @TableField("del_flag")
    private Integer delFlag;

}

