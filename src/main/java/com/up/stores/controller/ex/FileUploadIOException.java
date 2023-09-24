package com.up.stores.controller.ex;
//这个异常类的目的是用于处理文件上传过程中的I/O异常，即涉及文件读写操作时可能发生的异常。
// 通过抛出这个异常，可以在程序的其他地方捕获并处理该异常，以便提供适当的错误消息或执行相应的逻辑。

public class FileUploadIOException extends FileUploadException {
    public FileUploadIOException() {
        super();
    }

    public FileUploadIOException(String message) {
        super(message);
    }

    public FileUploadIOException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileUploadIOException(Throwable cause) {
        super(cause);
    }

    protected FileUploadIOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
