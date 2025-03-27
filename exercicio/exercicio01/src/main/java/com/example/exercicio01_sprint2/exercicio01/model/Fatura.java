package com.example.exercicio01_sprint2.exercicio01.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "fatura")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Fatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotBlank(message="O numero do cartao não pode estar em Branco")
    @Pattern(regexp = "\\d{16}", message="O numero de cartao deve conter 16 caracteres. ")
    private String numeroCartao;

    @NotBlank(message = "O nome do titular não pode estar em branco")
    @Size(min=4, max=100, message = "O nome deve possuir entre 4 e 100 caracteres")
    private String nomeTitular;

    @NotNull(message = "O valor não pode ser nulo.")
    @DecimalMin(value="10.00", message = "O valor minimo é 10 reais")
    @DecimalMax(value="5000.00", message="O valor máximo é 5000.00")
    private Double valor;

    @NotNull(message = "A data não pode ser Nula")
    @FutureOrPresent(message = "A data de pagamento deve ser a data atual ou futura")
    private LocalDate dataPagamento;

    @NotBlank(message = "O email não pode estar em branco")
    @Email(message = "O e-mail deve ser válido.")
    private String emailContato;

}
