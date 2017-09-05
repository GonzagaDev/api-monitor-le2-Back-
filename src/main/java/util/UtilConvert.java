package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UtilConvert {
    /**
     *
     * @return Retorna data minima aceita nos campos datas
     */
    public  java.sql.Date getDataBase() {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.YEAR, 2017);
        cal.set(Calendar.MONTH, 0);
        cal.set(Calendar.DATE, 1);
        return new java.sql.Date(cal.getTimeInMillis());
    }

}



