package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;



@Entity
@Table(name = "orders")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

//   @Column(name = "name", nullable = false)
//   private String name;

   @ManyToOne
   @JoinColumn(name = "user_id")
   private User userId;

   @Column(name = "fullname", length = 100)
   private String fullName;


   @Column(name = "email", length = 100)
   private String email;

   @Column(name = "phone_number",nullable = false, length = 100)
   private String phoneNumber;

   @Column(name = "address", length = 100)
   private String address;

   @Column(name = "note", length = 100)
   private String note;

   @Column(name = "order_date", length = 100)
   private Date orderDate;

   @Column(name = "status")
   private String status;

   @Column(name = "total_money")
   private Integer totalMoney;

   @Column(name = "shipping_method")
   private String shippingMethod;

   @Column(name = "shipping_address")
   private String shippingAddress;

   @Column(name = "shipping_date")
   private LocalDate shippingDate;

   @Column(name = "tracking_number")
   private String trackingNumber;

   @Column(name = "paymen_method")
   private String paymenMethod;


//
//   @Column(name = "paymen_status")
//   private String paymenStatus;

//   @Column(name = "paymen_date")
//   private Date paymenDate;

   @Column(name = "active")
   private Boolean active; //thuộc về adm



}



