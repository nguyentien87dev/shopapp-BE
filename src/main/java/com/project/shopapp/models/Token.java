package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tokens")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Token {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "token", length = 200)
   private String token;

   @Column(name = "token_type", length = 50)
   private String tokenType;

   @Column(name = "expiration_date")
   private LocalDateTime expirationDate;

   private boolean revoked;
   private boolean exprired;

   @ManyToOne
   @JoinColumn(name = "user_id")
   private User userId;

}
