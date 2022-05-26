package modelo;

public class empresa
{
    //---------
    // Atributos
    //---------
    private int saltotal;
    private int horas;
    private int fechaN;
    private int frechaI;
    private final double SALARIO = 1000000;
    private final double SALARIOHORA = 4167;
    private final double AUXTRANS = 117172 ; 
    //---------
    // metodos
    //---------
    public empresa(int sTotal)
    {
        this.saltotal =sTotal;
        this.horas = 0; 
        this.saltotal =0;
        this.fechaN = 0; 
        this.frechaI =0;
    }
    public void setPrecio(double stotal) 
    {
        this.sltota = sltota;
    }

    public int getFrechaI() {
        return frechaI;
    }

    public void setFrechaI(int frechaI) {
        this.frechaI = frechaI;
    }

    public int getFechaN() {
        return fechaN;
    }

    public void setFechaN(int fechaN) {
        this.fechaN = fechaN;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void calculosauxtrans()
    {
        if horas >= 192 ; 
         saltotal=horas * SALARIOHORA;
         else
         {
         ("digite el valor de las horas semanales")
         }

    }

    public void edadempleado()
    {
        setFechaN(getFechaN()-2022);
    }

    public void edadingreso()
    {
        setFrechaI(getFrechaI()-2022);
    }



    }


