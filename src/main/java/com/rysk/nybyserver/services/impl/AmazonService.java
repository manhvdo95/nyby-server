package com.rysk.nybyserver.services.impl;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.IOUtils;
import com.rysk.nybyserver.services.IAmazonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@AllArgsConstructor
public class AmazonService implements IAmazonService {

    @Value("${amazonProperties.bucketName}")
    private String bucketName;

    private AmazonS3 amazonS3Client;

    @Override
    public byte[] downloadBlob(String bucketKey) throws IOException {
        GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, bucketKey);
        S3Object s3Object = amazonS3Client.getObject(getObjectRequest);
        S3ObjectInputStream objectInputStream = s3Object.getObjectContent();
        return IOUtils.toByteArray(objectInputStream);
    }

    @Override
    public String uploadBlob(String bucketKey, MultipartFile file) throws IOException {
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(file.getSize());
        amazonS3Client.putObject(bucketName, bucketKey, file.getInputStream(), metadata);
        return amazonS3Client.getUrl(bucketName, bucketKey).toString();
    }
}
