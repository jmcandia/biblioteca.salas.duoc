package biblioteca.salas.duoc.biblioteca.salas.duoc.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "carrera")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Entidad que representa a una carrera")
public class Carrera {
    @Id
    @Schema(description = "Código de la carrera", example = "ING")
    private String codigo;

    @Schema(description = "Nombre de la carrera", example = "Ingeniería")
    private String nombre;

}
