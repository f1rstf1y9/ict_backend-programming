package kr.ac.cu.gbict.bknd_class_07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper mapper;

  @Override
  public int create(User user) {
    // 이 부분에 데이터 유효성 검증 등의 비즈니스 로직을 구현
    int affected = mapper.create(user);
    return affected;
  }

  @Override
  public List<User> readAll() {
    return mapper.readAll();
  }

  @Override
  public User readOne(Long id) {
    return mapper.readOne(id);
  }

  @Override
  public int update(Long id, User user) {
    user.setId(id);
    return mapper.update(user);
  }

  @Override
  public int delete(Long id) {
    return mapper.delete(id);
  }
}
