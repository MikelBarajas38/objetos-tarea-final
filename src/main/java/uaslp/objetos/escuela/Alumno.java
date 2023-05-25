package uaslp.objetos.escuela;

import java.time.LocalDate;

public class Alumno {

    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    Alumno(AlumnoBuilder builder) {
        this.nombre = builder.nombre;
        this.clave = builder.clave;
        this.claveDeCarrera = builder.claveDeCarrera;
        this.anioDeIngreso = builder.anioDeIngreso;
        this.fechaNacimiento = builder.fechaNacimiento;
    }

    public static AlumnoBuilder builder() {
        return new AlumnoBuilder();
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public static class AlumnoBuilder {

        private String nombre;
        private String clave;
        private String claveDeCarrera;
        private int anioDeIngreso;
        private LocalDate fechaNacimiento;

        public AlumnoBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public AlumnoBuilder clave(String clave) {
            this.clave = clave;
            return this;
        }

        public AlumnoBuilder claveDeCarrera(String claveDeCarrera) {
            this.claveDeCarrera = claveDeCarrera;
            return this;
        }

        public AlumnoBuilder anioDeIngreso(int anioDeIngreso) {
            this.anioDeIngreso = anioDeIngreso;
            return this;
        }

        public AlumnoBuilder fechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Alumno build() {
            return new Alumno(this);
        }

    }
}
