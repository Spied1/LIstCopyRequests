package ru.first.spring.FakeBase;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Component
public class Faker
{
    private Map<Integer,Post> map = this.map = new HashMap<>();;
    int lastId = 11;
    //public Faker(List<Post> allPosts) {
    public Faker()
    {

        for(int i = 0; i < 10; ++i) {
            map.put(i, new Post(i,"https://s.list.am/h/919/78415919.webp", "Mercedes-Benz E-Class, 3.5 л., 2009 г.", 9700, "carSale"));
            map.put(i + 1, new Post(i + 1,"https://s.list.am/h/321/76486321.webp", "Manipulatr.մանիպուլյատոր.манипуляатор, բեռնափոխադրում.կռան", 10000, "construction"));
            map.put(i + 2, new Post(i + 2,"https://s.list.am/h/812/71006812.webp", "Պոլկաներ սառցարան վիտրինա պոլկա սարնարան գորկա հացի պոլկա...", 2000, "itemsSale"));
        }
    }

    public void add(Post post, int id)
    {
        System.out.println("TRYING TO ADD" + id);
        map.put(id, post);
    }

    public void delete(int id)
    {
        System.out.println("deleting " + id);
        map.remove(id);
    }

    public void update(Post post)
    {
        map.put(post.getId(),post);
    }

    public Post show(int id)
    {
        return map.get(id);
    }

    public List<Post> getAllPosts()
    {
        List<Post> temp = new ArrayList<>();

        for (Map.Entry<Integer, Post> entry : map.entrySet()) {
            int key = entry.getKey();
            Post value = entry.getValue();
            temp.add(value);
        }

        return temp;
    }
}
