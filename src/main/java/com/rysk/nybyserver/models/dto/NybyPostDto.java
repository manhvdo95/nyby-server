package com.rysk.nybyserver.models.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "nyby_post")
@Builder
@EqualsAndHashCode
public class NybyPostDto {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "created_on", updatable = false)
    private LocalDateTime createdOn;

    @Column(name = "last_modified_on")
    private LocalDateTime lastModifiedOn;

}
