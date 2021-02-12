package ddm.common ;


import ddm.common.utility.log.interfaces.ILogs;

public class Common {

    static ILogs logger;

    private Common() {

    }

    public static int getVersion () {
        return 1;
    }

    public static ILogs getLogger() {
        return logger;
    }

    public static void setLogger(ILogs logger) {
        Common.logger = logger;
    }

}
