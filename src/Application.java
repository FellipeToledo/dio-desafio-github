import com.projectDIO.BusOperationPPO.domain.Brt;
import com.projectDIO.BusOperationPPO.domain.Bus;
import com.projectDIO.BusOperationPPO.domain.Conventional;
import com.projectDIO.BusOperationPPO.domain.Operation;
import com.projectDIO.BusOperationPPO.domain.Operator;

/**
 * @author Fellipe Toledo
 * @created 26/11/2021
 */
public class Application {
    public static void main(String[] args) {

        //Cria novos Ônibus Convencionais.
            Bus conventional1 = new Conventional();
            conventional1.setConsortium("Intersul");
            conventional1.setCompany("Real");
            conventional1.setOrderNumber("A41558");
            ((Conventional) conventional1).setLine(415);

            Bus conventional2 = new Conventional();
            conventional2.setConsortium("Transcarioca");
            conventional2.setCompany("Redentor");
            conventional2.setOrderNumber("C47514");
            ((Conventional) conventional2).setLine(397);

            Bus conventional3 = new Conventional();
            conventional3.setConsortium("Internorte");
            conventional3.setCompany("Pavunense");
            conventional3.setOrderNumber("B28998");
            ((Conventional) conventional3).setLine(218);

        /*System.out.println(":::Dados dos Ônibus Convencionais:::");
        System.out.print("---*---*---*---*---*---*---*---*---");
        System.out.println(conventional1);
        System.out.print("___________________________________");
        System.out.println(conventional2);
        System.out.print("___________________________________");
        System.out.println(conventional3);
        System.out.println("___________________________________");*/

        //Cria novos Ônibus BRT.
            Bus brt1 = new Brt();
            brt1.setConsortium("BRT Santacruz");
            brt1.setCompany("Futuro");
            brt1.setOrderNumber("E48798D");
            ((Brt) brt1).setBusLane("Transoeste");

            Bus brt2 = new Brt();
            brt2.setConsortium("BRT Transcarioca");
            brt2.setCompany("Redentor");
            brt2.setOrderNumber("E47985C");
            ((Brt) brt2).setBusLane("Transcarioca");

      /*System.out.println("---*---*---*---*---*---*---*---*---");
        System.out.println(":::Dados dos Ônibus BRT:::");
        System.out.println(brt1);
        System.out.print("___________________________________");
        System.out.println(brt2);
        System.out.println("___________________________________");*/


        //Cria nova Operação.
            Operation operation = new Operation();
            operation.setDescription("Operação dos Coletivos na Cidade do Rio de Janeiro");

        //Adiciona Ônibus na Garagem.
            operation.getBusInGarage().add(conventional1);
            operation.getBusInGarage().add(conventional2);
            operation.getBusInGarage().add(conventional3);
            operation.getBusInGarage().add(brt1);
            operation.getBusInGarage().add(brt2);

        //Cria novos Operadores.
            Operator rioOnibus = new Operator();
            rioOnibus.setName("Rio Ônibus");

            Operator fetranspor = new Operator();
            fetranspor.setName("Fetranspor");

        //Vincula Operadores à Operação.
            rioOnibus.linkOperatorToOperation(operation);
//            fetranspor.linkOperatorToOperation(operation);

        //Coloca Ônibus em Standby.
            rioOnibus.putBusIntoStandby(operation);
//            fetranspor.putBusIntoStandby(operation);
//            rioOnibus.putBusIntoStandby(operation);
//            rioOnibus.putBusIntoStandby(operation);
//            fetranspor.putBusIntoStandby(operation);

        //Ônibus na Garagem.
//            System.out.println("Ônibus na garagem: \n" + operation.getBusInGarage());

        //Coloca Ônibus em Operação.
            rioOnibus.putBusIntoOperation();
//            rioOnibus.putBusIntoOperation();
//            rioOnibus.putBusIntoOperation();
//            fetranspor.putBusIntoOperation();
//            fetranspor.putBusIntoOperation();

        //Retira Ônibus de Operação
//            rioOnibus.removeBusFromOperation();
//            rioOnibus.removeBusFromOperation();
//            rioOnibus.removeBusFromOperation();
//            fetranspor.removeBusFromOperation();
//            fetranspor.removeBusFromOperation();


        //Dados da Operação
            System.out.println(operation.toString());

        //Dados do Operador Rio Ônibus
            //System.out.println(rioOnibus.toString());

        //Dados do Operador Fetranspor
            //System.out.println(fetranspor.toString());

    }
}
