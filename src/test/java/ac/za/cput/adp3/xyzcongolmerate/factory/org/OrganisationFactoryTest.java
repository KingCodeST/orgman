package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {



    @Test
    public void buildOrganisation() {

        Organisation org=OrganisationFactory.buildOrganisation("Flight");
        System.out.println(org);
        Assert.assertNotNull(org);

        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the OrganisationFactory class
         * 4. Assert that the id is generated.
         */
    }
}