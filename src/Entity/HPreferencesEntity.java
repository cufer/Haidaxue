package Entity;

import javax.persistence.*;

/**
 * Created by panyunyi on 2017/5/3.
 */
@Entity
@Table(name = "h_preferences", schema = "aaa", catalog = "")
public class HPreferencesEntity {
    private String answersSn;
    private String haidaxueSn;

    @Basic
    @Column(name = "answers_sn", nullable = true, length = 15)
    public String getAnswersSn() {
        return answersSn;
    }

    public void setAnswersSn(String answersSn) {
        this.answersSn = answersSn;
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

        HPreferencesEntity that = (HPreferencesEntity) o;

        if (answersSn != null ? !answersSn.equals(that.answersSn) : that.answersSn != null) return false;
        if (haidaxueSn != null ? !haidaxueSn.equals(that.haidaxueSn) : that.haidaxueSn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = answersSn != null ? answersSn.hashCode() : 0;
        result = 31 * result + (haidaxueSn != null ? haidaxueSn.hashCode() : 0);
        return result;
    }
}
