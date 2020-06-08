package com.rysk.nybyserver.services;

import com.rysk.nybyserver.models.views.NybyPost;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface INybyPostService {

    NybyPost getNybyPostById(Long id);

    List<NybyPost> getAllNybyPost();

    NybyPost addNybyPost(NybyPost nybyPost, MultipartFile file);

}
