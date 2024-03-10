/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogot� - Colombia)
 * Programa de Ingenier�a de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Desarrollo de Software - Gu�a 2 - Actividad 2
 * Ejercicio: alcancia
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package mundo;

public class Alcancia {
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------


    private int numeroMonedas50 =0;

    private int numeroMonedas100 =0;

    private int numeroMonedas200 = 0;

    private int numeroMonedas500 = 0;

    private int numeroMonedas1000 = 0;

    private int estado=0;


    public Alcancia() {
        numeroMonedas50 = 0;
        numeroMonedas100 = 0;
        numeroMonedas200 = 0;
        numeroMonedas500 = 0;
        numeroMonedas1000 = 0;
        estado = 0;
    }

    public int darNumeroMonedas50() {
        return numeroMonedas50;
    }


    public int darNumeroMonedas100() {

        return numeroMonedas100;
    }

    public int darNumeroMonedas200() {
      
        return numeroMonedas200;
    }


    public int darNumeroMonedas500() {
       
        return numeroMonedas500;
    }

    public int darNumeroMonedas1000() {

        return numeroMonedas1000;
    }


    public String darEstado() {
        if (estado == 0) {
            return "NO ROTA";

        }   else if ( estado == 1) {
            return "ROTA";
        }   else {
                return "Estado inválido";
        }
      
        

    }

 
    public int calcularTotalDinero() {
        int totalDinero = (numeroMonedas50*50) +
                        (numeroMonedas100 * 100) + 
                        (numeroMonedas200 * 200) + 
                        (numeroMonedas500 * 500) + 
                        (numeroMonedas1000 * 1000);


        return totalDinero;
    }

    /**
     * Retorna el estado de la alcanc�a. <br>
     * <b>pre: </b> La alcanc�a no est� rota.
     *
     * @return Cadena que informa la cantidad de monedas que hab�a en la alcanc�a y la cantidad total de dinero.
     */
    public String darEstadoAlcancia() {
        int totalDinero = calcularTotalDinero();

        return "La alcanc�a ten�a: \n " + numeroMonedas50 + " moneda(s) de $50 \n " + numeroMonedas100 + " moneda(s) de $100 \n " + numeroMonedas200 + " moneda(s) de $200 \n " + numeroMonedas500 + " moneda(s) de $500 \n " + numeroMonedas1000
                + " moneda(s) de $1000 \n " + "Para un total de $" + totalDinero + " pesos.";
    }

    public void agregarMoneda50() {
        numeroMonedas50++;
    }

    public void agregarMoneda100() {
        numeroMonedas100++;
    }

    public void agregarMoneda200() {
        numeroMonedas200++;
        
    }

    public void agregarMoneda500() {
        numeroMonedas500++;
    }

    
    public void agregarMoneda1000() {
        numeroMonedas1000++;

    }

  
    public void romperAlcancia() {
        estado=1;
   
    }


    public int obtenerDenominacionMasNumerosa() {
        int denominacionMasNumerosa = 0;
        int cantidadMasNumerosa = 0;

        if (numeroMonedas50>cantidadMasNumerosa) {
            cantidadMasNumerosa = numeroMonedas50;
            denominacionMasNumerosa = 50;
        }
        if (numeroMonedas100>cantidadMasNumerosa){
            cantidadMasNumerosa = numeroMonedas100;
            denominacionMasNumerosa = 100;
        }
        if (numeroMonedas200>cantidadMasNumerosa) {
            cantidadMasNumerosa = numeroMonedas200;
            denominacionMasNumerosa = 200;
        }
        if (numeroMonedas500>cantidadMasNumerosa) {
            cantidadMasNumerosa = numeroMonedas500;
            denominacionMasNumerosa = 500;
        }
        if (numeroMonedas1000>cantidadMasNumerosa) {
            cantidadMasNumerosa = numeroMonedas1000;
            denominacionMasNumerosa = 1000;
        }

        return denominacionMasNumerosa;
    }

    /**
     * Una alcanc�a es valiosa si solo posee monedas de 1000 y de 500, y no hay
     * monedas de otras denominaciones.
     * <p>
     * Este m�todo permite determinar si la alcanc�a es valiosa, o sea, solo posee
     * monedas de 1000 pesos y de 500
     *
     * @return si es valiosa o no
     */
    public boolean valiosa() {
        
        return (numeroMonedas50 == 0 && numeroMonedas100==0 && numeroMonedas200 == 0 && numeroMonedas500 > 0 && numeroMonedas1000 > 0);
  
        }
}
