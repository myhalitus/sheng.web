package com.msl.minibatis.mapper;

import com.msl.minibatis.annotation.Entity;
import com.msl.minibatis.annotation.Select;
import com.msl.minibatis.entity.User;

@Entity(User.class)
public interface UserMapper {

    @Select("select * from user where id = ?")
    public User selectUserById(Integer id);

    @Select("selet * from user where birth_day = ?")
    public  User selectUserByBirthDay(String birthDay);

}
