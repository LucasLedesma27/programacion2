import java.time.LocalDate;

public class TicketSoporte {

    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private String tecnicoAsignado;


    public TicketSoporte(int id, String descripcion) {
        this(id, descripcion, null);
    }

    public TicketSoporte(int id, String descripcion, Usuario usuario) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado= "abierto";
        this.usuario = usuario;
        this.fechaCreacion= LocalDate.now();
    }

    public void cerrarTicket(){
        this.estado="cerrado";
    }

    public void asignarTecnico(String tecnico){
        this.tecnicoAsignado= tecnico;
    }

    public String mostrarDetalle (){
        return "ticket #"+id+"-"+descripcion+"\nEstado: "+estado+"\nFecha de creacion: "+fechaCreacion+(usuario != null ? "\nUsuario:" +usuario : "")+(tecnicoAsignado != null ? "\n tecnico asignado: "+tecnicoAsignado : "");
    }

    public String getEstado(){
        return estado;
    }

    public int getId(){
        return id;
    }
}
