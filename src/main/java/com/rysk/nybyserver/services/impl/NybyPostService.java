package com.rysk.nybyserver.services.impl;

import com.rysk.nybyserver.services.IAmazonService;
import com.rysk.nybyserver.services.INybyPostService;
import com.rysk.nybyserver.models.converters.NybyPostConverter;
import com.rysk.nybyserver.models.views.NybyPost;
import com.rysk.nybyserver.repositories.NybyPostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class NybyPostService implements INybyPostService {

    private NybyPostRepository nybyPostRepository;
    private NybyPostConverter nybyPostConverter;
    private IAmazonService amazonService;

    @Override
    public NybyPost getNybyPostById(Long id) {
        return nybyPostRepository.findById(id)
                .map(nybyPostDto -> nybyPostConverter.convertToView(nybyPostDto))
                .orElseThrow();
    }

    @Override
    public List<NybyPost> getAllNybyPost() {
        return nybyPostRepository.findAll()
                .stream()
                .map(nybyPostDto -> nybyPostConverter.convertToView(nybyPostDto))
                .collect(Collectors.toList());
    }

    @Override
    public NybyPost addNybyPost(NybyPost nybyPost, MultipartFile file) {
        String bucketKey = UUID.randomUUID().toString();

        try {
            String imageUrl = amazonService.uploadBlob(bucketKey, file);
            nybyPost.setImageUrl(imageUrl);
            nybyPostRepository.save(nybyPostConverter.convertToDto(nybyPost));
            return nybyPost;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}
