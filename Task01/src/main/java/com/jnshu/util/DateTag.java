package com.jnshu.util;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**用于页面 jstl时间格式化
 * Created by Tom on 2017/4/28.
 */
public class DateTag extends TagSupport{
    private static final long serialVersionUID=6464168398214506236L;
//    private String value;
    private long value;
    @Override
    public int doStartTag() throws JspException{
        try {
//            String vv = "" + value;
//            long time = Long.valueOf(vv.trim());
            Calendar c = Calendar.getInstance();
            c.setTimeInMillis(value);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String s = dateFormat.format(c.getTime());
            pageContext.getOut().write(s);
        }catch (Exception e){
            e.printStackTrace();
        }
        return super.doStartTag();
    }
//    public void setValue(String value) {
//        this.value = value;
    public void setValue(long value) {
        this.value = value;
    }
}

