
package herencia;

public class Estudiante extends Persona{
    private int codigoEst;
    private float NotaFinal;
    //constructor
    public Estudiante (String nombre, String apellido, int edad, int codigoEst, float NotaFinal ){
        super (nombre, apellido, edad);
        this.codigoEst=codigoEst;
        this.NotaFinal=NotaFinal;
    }

    public void MostrarDatos(){
        System.out.println("Nombre: "+
                "\nnombre"+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nCodigo del estudante: "+codigoEst+
                "\nnota final: "+NotaFinal);
        
    }
}
