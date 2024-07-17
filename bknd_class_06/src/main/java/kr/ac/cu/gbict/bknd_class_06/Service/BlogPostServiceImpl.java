package kr.ac.cu.gbict.bknd_class_06.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.cu.gbict.bknd_class_06.DTO.BlogPostRepository;
import kr.ac.cu.gbict.bknd_class_06.VO.BlogPost;

@Service
public class BlogPostServiceImpl implements BlogPostService{
  @Autowired
  private BlogPostRepository blogPostRepository;

  @Override
  public List<BlogPost> readAll() {
    return blogPostRepository.findAll();
  }

  @Override
  public BlogPost createPost(BlogPost post) {
    BlogPost createdPost = blogPostRepository.save(post);
    return createdPost;
  }

  @Override
  public BlogPost readPost(Long id) {
    return blogPostRepository.findById(id).orElse(null);
  }

  @Override
  public BlogPost updatePost(Long id, BlogPost post) {
    BlogPost updatedPost = blogPostRepository.findById(id).orElse(null);
    if (updatedPost != null) {
      updatedPost.setSubject(post.getSubject());
      updatedPost.setArticle(post.getArticle());
      updatedPost = blogPostRepository.save(updatedPost);
    }
    return updatedPost;
  }
  
  @Override
  public List<BlogPost> readByAuthor(String author) {
    return blogPostRepository.findByAuthorOrderByCreatedAtDesc(author);
  }
}
