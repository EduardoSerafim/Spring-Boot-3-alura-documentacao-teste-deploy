package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotNull;

public record DadosCancelamentoConsulta(
        @NotNull
        Consulta consulta,

        @NotNull
        MotivoCancelamento motivoCancelamento
) {
}
