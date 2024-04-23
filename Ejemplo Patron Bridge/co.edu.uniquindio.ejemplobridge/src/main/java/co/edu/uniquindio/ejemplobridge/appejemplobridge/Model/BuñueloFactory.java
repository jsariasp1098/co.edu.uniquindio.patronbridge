package co.edu.uniquindio.ejemplobridge.appejemplobridge.Model;

public abstract class BuñueloFactory {
    protected BuñueloMachine buñueloMachine;

    public BuñueloFactory(BuñueloMachine bm){
        buñueloMachine = bm;
    }

    public abstract void prepararBuñuelo();
}
