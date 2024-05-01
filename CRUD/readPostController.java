package ru.first.spring.CRUD;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.first.spring.FakeBase.Faker;
import ru.first.spring.FakeBase.Post;

@RestController
public class readPostController {

    private final Faker fakeDb;

    public readPostController(Faker fakeDb) {
        this.fakeDb = fakeDb;
    }

    @RequestMapping("/show")
    public Post read(@RequestBody Id id) {
        return fakeDb.show(id.getId());
    }

}
