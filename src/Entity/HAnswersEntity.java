package Entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by panyunyi on 2017/5/3.
 */
@Entity
@Table(name = "h_answers", schema = "aaa", catalog = "")
public class HAnswersEntity {
    private String questionSn;
    private String answersSn;
    private String haidaxueSn;
    private String answersContent;
    private Boolean answersAnonymity;
    private Integer answersSupportCount;
    private Integer answersCommentCount;
    private Date answersDate;

    @Basic
    @Column(name = "question_sn", nullable = true, length = 15)
    public String getQuestionSn() {
        return questionSn;
    }

    public void setQuestionSn(String questionSn) {
        this.questionSn = questionSn;
    }

    @Id
    @Column(name = "answers_sn", nullable = false, length = 15)
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
    @Column(name = "answers_content", nullable = true, length = 300)
    public String getAnswersContent() {
        return answersContent;
    }

    public void setAnswersContent(String answersContent) {
        this.answersContent = answersContent;
    }

    @Basic
    @Column(name = "answers_anonymity", nullable = true)
    public Boolean getAnswersAnonymity() {
        return answersAnonymity;
    }

    public void setAnswersAnonymity(Boolean answersAnonymity) {
        this.answersAnonymity = answersAnonymity;
    }

    @Basic
    @Column(name = "answers_support_count", nullable = true)
    public Integer getAnswersSupportCount() {
        return answersSupportCount;
    }

    public void setAnswersSupportCount(Integer answersSupportCount) {
        this.answersSupportCount = answersSupportCount;
    }

    @Basic
    @Column(name = "answers_comment_count", nullable = true)
    public Integer getAnswersCommentCount() {
        return answersCommentCount;
    }

    public void setAnswersCommentCount(Integer answersCommentCount) {
        this.answersCommentCount = answersCommentCount;
    }

    @Basic
    @Column(name = "answers_date", nullable = true)
    public Date getAnswersDate() {
        return answersDate;
    }

    public void setAnswersDate(Date answersDate) {
        this.answersDate = answersDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HAnswersEntity that = (HAnswersEntity) o;

        if (questionSn != null ? !questionSn.equals(that.questionSn) : that.questionSn != null) return false;
        if (answersSn != null ? !answersSn.equals(that.answersSn) : that.answersSn != null) return false;
        if (haidaxueSn != null ? !haidaxueSn.equals(that.haidaxueSn) : that.haidaxueSn != null) return false;
        if (answersContent != null ? !answersContent.equals(that.answersContent) : that.answersContent != null)
            return false;
        if (answersAnonymity != null ? !answersAnonymity.equals(that.answersAnonymity) : that.answersAnonymity != null)
            return false;
        if (answersSupportCount != null ? !answersSupportCount.equals(that.answersSupportCount) : that.answersSupportCount != null)
            return false;
        if (answersCommentCount != null ? !answersCommentCount.equals(that.answersCommentCount) : that.answersCommentCount != null)
            return false;
        if (answersDate != null ? !answersDate.equals(that.answersDate) : that.answersDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = questionSn != null ? questionSn.hashCode() : 0;
        result = 31 * result + (answersSn != null ? answersSn.hashCode() : 0);
        result = 31 * result + (haidaxueSn != null ? haidaxueSn.hashCode() : 0);
        result = 31 * result + (answersContent != null ? answersContent.hashCode() : 0);
        result = 31 * result + (answersAnonymity != null ? answersAnonymity.hashCode() : 0);
        result = 31 * result + (answersSupportCount != null ? answersSupportCount.hashCode() : 0);
        result = 31 * result + (answersCommentCount != null ? answersCommentCount.hashCode() : 0);
        result = 31 * result + (answersDate != null ? answersDate.hashCode() : 0);
        return result;
    }
}
