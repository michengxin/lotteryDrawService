package org.springboot.entity;



import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springboot.config.SupperModel.SupperModel;

import java.util.Date;

/**
 * @author michengxin
 * @description
 * @date 2020/5/11 14:55
 */
@Data
@SuppressWarnings("serial")
@TableName("t_sys_user")
public class User extends SupperModel<User> {
    @TableField()
    String userCode; //名字
    @TableField()
    String password;//密码
    @TableField()
    String salt;//加密盐
    @TableField()
    String userType;//用户类型
    @TableField()
    String locked;//账号是否锁定，1：锁定，0未锁定
    @TableField()
    String name;//姓名
    @TableField()
    String email;//邮件
    @TableField()
    String phone;//电话
    @TableField()
    String openid;//微信openid
    @TableField()
    String userImg;//用户头像
    @TableField()
    String wehatNickname;//微信昵称
    @TableField()
    Date dimissionTime;//离职日期
    @TableField()
    Date entryTime;//入职日期

    @TableField(exist = false)
    String oldPassword;//旧密码
    @TableField(exist = false)
    String newPassword;//新密码
}
