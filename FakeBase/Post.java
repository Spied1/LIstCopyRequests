package ru.first.spring.FakeBase;

public class Post
{
    private int id;
    private String imgUrl;
    private String title;
    private int price;
    private String type_of_post;

    public Post()
    {

    }

    public Post(int id, String imgUrl, String title, int price, String type_of_post) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.title = title;
        this.price = price;
        this.type_of_post = type_of_post;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTypeOfPost() {
        return type_of_post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
