package ru.first.spring.search;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.first.spring.FakeBase.Faker;
import ru.first.spring.FakeBase.Post;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController
{
    private final Faker dfFaker;

    public SearchController(Faker dfFaker) {
        this.dfFaker = dfFaker;
    }

    //Remove Mapping to get ability of returning POST
    //@GetMapping("/")
    @GetMapping("/search")
    public List<Post> search(@RequestBody SearchRequest searchRequest){
        List<Post> temp = dfFaker.getAllPosts();
        List<Post> returnablePosts = new ArrayList<>();
        for(Post x:temp){
            if(x.getTitle().contains(searchRequest.SearchText)){
                returnablePosts.add(x);
            }
        }

        System.out.println(searchRequest.SearchText);

        return returnablePosts;
    }
}
