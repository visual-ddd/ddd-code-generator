package com.wd.paas.generate2;

/**
 * 代码生成专用异常
 */
public class CodeGenException extends RuntimeException {
    public CodeGenException(String message) {
        super(message);
    }
    
    public CodeGenException(String message, Throwable cause) {
        super(message, cause);
    }
}
