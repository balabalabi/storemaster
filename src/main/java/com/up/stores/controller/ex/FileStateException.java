package com.up.stores.controller.ex;
//这个异常类的目的是用于处理文件上传时出现文件状态异常的情况。
// 通过抛出这个异常，可以在程序的其他地方捕获并处理该异常，以便提供适当的错误消息或执行相应的逻辑。文
// 件状态异常可能包括文件不存在、无法读取文件或无法写入文件等问题。
public class FileStateException extends FileUploadException {
    public FileStateException() {
        super();
    }

    public FileStateException(String message) {
        super(message);
    }

    public FileStateException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileStateException(Throwable cause) {
        super(cause);
    }

    protected FileStateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
