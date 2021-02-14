package ddm.common.utility.log.interfaces;

public interface ILogs extends ILogActions {
    void AddAppender(Iterable<ILogger> loggers);
}
