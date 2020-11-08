package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


//faz a condução DOS DADOS da tabela ao banco, serve para persistir os dados no banco
//para fazer os gets e posts vc precisa persistir
public interface ManutencaoRepository extends JpaRepository<ManutencaoTable, Long>{

	List<ManutencaoTable> findByNome(String nome);

	Optional<ManutencaoTable> findByNomeAndCategoria(String nome, String categoria);
    
    @Query(value = "SELECT * FROM manutencao_table where id >= 2", nativeQuery = true)
    List<ManutencaoTable> anosIntervalos();
    
//  $scope.anosIntervalos = function(){
//  $http.get("http://localhost:8080/manutencoes/teste")
//  .then(function(resposta) {
//    $scope.manutencoes = resposta.data; 
//  });
//}
//
//$scope.anosIntervalos();
//
//});

}
