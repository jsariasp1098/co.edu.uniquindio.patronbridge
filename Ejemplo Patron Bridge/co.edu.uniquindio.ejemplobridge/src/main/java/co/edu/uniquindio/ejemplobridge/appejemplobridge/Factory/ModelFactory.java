package co.edu.uniquindio.ejemplobridge.appejemplobridge.Factory;

import co.edu.uniquindio.ejemplobridge.appejemplobridge.Model.*;

public class ModelFactory {


    public static void crearFactory(String factory, String sabor) {
        if(sabor == "Chocolate"){
            BuñueloMachineChocolate cmChocolate = new BuñueloMachineChocolate();
            if (factory =="Pequeña"){
                SmallBuñuelofactory smBuñueloFactory = new SmallBuñuelofactory(cmChocolate);
            }else if(factory =="Mediana"){
                MediumBuñueloFactory mdBueñueloFactory = new MediumBuñueloFactory(cmChocolate);
            }else if(factory =="Grande"){
                LargeBuñueloFactory lgBuñueloFactory = new LargeBuñueloFactory(cmChocolate);
            }
        }else if(sabor=="Arequipe"){
            BuñueloMachineArequipe cmArequipe = new BuñueloMachineArequipe();
        }


    }
}
