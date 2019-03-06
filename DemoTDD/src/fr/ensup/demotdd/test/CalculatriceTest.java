package fr.ensup.demotdd.test;

import fr.ensup.demotdd.service.Calculatrice;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Created by jimmy on 06/03/2019.
 */
public class CalculatriceTest {

    @Test
    public void scenarioAdditionEntiers(){
        //fail ("echec");
        Calculatrice myCalc = new Calculatrice();
        int res = Calculatrice.ajouterEntiers(3,3);
        Assert.assertEquals(res, 5);
        }
    }

