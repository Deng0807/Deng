package cn.zDing.ssm.dao;


import cn.zDing.ssm.domain.Admin;
import cn.zDing.ssm.domain.ReaderCard;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {
    @Select({"select * from reader_card where reader_id = #{id} and password = #{passwd}"})
    ReaderCard hasMatchReader(@Param("id") Integer id, @Param("passwd") String  passwd);

    @Select("select * from admin where admin_id = #{id} and password = #{passwd}")
    Admin hasMatchAdmin(@Param("id")Integer id, @Param("passwd")String passwd);

    @Select("select username from admin where admin_id = #{id}")
    String getAdminUsername(@Param("id")Integer id);

    @Select("select * from reader_card where reader_id = #{id}")
    ReaderCard findReaderCardByReaderId(@Param("id")Integer id);
}
