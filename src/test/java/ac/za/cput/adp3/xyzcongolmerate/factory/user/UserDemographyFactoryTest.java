package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

   Date date;
    @Test
    public void buildUserDemography() throws ParseException {

        String fomart ="10/06/2020";
        DateFormat dtg =new SimpleDateFormat("dd/MM/YYYY");
        Date date =dtg.parse(fomart);


        UserDemography ud=UserDemographyFactory.buildUserDemography("cy@gmail.com","Bop","Top","KJK#",date);
        System.out.println(ud);
        Assert.assertNotNull(ud);
        



    }
}