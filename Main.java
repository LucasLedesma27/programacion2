//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SistemaSoporte sistema = new SistemaSoporte();

        Usuario u1 = new Usuario(1, "Lucas Ledesma ", "lucas@correo.com");
        Tecnico tec1= new Tecnico(1, "Ariel ", "Redes");
        Tecnico tec2 = new Tecnico(2,"jorge Sampaoli","software" );

        TicketSoporte ticket1 = sistema.crearTicket (" problema con el correo", u1);
        TicketSoporte ticket2 = sistema.crearTicket ("no imprime la impresora ", u1);

        sistema.asignarTecnico(ticket1.getId(), tec1);
        sistema.asignarTecnico(ticket2.getId(), tec2);

        ticket2.cerrarTicket();

        sistema.listarTickets("abierto");
        sistema.listarTickets("cerrado");


    }
}