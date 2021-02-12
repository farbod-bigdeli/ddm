package ddm.common.utility.log.internals;


import ddm.common.utility.log.interfaces.ILogger;

import java.io.InputStream;
import java.util.logging.LogManager;


public class JavaUtilLoggerImpl implements ILogger {

    private java.util.logging.Logger logger;

    public JavaUtilLoggerImpl() {

    }

    public void Info(String message) throws Exception {
        logger.info(message);
    }

    public void Error(Exception ex) throws Exception {
        logger.info(ex.getMessage());
    }

    public void Append() {
        logger = java.util.logging.Logger.getLogger(JavaUtilLoggerImpl.class.getName());
        try {
            InputStream inputStream = JavaUtilLoggerImpl.class.getResourceAsStream("/configs/common/logging.properties");
            LogManager.getLogManager().readConfiguration(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
