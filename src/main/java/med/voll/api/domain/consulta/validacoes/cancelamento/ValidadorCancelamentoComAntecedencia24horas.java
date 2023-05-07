package med.voll.api.domain.consulta.validacoes.cancelamento;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosCancelamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidadorCancelamentoComAntecedencia24horas implements ValidadorCancelamentoDeConsultas{

    public void validar(DadosCancelamentoConsulta dados){
        var dataConsulta = dados.consulta().getData();
        var agora = LocalDateTime.now();
        var diferenca = Duration.between(agora, dataConsulta).toHours();


        if(diferenca < 24){
            throw new ValidacaoException("Cancelamento deve ser feito com antecedência mínima de 24 horas");
        }


    }

}
