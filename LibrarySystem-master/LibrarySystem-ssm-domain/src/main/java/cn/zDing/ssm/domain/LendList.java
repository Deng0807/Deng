package cn.zDing.ssm.domain;

import java.util.Date;

public class LendList {//借还日志
    /*`ser_num` BIGINT NOT NULL PRIMARY KEY,
	`book_id` BIGINT NOT NULL,
	`reader_id` BIGINT NOT NULL,
	`lend_date` date DEFAULT NULL,
	`back_date` date DEFAULT NULL */
    private Integer ser_num;//流水号
    private Integer book_id;//图书ID
    private Integer reader_id;//读者证号
    private Date lend_date;//借出日期
    private Date back_date;//归还日期


    public Integer getSer_num() {
        return ser_num;
    }

    public void setSer_num(Integer ser_num) {
        this.ser_num = ser_num;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public Integer getReader_id() {
        return reader_id;
    }

    public void setReader_id(Integer reader_id) {
        this.reader_id = reader_id;
    }

    public Date getLend_date() {
        return lend_date;
    }

    public void setLend_date(Date lend_date) {
        this.lend_date = lend_date;
    }

    public Date getBack_date() {
        return back_date;
    }

    public void setBack_date(Date back_date) {
        this.back_date = back_date;
    }

    @Override
    public String toString() {
        return "LendList{" +
                "ser_num=" + ser_num +
                ", book_id=" + book_id +
                ", reader_id=" + reader_id +
                ", lend_date=" + lend_date +
                ", back_date=" + back_date +
                '}';
    }
}
