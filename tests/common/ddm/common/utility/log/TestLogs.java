package ddm.common.utility.log;

import ddm.common.utility.log.interfaces.ILogger;
import ddm.common.utility.log.interfaces.ILogs;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class TestLogs {
    @Test
    public void  TestAppends() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("utility.log.xml");
        ILogs logs = (ILogs) context.getBean("Logs");
        ILogger java = (ILogger) context.getBean("JavaUtilLogger");
        ArrayList<ILogger> loggers= new ArrayList<>();

        loggers.add(java);

        logs.AddAppender(loggers);
        logs.Info("test message");
    }
}
