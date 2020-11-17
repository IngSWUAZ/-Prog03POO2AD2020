package mx.edu.uaz.ingsoftware.poo2.clientecontrolconcursos.clientes;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import mx.edu.uaz.ingsoftware.poo2.clientecontrolconcursos.entidades.*;
import mx.edu.uaz.ingsoftware.poo2.clientecontrolconcursos.interfaces.DAOConcursos;
import mx.edu.uaz.ingsoftware.poo2.clientecontrolconcursos.utils.HttpUtils;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DaoConcursosImpl implements DAOConcursos, Serializable {
    private final String urlBase;
    private final String pathInstitucion = "institucion/";
    private final String pathPersona = "persona/";

    public DaoConcursosImpl(String urlBase) {
        this.urlBase = urlBase;
    }

    @Override
    public List<Entidad> obtenEntidades() throws IOException {
        return null;
    }

    @Override
    public List<Municipio> obtenMunicipios(long idEntidad) throws IOException {
        return null;
    }

    @Override
    public List<Institucion> obtenInstituciones() throws IOException {
        // TODO
        return null;
    }

    @Override
    public boolean agregaInstitucion(Institucion dato) throws IOException {
        // TODO
        return false;
    }

    @Override
    public boolean eliminaInstitucion(long idInstitucion) throws IOException {
        // TODO
        return false;
    }

    @Override
    public boolean actualizaInstitucion(Institucion dato) throws IOException {
        // TODO
        return false;
    }

    @Override
    public List<Persona> obtenPersonas() throws IOException {
        //TODO
        return null;
    }

    @Override
    public boolean agregaPersona(Persona dato) throws IOException {
        // TODO
        return false;
    }

    @Override
    public boolean eliminaPersona(String emailPersona) throws IOException {
        // TODO
        return false;
    }

    @Override
    public boolean actualizaPersona(Persona dato) throws IOException {
        // TODO
        return false;
    }

    @Override
    public Optional<DatosEstudiante> obtenDatosEstudiante(String emailEstudiante) {
        return Optional.empty();
    }

    @Override
    public boolean agregaDatosEstudiante(DatosEstudiante dato) {
        return false;
    }

    @Override
    public boolean eliminaDatosEstudiante(String emailEstudiante) {
        return false;
    }

    @Override
    public boolean actualizaDatosEstudiante(DatosEstudiante dato) {
        return false;
    }

    @Override
    public List<Sede> obtenSedes() {
        return null;
    }

    @Override
    public boolean agregaSede(Sede dato) {
        return false;
    }

    @Override
    public boolean eliminaSede(long idSede) {
        return false;
    }

    @Override
    public boolean actualizaSede(Sede dato) {
        return false;
    }

    @Override
    public List<Concurso> obtenConcursos() {
        return null;
    }

    @Override
    public boolean agregaConcurso(Concurso dato) {
        return false;
    }

    @Override
    public boolean eliminaConcurso(long idConcurso) {
        return false;
    }

    @Override
    public boolean actualizaConcurso(Concurso dato) {
        return false;
    }

    @Override
    public List<Equipo> obtenEquipos() {
        return null;
    }

    @Override
    public boolean agregaEquipo(Equipo dato) {
        return false;
    }

    @Override
    public boolean eliminaEquipo(long idEquipo) {
        return false;
    }

    @Override
    public boolean actualizaEquipo(Equipo dato) {
        return false;
    }

    @Override
    public List<String> obtenCorreosDeInstitucion(long idInstitucion, String tipo) {
        return null;
    }

    @Override
    public List<Sede> obtenSedesDisponibles(long idConcurso) {
        return null;
    }

    @Override
    public List<SedeConcursoExtendida> obtenSedesAsignadas(long idConcurso) {
        return null;
    }

    @Override
    public boolean agregaSedeConcurso(SedeConcurso dato) {
        return false;
    }

    @Override
    public boolean eliminaSedeConcurso(long idSedeConcurso) {
        return false;
    }

    @Override
    public List<EquiposSedeConcursoExtendida> obtenEquiposRegistrados(long idConcurso, long idInstitucion) {
        return null;
    }

    @Override
    public List<Equipo> obtenEquiposDisponibles(long idSedeConcurso, long idInstitucion) {
        return null;
    }

    @Override
    public boolean registrarEquipoSedeConcurso(EquiposSedeConcurso dato) {
        return false;
    }

    @Override
    public boolean cancelarEquipoSedeConcurso(long idEquipoSedeConcurso) {
        return false;
    }
}
