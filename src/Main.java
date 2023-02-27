public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setEdad(15);
        cliente.setTelefono("57311340122");
        cliente.setNombre("Lucas");
        cliente.setCredito(true);

        System.out.println(cliente.getEdad() + cliente.getNombre() + cliente.getTelefono() + cliente.isCredito());
    }
}