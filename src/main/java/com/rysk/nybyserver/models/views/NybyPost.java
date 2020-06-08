package com.rysk.nybyserver.models.views;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode
public class NybyPost implements Serializable {

    private Long id;
    private String username;
    private String description;
    private String imageUrl;
    private Long createdOn;
    private Long lastModifiedOn;

}
