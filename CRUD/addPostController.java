package ru.first.spring.CRUD;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.first.spring.FakeBase.Faker;
import ru.first.spring.FakeBase.Post;

@RestController
public class addPostController
{
    private int id = 12;
    private final Faker fakeDb;

    public addPostController(Faker fakeDb) {
        this.fakeDb = fakeDb;
    }

    //TODO: add some kind of check if user is loged in or not
    @PostMapping("/addPost")
    public void addPost(@RequestBody Post post){

        if(post.getId() == 0){
            System.out.println(post.getTitle());
            post.setId(id);
            fakeDb.add(post, post.getId());
            id++;
        }
    }
}
