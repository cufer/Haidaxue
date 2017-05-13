package Dao;

import java.sql.Date;
import java.time.LocalDate;

/**
 * Created by panyunyi on 2017/5/9.
 */
public class generateDate {
    public static String generateDate() {
        String s = "";
        Date date = Date.valueOf(LocalDate.now());
        s = s + date.toString();
        return s;
    }
}
