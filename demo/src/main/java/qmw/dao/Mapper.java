package qmw.dao;


import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import qmw.Hello.Hello;
@org.apache.ibatis.annotations.Mapper
@Component
public interface Mapper {

    @Select("select * from hello where id = #{id}")
    Hello getHello(Integer id);

    @Delete("delete from hello where id = #{id}")
    Hello delHello(Integer id);

    @Insert("insert into hello(id,name,age)values(#{id},#{name},#{age})")
    int addHello(Hello hello);

    @Update("update hello set id = #{hello.id},name = #{hello.name},age = #{hello.age} where id = #{id}")
    int updateGHello(@Param("id") int id, @Param("hello") Hello hello);
}
