package Entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by panyunyi on 2017/5/3.
 */
@Entity
@Table(name = "h_question", schema = "aaa", catalog = "")
public class HQuestionEntity {
    private String questionSn;
    private String questionLable;
    private String haidaxueSn;
    private String questionContent;
    private Boolean questionAnonymity;
    private Boolean questionBonus;
    private Date questionDate;

    @Id
    @Column(name = "question_sn", nullable = false, length = 15)
    public String getQuestionSn() {
        return questionSn;
    }

    public void setQuestionSn(String questionSn) {
        this.questionSn = questionSn;
    }

    @Basic
    @Column(name = "question_lable", nullable = true, length = 30)
    public String getQuestionLable() {
        return questionLable;
    }

    public void setQuestionLable(String questionLable) {
        this.questionLable = questionLable;
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
    @Column(name = "question_content", nullable = true, length = 300)
    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    @Basic
    @Column(name = "question_anonymity", nullable = true)
    public Boolean getQuestionAnonymity() {
        return questionAnonymity;
    }

    public void setQuestionAnonymity(Boolean questionAnonymity) {
        this.questionAnonymity = questionAnonymity;
    }

    @Basic
    @Column(name = "question_bonus", nullable = true)
    public Boolean getQuestionBonus() {
        return questionBonus;
    }

    public void setQuestionBonus(Boolean questionBonus) {
        this.questionBonus = questionBonus;
    }

    @Basic
    @Column(name = "question_date", nullable = true)
    public Date getQuestionDate() {
        return questionDate;
    }

    public void setQuestionDate(Date questionDate) {
        this.questionDate = questionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HQuestionEntity that = (HQuestionEntity) o;

        if (questionSn != null ? !questionSn.equals(that.questionSn) : that.questionSn != null) return false;
        if (questionLable != null ? !questionLable.equals(that.questionLable) : that.questionLable != null)
            return false;
        if (haidaxueSn != null ? !haidaxueSn.equals(that.haidaxueSn) : that.haidaxueSn != null) return false;
        if (questionContent != null ? !questionContent.equals(that.questionContent) : that.questionContent != null)
            return false;
        if (questionAnonymity != null ? !questionAnonymity.equals(that.questionAnonymity) : that.questionAnonymity != null)
            return false;
        if (questionBonus != null ? !questionBonus.equals(that.questionBonus) : that.questionBonus != null)
            return false;
        if (questionDate != null ? !questionDate.equals(that.questionDate) : that.questionDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = questionSn != null ? questionSn.hashCode() : 0;
        result = 31 * result + (questionLable != null ? questionLable.hashCode() : 0);
        result = 31 * result + (haidaxueSn != null ? haidaxueSn.hashCode() : 0);
        result = 31 * result + (questionContent != null ? questionContent.hashCode() : 0);
        result = 31 * result + (questionAnonymity != null ? questionAnonymity.hashCode() : 0);
        result = 31 * result + (questionBonus != null ? questionBonus.hashCode() : 0);
        result = 31 * result + (questionDate != null ? questionDate.hashCode() : 0);
        return result;
    }
}
