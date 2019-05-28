
package clases;

public class producto {
private int cod;
private String prod;
private double prec;
private int cant;

public producto(int c,String p,double pr,int ca){
   cod=c;
   prod=p;
   prec=pr;
   cant=ca;
}

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the prod
     */
    public String getProd() {
        return prod;
    }

    /**
     * @param prod the prod to set
     */
    public void setProd(String prod) {
        this.prod = prod;
    }

    /**
     * @return the prec
     */
    public double getPrec() {
        return prec;
    }

    /**
     * @param prec the prec to set
     */
    public void setPrec(double prec) {
        this.prec = prec;
    }

    /**
     * @return the cant
     */
    public int getCant() {
        return cant;
    }

    /**
     * @param cant the cant to set
     */
    public void setCant(int cant) {
        this.cant = cant;
    }

}
