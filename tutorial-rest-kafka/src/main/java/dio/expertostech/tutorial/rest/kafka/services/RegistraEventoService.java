package dio.expertostech.tutorial.rest.kafka.services;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistraEventoService {

    private final KafkaTemplate<Object, Object> template;

    public <T> void adicionarEvento(String topico, T dados) {
        template.send(topico, dados);
    }

}
