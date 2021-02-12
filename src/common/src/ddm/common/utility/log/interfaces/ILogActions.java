package ddm.common.utility.log.interfaces;

public interface ILogActions {

    void Info(String message) throws Exception;

    void Error(Exception ex) throws Exception;
}
