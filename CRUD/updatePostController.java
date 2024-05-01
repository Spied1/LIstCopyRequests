package ru.first.spring.CRUD;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.first.spring.FakeBase.Faker;
import ru.first.spring.FakeBase.Post;

@RestController
public class updatePostController {
    private final Faker fakeDb;

    public updatePostController(Faker fakeDb) {
        this.fakeDb = fakeDb;
    }

    @PutMapping("/update")
    public void update(@RequestBody Post post){
        fakeDb.update(post);
    }
}
