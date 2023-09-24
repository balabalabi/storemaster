package com.up.stores.controller.ex;
//这个异常类的目的是用于处理文件上传时出现文件为空的情况。
public class FileEmptyException extends FileUploadException{
    //调用父类的无参数构造函数
    public FileEmptyException() {
        super();
    }

//使用指定的错误消息作为参数，调用父类的带有错误消息的构造函数。
    public FileEmptyException(String message) {
        super(message);
    }
//使用指定的错误消息和原因（Throwable对象）作为参数，调用父类的带有错误消息和原因的构造函数。
    public FileEmptyException(String message, Throwable cause) {
        super(message, cause);
    }
//使用指定的原因（Throwable对象）作为参数，调用父类的带有原因的构造函数。
    public FileEmptyException(Throwable cause) {
        super(cause);
    }
//使用指定的错误消息、原因、是否启用抑制和是否启用堆栈跟踪作为参数，调用父类的完整构造函数
    protected FileEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
