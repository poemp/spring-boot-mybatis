package org.poem.mapper;

import org.apache.ibatis.annotations.*;
import org.poem.entity.PlatformUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlatformUserMapper {

    @Select("SELECT * from PLATFORM_USER WHERE ID=#{id} ")
    PlatformUser getUserById(Integer id);

    @Select("SELECT * FROM PLATFORM_USER")
    public List<PlatformUser> getUserList();

    @Insert("INSERT INTO PLATFORM_USER(USERNAME, AGE, CTM) VALUES(#{username}, #{age}, now())")
    public int add(PlatformUser user);

    @Update("UPDATE PLATFORM_USER SET USERNAME = #{user.username} , AGE = #{user.age} WHERE ID = #{id}")
    public int update(@Param("id") Integer id, @Param("user") PlatformUser user);

    @Delete("DELETE FROM PLATFORM_USER WHERE ID = #{id} ")
    public int delete(Integer id);
}
