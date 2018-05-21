package br.una.veiculos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.una.veiculos.model.Veiculo;
import br.una.veiculos.repository.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repositorio;
	
	
}
