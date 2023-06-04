package br.com.api.maurifood.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.api.maurifood.domain.MaurifoodDomain;


@Repository
public class MaurifoodRepository {
	private static List<MaurifoodDomain> lista = new ArrayList<>();

	public List<MaurifoodDomain> bancoProdutos() {
		if (lista.isEmpty()) {
			lista.add(new MaurifoodDomain(20231010L, "PIZZA DE CALABRESA", "R$ 45,00", true));
			lista.add(new MaurifoodDomain(20232020L, "PIZZA PORTUGUESA", "R$ 45,00", true));
			lista.add(new MaurifoodDomain(20233030L, "PIZZA FRANGO COM CATUPIRI", "R$ 45,00", true));
			lista.add(new MaurifoodDomain(20234040L, "PIZZA DE PEPERONI", "R$ 45,00", true));
			lista.add(new MaurifoodDomain(20235050L, "X-BURGER", "R$ 25,00", true));
			lista.add(new MaurifoodDomain(20235050L, "X-BACON", "R$ 25,00", true));
			lista.add(new MaurifoodDomain(20235050L, "X-SALADA", "R$ 25,00", true));
			lista.add(new MaurifoodDomain(20235050L, "NUGGETS", "R$ 25,00", true));
			lista.add(new MaurifoodDomain(20235050L, "COCA-COLA 2L", "R$ 15,00", true));
			lista.add(new MaurifoodDomain(20235050L, "GUARANA 2L", "R$ 15,00", true));
			lista.add(new MaurifoodDomain(20235050L, "PEPSI 2L", "R$ 15,00", true));
		}

		return lista;

	}

	public static List<MaurifoodDomain> getLista() {
		return lista;
	}

	public static void setLista(List<MaurifoodDomain> lista) {
		MaurifoodRepository.lista = lista;
	}
	
	
}