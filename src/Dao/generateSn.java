package Dao;

import java.sql.Date;
import java.time.LocalDate;

/**
 * Created by panyunyi on 2017/5/7.
 */
public class generateSn {
    public static String generateSn(){
        String s="";
        Date date=Date.valueOf(LocalDate.now());
        s=s+date.toString();
        String sNew[]=s.split("-");
        s="";
        for(String line:sNew){
            s=s+line;
        }

        s=s+String.valueOf((int)(Math.random()*10000000));
        return s;
    }
}
