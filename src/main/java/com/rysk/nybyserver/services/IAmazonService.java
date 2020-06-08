package com.rysk.nybyserver.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface IAmazonService {

    byte[] downloadBlob(String bucketKey) throws IOException;

    String uploadBlob(String bucketKey, MultipartFile file) throws IOException;

}
