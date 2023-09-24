package com.up.stores.controller.ex;
//这个异常类的目的是用于处理文件上传时出现文件类型不匹配的情况。
// 通过抛出这个异常，可以在程序的其他地方捕获并处理该异常，以便提供适当的错误消息或执行相应的逻辑。
// 文件类型不匹配可能涉及到上传的文件不符合预期的文件类型或扩展名。
public class FileTypeException extends FileUploadException{
    public FileTypeException() {
        super();
    }

    public FileTypeException(String message) {
        super(message);
    }

    public FileTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileTypeException(Throwable cause) {
        super(cause);
    }

    protected FileTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
