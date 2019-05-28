package clases;

public class cliente {
    private String empresa;
    private long ruc;
    private String dir; 

    public cliente(String empresa, long ruc,String dir) {
        this.empresa = empresa;
        this.ruc = ruc;
        this.dir = dir;

    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the ruc
     */
    public long getRuc() {
        return ruc;
    }

    /**
     * @param ruc the ruc to set
     */
    public void setRuc(long ruc) {
        this.setRuc(ruc);
    }

    /**
     * @return the dir
     */
    public String getDir() {
        return dir;
    }

    /**
     * @param dir the dir to set
     */
    public void setDir(String dir) {
        this.dir = dir;
    }

    /**
     * @param ruc the ruc to set
     */
}
