package com.jwcnetworks.bsyoo.jwc.model;

import java.io.Serializable;
import java.util.Date;


public class ModelNotice implements Serializable {

    private String notice_type;
    private String notice_title;
    private Date time;
	private String img_title;
	private String img_info;
	private String text_info;
    private String notice_end;

    @Override
    public String toString() {
        return "ModelNotice{" +
                "notice_type='" + notice_type + '\'' +
                ", notice_title='" + notice_title + '\'' +
                ", time=" + time +
                ", img_title='" + img_title + '\'' +
                ", img_info='" + img_info + '\'' +
                ", text_info='" + text_info + '\'' +
                ", notice_end='" + notice_end + '\'' +
                '}';
    }

    public ModelNotice(String notice_type, String notice_title, Date time, String img_title, String img_info, String text_info, String notice_end) {
        this.notice_type = notice_type;
        this.notice_title = notice_title;
        this.time = time;
        this.img_title = img_title;
        this.img_info = img_info;
        this.text_info = text_info;
        this.notice_end = notice_end;
    }

    public ModelNotice() {
    }

    public String getText_info() {
        return text_info;
    }

    public void setText_info(String text_info) {
        this.text_info = text_info;
    }

    public String getNotice_end() {
        return notice_end;
    }

    public void setNotice_end(String notice_end) {
        this.notice_end = notice_end;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getNotice_type() {
        return notice_type;
    }

    public void setNotice_type(String notice_type) {
        this.notice_type = notice_type;
    }

    public String getNotice_title() {
        return notice_title;
    }

    public void setNotice_title(String notice_title) {
        this.notice_title = notice_title;
    }

    public String getImg_title() {
        return img_title;
    }

    public void setImg_title(String img_title) {
        this.img_title = img_title;
    }

    public String getImg_info() {
        return img_info;
    }

    public void setImg_info(String img_info) {
        this.img_info = img_info;
    }
}
