package br.com.eloisaoliveira.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {

  @Id
  private UUID id;

  public String username;
  public String name;
  public String password;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
