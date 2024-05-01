package ru.first.spring.mainPage;

import org.springframework.web.bind.annotation.*;
import ru.first.spring.FakeBase.Faker;
import ru.first.spring.FakeBase.Post;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class MainPageController
{
    private final Faker dfFaker;

    public MainPageController(Faker dfFaker) {
        this.dfFaker = dfFaker;
    }

    @GetMapping("/cars")
    public List<Post> getCars(){
        List<Post> temp = dfFaker.getAllPosts();
        List<Post> returnable_posts = new ArrayList<>();

        for(Post x:temp){
            if(Objects.equals(x.getTypeOfPost(), "carSale")){
                returnable_posts.add(x);
            }
        }

        return returnable_posts;
    }

    @GetMapping("/filtering")
    public List<Post> getFiltererd(@RequestParam("filter") String name){
        List<Post> temp = dfFaker.getAllPosts();
        List<Post> returnablePosts = new ArrayList<>();
        for(Post x:temp){
            if(Objects.equals(x.getTypeOfPost(), name)){
                returnablePosts.add(x);
            }
        }

        return returnablePosts;
    }


    @GetMapping("/construction")
    public List<Post> getConstruction(){
        List<Post> temp = dfFaker.getAllPosts();
        List<Post> returnable_posts = new ArrayList<>();
        for(Post x:temp){
            if(Objects.equals(x.getTypeOfPost(), "construction")){
                returnable_posts.add(x);
            }
        }

        return returnable_posts;
    }

    @GetMapping("/itemsSale")
    public List<Post> getitemsSale(){
        List<Post> temp = dfFaker.getAllPosts();
        List<Post> returnable_posts = new ArrayList<>();
        for(Post x:temp){
            if(Objects.equals(x.getTypeOfPost(), "itemsSale")){
                returnable_posts.add(x);
            }
        }

        return returnable_posts;
    }

    @GetMapping("/data")
    public List<Post> getAllPosts(){

        return dfFaker.getAllPosts();
    }

}
