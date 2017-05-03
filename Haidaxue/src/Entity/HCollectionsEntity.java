package Entity;

import javax.persistence.*;

/**
 * Created by panyunyi on 2017/5/3.
 */
@Entity
@Table(name = "h_collections", schema = "aaa", catalog = "")
public class HCollectionsEntity {
    private String questionSn;
    private String haidaxueSn;

    @Basic
    @Column(name = "question_sn", nullable = true, length = 15)
    public String getQuestionSn() {
        return questionSn;
    }

    public void setQuestionSn(String questionSn) {
        this.questionSn = questionSn;
    }

    @Id
    @Column(name = "haidaxue_sn", nullable = false, length = 15)
    public String getHaidaxueSn() {
        return haidaxueSn;
    }

    public void setHaidaxueSn(String haidaxueSn) {
        this.haidaxueSn = haidaxueSn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HCollectionsEntity that = (HCollectionsEntity) o;

        if (questionSn != null ? !questionSn.equals(that.questionSn) : that.questionSn != null) return false;
        if (haidaxueSn != null ? !haidaxueSn.equals(that.haidaxueSn) : that.haidaxueSn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = questionSn != null ? questionSn.hashCode() : 0;
        result = 31 * result + (haidaxueSn != null ? haidaxueSn.hashCode() : 0);
        return result;
    }
}
