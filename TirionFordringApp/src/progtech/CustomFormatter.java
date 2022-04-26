package progtech;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

/**
 * Sets formatting for the Log class in UtilHelper.
 * (Formatting means the way we meant the log messages to be written into the log.txt file)
 */
public class CustomFormatter extends Formatter{

    @Override
    public String format(LogRecord record)
    {
        DateFormat df = new SimpleDateFormat("yyyy. MMMM dd. hh:mm:ss");
        StringBuilder sb = new StringBuilder(1000);
        sb.append("[").append(record.getLevel()).append("]\t");
        sb.append(df.format(new Date(record.getMillis()))).append(" - ");
        sb.append("[").append(record.getSourceClassName()).append(".");
        sb.append(record.getSourceMethodName()).append("] - ");
        sb.append(formatMessage(record));
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public String getHead(Handler h)
    {
        return super.getHead(h);
    }

    @Override
    public String getTail(Handler h)
    {
        return super.getTail(h);
    }
    
    

}
