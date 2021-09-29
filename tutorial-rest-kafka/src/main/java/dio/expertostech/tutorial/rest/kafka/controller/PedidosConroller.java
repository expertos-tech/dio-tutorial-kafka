package dio.expertostech.tutorial.rest.kafka.controller;

import dio.expertostech.tutorial.rest.kafka.data.PedidoData;
import dio.expertostech.tutorial.rest.kafka.services.RegistraEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PedidosConroller {

    private final RegistraEventoService eventoService;

    @PostMapping(path = "/api/salva-pedido")
    public ResponseEntity<String>  SalvarPedido(@RequestBody PedidoData pedido) {
        eventoService.adicionarEvento("SalvarPedido", pedido);
        return ResponseEntity.ok("Sucesso");
    }

}
