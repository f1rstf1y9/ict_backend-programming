package kr.ac.cu.gbict.bknd_class_07;

import java.util.List;

public interface UserService {
  public int create(User user);

  public List<User> readAll();

  public User readOne(Long id);

  public int update(Long id, User user);

  public int delete(Long id);
}
