package com.rysk.nybyserver.model;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class NybyPost implements Serializable {

    private Long id;
    private String username;
    private String description;
    private String imageUrl;
    private Long createdOn;
    private Long lastModifiedOn;

}
