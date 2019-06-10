package kr.hs.dgsw.board_back.Domain;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PostMapper {

    List<Post> findAll();

    @Delete("delete from post where id=#{id}")
    int deleteById(@Param("id") Long id);

    @Select("select id, user_id as userId, title, content, created, updated from post where id=${id}")
    Post findById(@Param("id") Long id);

    Long add(Post post);
    int modify(Post post);
    List findByUserId(Long userId);

    int addWithHashMap(HashMap<String, Object> map);

}
