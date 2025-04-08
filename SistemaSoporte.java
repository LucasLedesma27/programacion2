import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {

    private List<TicketSoporte> tickets;
    private static int contadorTickets = 0;

    public SistemaSoporte(){
        tickets = new ArrayList<>();
    }
    public TicketSoporte crearTicket (String descripcion, Usuario usuario){
        contadorTickets++;
        TicketSoporte ticket = new TicketSoporte (contadorTickets, descripcion, usuario);
        tickets.add(ticket);
        return ticket;
    }

    public void asignarTecnico(int ticketId, Tecnico tecnico){
        for (TicketSoporte ticket : tickets){
            if(ticketId == ticket.getId()){
                ticket.asignarTecnico(tecnico.getNombre());
                break;
            }
        }
    }

    public void listarTickets(String estado){
        System.out.println("Tickets en esatado: "+estado);
        for (TicketSoporte ticket : tickets){
            if (ticket.getEstado().equalsIgnoreCase(estado)){
                System.out.println(ticket.mostrarDetalle());
                System.out.println("--------------------");
            }
        }
    }
}
