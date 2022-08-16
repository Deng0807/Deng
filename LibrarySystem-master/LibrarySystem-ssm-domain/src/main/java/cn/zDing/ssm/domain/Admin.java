package cn.zDing.ssm.domain;

public class Admin {//管理员
    /*
    *  `admin_id` BIGINT NOT NULL PRIMARY KEY,
    *  `password` VARCHAR ( 15 ) NOT NULL,
    * `username` VARCHAR ( 15 ) DEFAULT NULL
    * */
    private Integer admin_id;
    private String username;
    private String password;


    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
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
        return "Admin{" +
                "admin_id=" + admin_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

