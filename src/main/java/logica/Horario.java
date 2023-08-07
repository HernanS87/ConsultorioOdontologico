package logica;

public class Horario {
    
    private int id_Horario;
    private String horario_inicio;
    private String horario_fin;

    public Horario() {
    }

    public Horario(int id_Horario, String horario_inicio, String horario_fin) {
        this.id_Horario = id_Horario;
        this.horario_inicio = horario_inicio;
        this.horario_fin = horario_fin;
    }

    public int getId_Horario() {
        return id_Horario;
    }

    public void setId_Horario(int id_Horario) {
        this.id_Horario = id_Horario;
    }

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public String getHorario_fin() {
        return horario_fin;
    }

    public void setHorario_fin(String horario_fin) {
        this.horario_fin = horario_fin;
    }
    
    
    
}
