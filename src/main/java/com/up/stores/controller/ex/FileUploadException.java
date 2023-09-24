package com.up.stores.controller.ex;


/** 文件上传相关异常的基类 */
//这个异常类作为文件上传相关异常的基类，可以作为其他具体文件上传异常类的父类，
// 提供统一的异常处理和错误信息。
// 它可以用作捕获和处理文件上传过程中出现的一般性异常，或者作为其他文件上传异常类的基类，
// 派生出更具体的异常类以处理不同的文件上传问题。
public class FileUploadException extends RuntimeException {
    public FileUploadException() {
        super();
    }

    public FileUploadException(String message) {
        super(message);
    }

    public FileUploadException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileUploadException(Throwable cause) {
        super(cause);
    }

    protected FileUploadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}