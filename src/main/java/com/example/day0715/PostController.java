package com.example.day0715;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {
    private List<Post> posts = new ArrayList<>();
    private Long nextId = 1L;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("posts", posts);
        return "post/list";
    }
    @GetMapping("/new")
    public String newPost(Model model) {
        model.addAttribute("post", new Post());
        return "post/form";
    }
    @PostMapping
    public String savePost(@ModelAttribute("post") Post post) {
        post.setId(nextId++); //id를 증가시키는 이유? pk
        post.setCreateAt(LocalDateTime.now()); // 생성시 시간
        posts.add(post);
        return "redirect:/posts";
    }
    @GetMapping("/{id}")
    public String detail(@PathVariable("id") Long id, Model model) {
        Post post = posts.stream()
                .filter(p->p.getId()== id)
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("Post not found"));
        model.addAttribute("post", post);
        return "post/detail";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable("id") Long id){
//        for(Post post : posts) {
//            if(post.getId() == id) {
//                posts.remove(post);
//            }
//        }
        posts.removeIf(p->p.getId()== id);
        return "redirect:/posts";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable("id") Long id, Model model) {
        Post post = posts.stream()
                .filter(p->p.getId()== id)
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("Post not found"));
        model.addAttribute("post",post);
        return "post/edit";
    }

    @PostMapping("/{id}/edit")
    public String edit(@PathVariable("id") Long id, @ModelAttribute Post updatePost){
        Post post = posts.stream()
                .filter(p->p.getId()==id)
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("Post not found"));
        post.setTitle(updatePost.getTitle());
        post.setContent(updatePost.getContent());
        return "redirect:/posts/{id}";
    }
}
