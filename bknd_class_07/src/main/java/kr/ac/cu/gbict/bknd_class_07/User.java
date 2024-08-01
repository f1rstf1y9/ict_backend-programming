package kr.ac.cu.gbict.bknd_class_07;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class User {
  @Setter
  private long id;
  
  @Setter
  private String name;
  
  @Setter
  private String email;

  private LocalDateTime created;
  private LocalDateTime updated;
}
