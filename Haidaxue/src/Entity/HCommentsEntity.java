package Entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by panyunyi on 2017/5/3.
 */
@Entity
@Table(name = "h_comments", schema = "aaa", catalog = "")
public class HCommentsEntity {
    private String commentSn;
    private String answersSn;
    private String haidaxueSn;
    private String commentContent;
    private Date commentDate;

    @Id
    @Column(name = "comment_sn", nullable = false, length = 15)
    public String getCommentSn() {
        return commentSn;
    }

    public void setCommentSn(String commentSn) {
        this.commentSn = commentSn;
    }

    @Basic
    @Column(name = "answers_sn", nullable = true, length = 15)
    public String getAnswersSn() {
        return answersSn;
    }

    public void setAnswersSn(String answersSn) {
        this.answersSn = answersSn;
    }

    @Basic
    @Column(name = "haidaxue_sn", nullable = true, length = 15)
    public String getHaidaxueSn() {
        return haidaxueSn;
    }

    public void setHaidaxueSn(String haidaxueSn) {
        this.haidaxueSn = haidaxueSn;
    }

    @Basic
    @Column(name = "comment_content", nullable = true, length = 300)
    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    @Basic
    @Column(name = "comment_date", nullable = true)
    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HCommentsEntity that = (HCommentsEntity) o;

        if (commentSn != null ? !commentSn.equals(that.commentSn) : that.commentSn != null) return false;
        if (answersSn != null ? !answersSn.equals(that.answersSn) : that.answersSn != null) return false;
        if (haidaxueSn != null ? !haidaxueSn.equals(that.haidaxueSn) : that.haidaxueSn != null) return false;
        if (commentContent != null ? !commentContent.equals(that.commentContent) : that.commentContent != null)
            return false;
        if (commentDate != null ? !commentDate.equals(that.commentDate) : that.commentDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentSn != null ? commentSn.hashCode() : 0;
        result = 31 * result + (answersSn != null ? answersSn.hashCode() : 0);
        result = 31 * result + (haidaxueSn != null ? haidaxueSn.hashCode() : 0);
        result = 31 * result + (commentContent != null ? commentContent.hashCode() : 0);
        result = 31 * result + (commentDate != null ? commentDate.hashCode() : 0);
        return result;
    }
}
