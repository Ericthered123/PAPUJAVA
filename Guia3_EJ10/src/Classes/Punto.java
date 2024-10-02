package Classes;

import java.util.Objects;

public class Punto {


        private int x;
        private int y;

        public Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public Punto(){
            this.x=0;
            this.y=0;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Classes.Punto punto)) return false;
            return getX() == punto.getX() && getY() == punto.getY();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getX(), getY());
        }

        @Override
        public String toString() {
            return "PuntoOrigen{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public void mover(int dx, int dy) {
            x += dx;
            y += dy;
        }


    }




