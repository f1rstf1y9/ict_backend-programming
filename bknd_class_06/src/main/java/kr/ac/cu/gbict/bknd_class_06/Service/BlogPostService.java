package kr.ac.cu.gbict.bknd_class_06.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.ac.cu.gbict.bknd_class_06.VO.BlogPost;

@Service
public interface BlogPostService {
  List<BlogPost> readAll();

  BlogPost createPost(BlogPost post);

  BlogPost readPost(Long id);

  BlogPost updatePost(Long id, BlogPost post);

  List<BlogPost> readByAuthor(String author);
}
