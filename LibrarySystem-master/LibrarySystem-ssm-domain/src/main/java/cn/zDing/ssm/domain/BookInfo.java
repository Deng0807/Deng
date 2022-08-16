package cn.zDing.ssm.domain;

public class BookInfo {//图书信息
    /*
    * `book_id` BIGINT NOT NULL PRIMARY KEY,
	`name` VARCHAR ( 20 ) NOT NULL,
	`author` VARCHAR ( 15 ) NOT NULL,
	`publish` VARCHAR ( 20 ) NOT NULL,
	`ISBN` VARCHAR ( 15 ) NOT NULL,
	`introduction` TEXT,
	`language` VARCHAR ( 4 ) NOT NULL,
	`price` DECIMAL ( 10, 2 ) NOT NULL,
	`pub_date` DATE NOT NULL,
	`class_id` INT DEFAULT NULL,
	`number` INT DEFAULT NULL */
    private Integer book_id;//图书ID
    private String name;//书名
    private String author;//作者
    private String publish;//出版社
    private String ISBN;//国际标准书号
    private String introduction;//简介
    private String language;//语言
    private String price;//价格
    private String pub_date;//出版日期
    private String class_id;//分类号
    private String number;//数量

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPub_date() {
        return pub_date;
    }

    public void setPub_date(String pub_date) {
        this.pub_date = pub_date;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "book_id=" + book_id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", introduction='" + introduction + '\'' +
                ", language='" + language + '\'' +
                ", price='" + price + '\'' +
                ", pub_date='" + pub_date + '\'' +
                ", class_id='" + class_id + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
