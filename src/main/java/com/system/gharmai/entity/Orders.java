package com.system.gharmai.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @SequenceGenerator(name = "cms_user_seq_gen", sequenceName = "cms_user_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "cms_user_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column
    private String title;

    private String body;
}
