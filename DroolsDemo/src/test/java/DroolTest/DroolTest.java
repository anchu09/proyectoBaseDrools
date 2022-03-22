package DroolTest;

import org.drools.DroolsDemo.PaymentOffer;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolTest {
    public static void main(String[] args) {
        DroolTest mydrool_test = new DroolTest();
        mydrool_test.executeBusinessRule();
    }
    public void executeBusinessRule(){
        try{
            KieServices kieServices = KieServices.Factory.get();
            KieContainer kc = kieServices.getKieClasspathContainer();

            KieSession ksession = kc.newKieSession("exampleKS");
            if(ksession==null){
                System.out.println("La sesión es nula.");
            }else {
                System.out.println("La sesión no es nula.");
                ksession.insert(new PaymentOffer("phonepe"));
                ksession.fireAllRules();
                ksession.dispose(); // Stateful rule session must always be disposed when finished
                //System.out.println("The cashback for this payment channel VIA KIE"+my_payment_offer.getChannel());
            }

        } catch (Exception e){
        e.printStackTrace ();}

    }
}
