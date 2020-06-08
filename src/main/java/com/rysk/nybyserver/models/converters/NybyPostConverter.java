package com.rysk.nybyserver.models.converters;

import com.rysk.nybyserver.engines.IDateConverterEngine;
import com.rysk.nybyserver.models.dto.NybyPostDto;
import com.rysk.nybyserver.models.views.NybyPost;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NybyPostConverter {

    private IDateConverterEngine dateConverterEngine;

    public NybyPost convertToView(NybyPostDto nybyPostDto) {
        return NybyPost.builder()
                .id(nybyPostDto.getId())
                .username(nybyPostDto.getUsername())
                .description(nybyPostDto.getDescription())
                .imageUrl(nybyPostDto.getImageUrl())
                .createdOn(dateConverterEngine.convertLocalDateTimeToLong(nybyPostDto.getCreatedOn()))
                .lastModifiedOn(dateConverterEngine.convertLocalDateTimeToLong(nybyPostDto.getLastModifiedOn()))
                .build();
    }

    public NybyPostDto convertToDto(NybyPost nybyPost) {
        return NybyPostDto.builder()
                .id(nybyPost.getId())
                .username(nybyPost.getUsername())
                .description(nybyPost.getDescription())
                .imageUrl(nybyPost.getImageUrl())
                .createdOn(dateConverterEngine.convertLongToLocalDateTime(nybyPost.getCreatedOn()))
                .lastModifiedOn(dateConverterEngine.convertLongToLocalDateTime(nybyPost.getLastModifiedOn()))
                .build();
    }

}
