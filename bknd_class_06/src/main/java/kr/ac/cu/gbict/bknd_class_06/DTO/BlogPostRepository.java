package kr.ac.cu.gbict.bknd_class_06.DTO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.ac.cu.gbict.bknd_class_06.VO.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
  public List<BlogPost> findByAuthor(String author);
  public List<BlogPost> findByAuthorOrderByCreatedAtDesc(String author);
}
