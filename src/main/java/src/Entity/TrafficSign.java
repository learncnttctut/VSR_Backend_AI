package src.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "trafficsign")
@Data
@Getter
@Setter
public class TrafficSign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String signName;
    private String signCode;
    private String description;
    @Lob
    private String image;

}
