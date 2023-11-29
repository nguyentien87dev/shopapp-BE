package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SociaAccount {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "provider", nullable = false, length = 20)
   private String provider;

   @Column(name = "provider_id", nullable = false, length = 50)
   private String providerId;

   @Column(name = "email", length = 150)
   private String email;

   @Column(name = "name", length = 150)
   private String name;



}
