package controller;

import model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class homeController {
 @RequestMapping("/")
    public String getAllPost(Model model) {
        ArrayList<Post> posts = new ArrayList<>();
        Post post1 = new Post();
        post1.setTitle("post1");
        post1.setBody("p1 body");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("post2");
        post2.setBody("p2 body");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("post3");
        post3.setBody("p3 Body");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        model.addAttribute("posts", posts);

        return "index";

    }
}