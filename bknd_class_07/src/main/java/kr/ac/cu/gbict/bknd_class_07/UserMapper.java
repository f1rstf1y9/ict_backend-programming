package kr.ac.cu.gbict.bknd_class_07;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
  public int create(User user);

  public List<User> readAll();

  public User readOne(Long id);

  public int update(User user);
  
  public int delete(Long id);
}
