package org.serhii.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coach {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String name;
 private String surname;
 private String nationality;
}
