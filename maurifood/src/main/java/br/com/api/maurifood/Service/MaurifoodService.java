package br.com.api.maurifood.Service;

import org.springframework.stereotype.Service;

import br.com.api.maurifood.Repository.MaurifoodRepository;
import br.com.api.maurifood.domain.MaurifoodDomain;

@Service
public class MaurifoodService {

	public MaurifoodDomain buscarProduto(Long codigo) {
		for (MaurifoodDomain produto : MaurifoodRepository.getLista()) {
			if (produto.getCodigo().equals(codigo))
				return produto;
		}
		return null;
	}

	public MaurifoodDomain deletarProduto(Long codigo) {
		for (MaurifoodDomain produto : MaurifoodRepository.getLista()) {
			if (produto.getCodigo().equals(codigo)) {
				produto.setIsAtivo(false);
			}
		}
		return null;
	}

	public MaurifoodDomain atualizarProduto(Long codigo, String produto, String valor) {
		MaurifoodDomain produtoAntigo = buscarProduto(codigo);
		if (produtoAntigo != null) {
			produtoAntigo.setProduto(produto);
			produtoAntigo.setValor(valor);
		}
		return produtoAntigo;
	}

	public MaurifoodDomain cadastrarProduto(MaurifoodDomain produto) {
		if (buscarProduto(produto.getCodigo()) == null) {
			MaurifoodRepository.getLista().add(produto);
			return produto;
		}
		return null;
	}

}
