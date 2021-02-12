package ddm.common.utility.log;

import ddm.common.utility.log.interfaces.ILogger;
import ddm.common.utility.log.internals.JavaUtilLoggerImpl;

public class LogFactory {
    public static ILogger Build(LogTypes type) {
        switch (type) {
            case Java:
                return new JavaUtilLoggerImpl();
            default:
                return null;
        }
    }
}
