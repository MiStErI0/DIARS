package clases;

public class cliente extends persona{
    String IdPersona;
    String IdDireccion;
    String Descripcion;
    String IdDistrito;
    
    public cliente(String Id,String IdPersona, String Nombre, String Apellidop, String Apellidom, String Correo, Long Telefono, Long Dni, String FechaNac, Integer Estado,String IdDireccion, String Descripcion, String IdDistrito) {
        super(Id, Nombre, Apellidop, Apellidom,Correo,Telefono,Dni,FechaNac, Estado);
        
        this.IdPersona=IdPersona;
        this.IdDireccion=IdDireccion;
        this.Descripcion=Descripcion;
        this.IdDistrito=IdDistrito;
    }

    public String getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(String IdPersona) {
        this.IdPersona = IdPersona;
    }

    public String getIdDireccion() {
        return IdDireccion;
    }

    public void setIdDireccion(String IdDireccion) {
        this.IdDireccion = IdDireccion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getIdDistrito() {
        return IdDistrito;
    }

    public void setIdDistrito(String IdDistrito) {
        this.IdDistrito = IdDistrito;
    }
    
    
}
