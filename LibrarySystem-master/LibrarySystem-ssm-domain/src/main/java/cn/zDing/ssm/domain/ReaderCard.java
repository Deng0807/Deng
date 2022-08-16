package cn.zDing.ssm.domain;

public class ReaderCard {//读者登录信息
    /*`reader_id` BIGINT NOT NULL PRIMARY KEY,
     `username` VARCHAR ( 15 ) NOT NULL,
      `password` VARCHAR ( 15 ) NOT NULL */
    private Integer reader_id;//读者证号
    private String username;//用户名
    private String password;//密码


    public Integer getReader_id() {
        return reader_id;
    }

    public void setReader_id(Integer reader_id) {
        this.reader_id = reader_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ReaderCard{" +
                "reader_id=" + reader_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
