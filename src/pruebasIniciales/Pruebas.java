package pruebasIniciales;

public class Pruebas {
    public static void main(String[] args) {
        boolean isBlanco = true;
        boolean isNegro = false;
        int i = 10;
        if ((isBlanco == true) && (i % 2 > 5)) {
            if (isNegro == true) {
                System.out.print("es negro");
            }
        } else if (i % 5 == 0) {
            if (isNegro == true) {
                System.out.print("es blanco");
            }
        }

    } // main end
}  // class end

