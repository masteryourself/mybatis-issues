package test;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface Mapper {
  
  @Select("select * from users where data ?? #{key}")
  List<User> usersWithKey(String key);
}
