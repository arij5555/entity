package tn.esprit.arctic.project.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;

    private String nomComposant;
    private Float prix;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @OneToOne(mappedBy = "composant", cascade = CascadeType.ALL)
    private DetailComposant detailsComposant;
}

