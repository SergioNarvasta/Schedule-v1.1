package MODELO;

public class CONTACTOS {

    int Codigo;
    String Nombres;
    String Apellidos;

    public CONTACTOS() {}

    public CONTACTOS(int Codigo, String Nombres, String Apellidos) {
        this.Codigo = Codigo;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;}
    
    public CONTACTOS(Object[] Registro) {
        Codigo = Integer.parseInt(Registro[0].toString());
        Nombres = Registro[1].toString();
        Apellidos = Registro[2].toString(); }
    
    public Object[] getRegistro(){
        Object[] Registro = {Codigo,Nombres,Apellidos};
        return Registro; }
    
    public static String[] getCadena(){
        return new String[] {"Código", "Apellidos", "Nombres"};   }
    
    public String getCod(){return Codigo+"";};

    public int getCodigo() {
        return Codigo;}

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;}

    public String getNombres() {
        return Nombres;}

    public void setNombres(String Nombres) {
        this.Nombres = Nombres; }
 
    public String getApellidos() {
        return Apellidos;}
    
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;}
    
    






}
