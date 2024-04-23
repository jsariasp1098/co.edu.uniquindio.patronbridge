package co.edu.uniquindio.ejemplobridge.appejemplobridge.Model;

public class SmallBuñuelofactory extends BuñueloFactory{
    public SmallBuñuelofactory(BuñueloMachineChocolate bm) {
        super(bm);
    }

    @Override
    public void prepararBuñuelo() {

        buñueloMachine.startBueñueloMachine();

    }
}
