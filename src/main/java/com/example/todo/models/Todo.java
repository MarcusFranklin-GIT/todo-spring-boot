package com.example.todo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String description;
    private boolean isCompleted;
}


//@Data is an annotation used instead of getters and setters
// right click -> Generate -> getters and setters -> select the entities to create , then for all selected fields gets getters and setters
// below are examples
// to create these LOMBOK dependency is required

//public Long getId() {
//    return id;
//}
//
//public void setId(Long id) {
//    this.id = id;
//}
//
//public String getTitle() {
//    return title;
//}
//
//public void setTitle(String title) {
//    this.title = title;
//}
//
//public String getDescription() {
//    return description;
//}
//
//public void setDescription(String description) {
//    this.description = description;
//}
//
//public boolean isCompleted() {
//    return isCompleted;
//}
//
//public void setCompleted(boolean completed) {
//    isCompleted = completed;
//}

