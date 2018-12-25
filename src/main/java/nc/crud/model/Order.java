package nc.crud.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column(name = "start_long")
    private float startPointLongitude;

    @Column(name = "start_width")
    private float startPointWidth;

    @Column(name = "end_long")
    private float endPointLongitude;

    @Column(name = "end_width")
    private float endPointWidth;

    @Column
    private String status;

}
