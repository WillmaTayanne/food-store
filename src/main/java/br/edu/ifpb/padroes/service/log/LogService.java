package br.edu.ifpb.padroes.service.log;

// Padrao State 

public class LogService {

    private LogHandler logHandler;

	
    public LogService(LogHandler logHandler) {
        this.logHandler = logHandler;
    }

    public void debug(String message) {
        logHandler.log("stack trace");
        logHandler.log(message);
    }

    public void info(String message) {
        logHandler.log(message);
    }
    public void error(String message) {
        logHandler.log("error");
        logHandler.log(message);
    }
}
