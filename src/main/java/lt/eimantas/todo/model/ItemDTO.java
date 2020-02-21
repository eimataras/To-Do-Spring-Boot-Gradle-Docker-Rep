package lt.eimantas.todo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "item")
public class ItemDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String label;
//    @Column(columnDefinition="tinyint(1) default 0")
    private Boolean isDone;
}
