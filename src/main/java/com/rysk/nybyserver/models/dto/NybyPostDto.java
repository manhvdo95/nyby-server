package com.rysk.nybyserver.models.dto;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "nyby_post")
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
