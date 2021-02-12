package ddm.client;

import ddm.common.Common;
import ddm.common.utility.file_helper.FileHelper;
import ddm.common.utility.log.interfaces.ILogger;
import ddm.common.utility.log.interfaces.ILogs;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Common.setLogger(InitLogger());
        String versionString = String.format("client started,  version: %s" , Common.getVersion());
        try {
            Common.getLogger().Info(versionString);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static ILogs InitLogger() {
        Path currentPath = Paths.get(".","common", "utility.log.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext(currentPath.toString());
        ILogs logs = (ILogs) context.getBean("Logs");
        logs.AddAppender(InitLoggerAppender(context));

        return logs;
    }

    private static ArrayList<ILogger> InitLoggerAppender(ApplicationContext beanContext) {
        ILogger java = (ILogger) beanContext.getBean("JavaUtilLogger");
        ArrayList<ILogger> loggers= new ArrayList<>();
        loggers.add(java);

        return loggers;
    }
}
