package com.example.proyecto_cibertec.entity;

public class Alumno {

    private int idAlumno;
    private String nombres;
    private String apellidos;
    private String DNI;
    private String correo;
    private String fecNac;
    private String fecReg;

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecNac() {
        return fecNac;
    }

    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
    }

    public String getFecReg() {
        return fecReg;
    }

    public void setFecReg(String fecReg) {
        this.fecReg = fecReg;
    }
}
