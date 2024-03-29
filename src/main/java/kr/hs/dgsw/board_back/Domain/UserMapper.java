package kr.hs.dgsw.board_back.Domain;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select id, account, username, email, created, updated from user")
    List<User> findAll();

    @Delete("delete from user where id=#{id}")
    int deleteById(@Param("id") Long id);

    Long add(User user);
    int modify(User user);
    User findById(@Param("id") Long id);

    @Select("select id, account, username, email, created, updated from user " +
            "where account=#{account} and password=#{password}")
    User findByAccountAndPassword(@Param("account") String account, @Param("password") String password);
}
