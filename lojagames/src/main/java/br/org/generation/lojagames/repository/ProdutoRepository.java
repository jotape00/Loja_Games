package br.org.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List <Produto> findAllByProdutoContainingIgnoreCase(String produto);
}
