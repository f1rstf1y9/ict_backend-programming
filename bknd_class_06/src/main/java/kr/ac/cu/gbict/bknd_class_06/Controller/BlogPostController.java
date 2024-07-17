package kr.ac.cu.gbict.bknd_class_06.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.cu.gbict.bknd_class_06.Service.BlogPostService;
import kr.ac.cu.gbict.bknd_class_06.VO.BlogPost;

@RestController
public class BlogPostController {
  
  @Autowired
  private BlogPostService service;

  @GetMapping("/board") 
  public List<BlogPost> board() {
    List<BlogPost> posts = service.readAll();
    return posts;
  }

  @GetMapping("/post/{postId}")
  public BlogPost getPost(@PathVariable("postId") Long postId) {
    BlogPost post = service.readPost(postId);
    return post;
  }

  @PostMapping("/post")
  public BlogPost createPost(@RequestBody BlogPost post) {
    return service.createPost(post);
  }

  @PutMapping("/post/{postId}")
  public BlogPost updatePost(@PathVariable("postId") Long postId, @RequestBody BlogPost post) {
    return service.updatePost(postId, post);
  }

  @GetMapping("/postbyauthor/{author}")
  public List<BlogPost> getByAuthor(@PathVariable("author") String author) {
    List<BlogPost> posts = service.readByAuthor(author);
    return posts;
  }
}
