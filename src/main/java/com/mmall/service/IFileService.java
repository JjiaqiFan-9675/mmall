package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by jiaqi on 7/20/20.
 * This is a interface to upload file
 */

public interface IFileService {

    String upload(MultipartFile file, String path);
}