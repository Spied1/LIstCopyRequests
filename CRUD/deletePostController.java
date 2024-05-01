package ru.first.spring.CRUD;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.first.spring.FakeBase.Faker;

@RestController
public class deletePostController{
    private final Faker fakeDb;

    public deletePostController(Faker fakeDb){
        this.fakeDb = fakeDb;
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Id id){
        fakeDb.delete(id.getId());
    }
}

