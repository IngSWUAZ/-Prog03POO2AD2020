package mx.edu.uaz.ingsoftware.poo2.clientecontrolconcursos.entidades;


import java.io.Serializable;
import java.util.Objects;

public class Sede implements Serializable {

  private long idSede;
  private String nombreSede;
  private long idInstitucionSede;
  private String emailDirectorSede;
  private String urlSede;

  public Sede() {
  }

  public Sede(long idSede) {
    this.idSede = idSede;
  }

  public Sede(long idSede, String nombreSede, long idInstitucionSede, String emailDirectorSede) {
    this.idSede = idSede;
    this.nombreSede = nombreSede;
    this.idInstitucionSede = idInstitucionSede;
    this.emailDirectorSede = emailDirectorSede;
  }

  public long getIdSede() {
    return idSede;
  }

  public void setIdSede(long idSede) {
    this.idSede = idSede;
  }


  public String getNombreSede() {
    return nombreSede;
  }

  public void setNombreSede(String nombreSede) {
    this.nombreSede = nombreSede;
  }


  public long getIdInstitucionSede() {
    return idInstitucionSede;
  }

  public void setIdInstitucionSede(long idInstitucionSede) {
    this.idInstitucionSede = idInstitucionSede;
  }


  public String getEmailDirectorSede() {
    return emailDirectorSede;
  }

  public void setEmailDirectorSede(String emailDirectorSede) {
    this.emailDirectorSede = emailDirectorSede;
  }


  public String getUrlSede() {
    return urlSede;
  }

  public void setUrlSede(String urlSede) {
    this.urlSede = urlSede;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Sede sede = (Sede) o;
    return idSede == sede.idSede;
  }

  @Override
  public int hashCode() {
    return Objects.hash(idSede);
  }

  @Override
  public String toString() {
    return nombreSede;
  }
}
