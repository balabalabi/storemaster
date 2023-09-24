package com.up.stores.controller.ex;
//这个异常类的目的是用于处理文件上传时文件大小超过限制的情况
public class FileSizeException extends FileUploadException {
    public FileSizeException() {
        super();
    }

    public FileSizeException(String message) {
        super(message);
    }

    public FileSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileSizeException(Throwable cause) {
        super(cause);
    }
//使用指定的错误消息、原因、是否启用抑制和是否启用堆栈跟踪作为参数，调用父类的完整构造函数
    protected FileSizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
