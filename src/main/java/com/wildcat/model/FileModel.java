package com.wildcat.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by lixingle on 2017/6/14.
 */
public class FileModel {
    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
