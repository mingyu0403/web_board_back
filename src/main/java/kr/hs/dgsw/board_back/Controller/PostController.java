package kr.hs.dgsw.board_back.Controller;

import kr.hs.dgsw.board_back.Domain.Post;
import kr.hs.dgsw.board_back.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/getAllPosts")
    public List getAllPosts(){
        return this.postService.findAll();
    }
    @GetMapping("/getPost/{id}")
    public Post getPost(@PathVariable Long id){
        return this.postService.findById(id);
    }
    @PostMapping("/addPost")
    public Long addPost(@RequestBody Post post){
        return this.postService.add(post);
    }
    @PutMapping("/editPost")
    public int modifyPost(@RequestBody Post post){
        return this.postService.modify(post);
    }
    @DeleteMapping("/deletePost/{id}")
    public int deletePost(@PathVariable Long id){
        return this.postService.deleteById(id);
    }

}
