package Classes;


import java.time.LocalDate;
    public class Clima {

        private Ubicacion ubicacion;
        private double actualTemperature;
        private double presion;
        private char escala;
        private double vientoVel;
        private String direccion;
        private double humedad;
        private double visibilidad;
        private LocalDate ultimaActualizacion;

        public Clima(Ubicacion ubicacion, double actualTemperature, double presion, char escala
                , double vientoVel, String direccion, double humedad, double
                             visibilidad, LocalDate ultimaActualizacion) {
            this.ubicacion = ubicacion;
            this.actualTemperature = actualTemperature;
            this.presion = presion;
            this.escala = escala;
            this.vientoVel = vientoVel;
            this.direccion = direccion;
            this.humedad = humedad;
            this.visibilidad = visibilidad;
            this.ultimaActualizacion = ultimaActualizacion;
        }


        public Ubicacion getUbicacion() {
            return ubicacion;
        }

        public double getActualTemperature() {
            return actualTemperature;
        }

        public double getPresion() {
            return presion;
        }

        public char getEscala() {
            return escala;
        }

        public double getVientoVel() {
            return vientoVel;
        }

        public String getDireccion() {
            return direccion;
        }

        public double getHumedad() {
            return humedad;
        }

        public double getVisibilidad() {
            return visibilidad;
        }

        public LocalDate getUltimaActualizacion() {
            return ultimaActualizacion;
        }

        public void mostrarClima(){
            System.out.println("El clima en " + getUbicacion().mostrarUbicacion() + " es:" );
            System.out.println("Temperatura actual:" + getActualTemperature() + " "+ getEscala());
            System.out.println("Viento : " + getVientoVel() + " km/H, desde " + getDireccion());
            System.out.println("Presion: " + getPresion() + " hPa");
            System.out.println("Humedad: " + getHumedad() + " % ");
            System.out.println("Visibilidad: " + getVisibilidad() + " KM");
            System.out.println("Ultima actualizacion: " + getUltimaActualizacion());
        }

    }





