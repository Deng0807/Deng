package cn.zDing.ssm.domain;

public class ClassInfo {//图书分类
    /*
    *  `class_id` INT NOT NULL PRIMARY KEY,
    *  `class_name` VARCHAR ( 15 ) NOT NULL */
    private Integer class_id;
    private String class_name;

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }
}
