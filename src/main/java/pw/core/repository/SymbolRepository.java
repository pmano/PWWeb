package pw.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pw.core.entity.Symbol;

public interface SymbolRepository extends JpaRepository<Symbol, Integer>{

}
