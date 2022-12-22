package tech.calaverita.ApiRestCorreosDeMexico.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tech.calaverita.ApiRestCorreosDeMexico.models.CodigoPostalModel;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CodigoPostalRepository extends CrudRepository<CodigoPostalModel, Integer> {
    @Query("SELECT cp.dCodigo FROM CodigoPostalModel cp")
    ArrayList<String> findCp();
    @Query("SELECT cp.dAsenta FROM CodigoPostalModel cp WHERE cp.dCodigo = :cp")
    ArrayList<String> findNeighborhoodByCp(Integer cp);
    @Query("SELECT cp.dAsenta FROM CodigoPostalModel cp WHERE cp.dMnpio = :municipality")
    ArrayList<String> findNeighborhoodByMunicipality(String municipality);

    ArrayList<CodigoPostalModel> findBydCodigo(Integer cp);

    ArrayList<CodigoPostalModel> findBydMnpio(String cp);

    @Query("SELECT cp.dEstado FROM CodigoPostalModel cp")
    ArrayList<String> findDEstado();

    @Query("SELECT cp.dMnpio FROM CodigoPostalModel cp WHERE cp.dEstado = :cp")
    ArrayList<String> findMunicipalityBydState(String cp);

    @Query("SELECT cp.dCodigo FROM CodigoPostalModel cp WHERE cp.dEstado = :cp")
    ArrayList<String> findCpBydState(String cp);

    @Query("SELECT cp FROM CodigoPostalModel cp WHERE CAST(cp.dCodigo AS text) LIKE :cp%")
    ArrayList<CodigoPostalModel> findCpByCoincidence(Integer cp);
}
