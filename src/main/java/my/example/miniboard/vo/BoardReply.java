package my.example.miniboard.vo;

import java.util.Date;

public class BoardReply {
    private int rid;    // 댓글 번호
    private String replyUid;    // 작성자 아이디
    private String replyContent;
    private Date registerDate;
    private Date updateDate;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getReplyUid() {
        return replyUid;
    }

    public void setReplyUid(String replyUid) {
        this.replyUid = replyUid;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
