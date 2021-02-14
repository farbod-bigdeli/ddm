package ddm.common.utility.log;

import ddm.common.utility.log.interfaces.ILogActions;
import ddm.common.utility.log.interfaces.ILogAppender;
import ddm.common.utility.log.interfaces.ILogger;
import ddm.common.utility.log.interfaces.ILogs;


public class Logs implements ILogs {

    private static Logs logs;

    private static Iterable<ILogger> appends;

    private Logs() {
    }

    @Override
    public void AddAppender(Iterable<ILogger> loggers) {
        this.appends = loggers;

        for(ILogAppender appender : appends){
            appender.Append();
        }
    }

    public static Logs getInstance()  {
        if (logs == null) {
            logs = new Logs();
        }
        return logs;
    }

    public void Info(String message) throws Exception {
        CheckAppender();
        for (ILogActions item : appends) {
            item.Info(message);
        }
    }

    public void Error(Exception ex) throws Exception {
        CheckAppender();
        for (ILogActions item : appends) {
            item.Error(ex);
        }
    }

    private void CheckAppender() throws Exception {
        if(appends == null)
            throw new Exception("appender is null");
    }
}
