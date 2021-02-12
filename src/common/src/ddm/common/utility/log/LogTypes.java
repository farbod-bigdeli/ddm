package ddm.common.utility.log;

public enum LogTypes {
    Log4j(1),
    Java(2);

    private final int logTypes;

    LogTypes(int logtypes) {
        this.logTypes =logtypes;
    }
}
