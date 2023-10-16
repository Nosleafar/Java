public class Relogio {
    private int hora;
    private int minutos;

    public void definirHora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public void exibirHoraAtual() {
        System.out.println("Hora atual: " + hora + ":" + minutos);
    }

    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        
        relogio.definirHora(10, 30);
        relogio.exibirHoraAtual();
    }
}