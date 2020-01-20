package models;

import javax.persistence.*;

@Entity
@Table(name="expenses")
public class Expenses {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
}
