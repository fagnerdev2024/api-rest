package med.voll.api.domain.medico;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MedicoService {

    private final MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public Map<String, List<String>> listarNomesDistintos() {
        List<String> nomesDistintos = medicoRepository.findDistinctByNome()
                .stream()
                .distinct()
                .collect(Collectors.toList());

        return Map.of("nomes", nomesDistintos);
    }
}
