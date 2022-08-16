package cn.zDing.ssm.domain;

import java.util.Date;

public class ReaderInfo {//读者信息
    /*
     `reader_id` BIGINT NOT NULL PRIMARY KEY,
	`name` VARCHAR ( 10 ) NOT NULL,
	`sex` VARCHAR ( 2 ) NOT NULL,
	`birth` date NOT NULL,
	`address` VARCHAR ( 50 ) NOT NULL,
	`phone` VARCHAR ( 15 ) NOT NULL */
    private Integer reader_id;//读者证号
    private String name;//姓名
    private String sex;//性别
    private Date birth;//生日
    private String address;//地址
    private String phone;//电话

    public Integer getReader_id() {
        return reader_id;
    }

    public void setReader_id(Integer reader_id) {
        this.reader_id = reader_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ReaderInfo{" +
                "reader_id=" + reader_id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
