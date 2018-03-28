import com.company.Branch;
import com.company.Customer;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class BranchTest {
    private static final String CUSTOMER_FIRST_NAME = "Zygmunt";
    private static final String CUSTOMER_LAST_NAME = "Paczkowski";
    private static final String CUSTOMER_MIDDLE_NAME = "Adam";
    private static final String BRANCH_NAME = "Oddział w Piasecznie";
    private static final Long BRANCH_ID = 1001L;
    private ArrayList<Customer> listOfCustomers = new ArrayList<>();


    @Test
    public void addCustomer() {
        //given
        Customer newCustomer = new Customer(CUSTOMER_FIRST_NAME, CUSTOMER_MIDDLE_NAME, CUSTOMER_LAST_NAME);
        Branch newBranch = new Branch(BRANCH_NAME, BRANCH_ID);

        //when
        boolean addingResult = newBranch.addCustomer(newCustomer);

        //then
        assertEquals(true, addingResult);
    }


    @Test
    public void removeCustomer() {
        //given
        Customer newCustomer = new Customer(CUSTOMER_FIRST_NAME, CUSTOMER_MIDDLE_NAME, CUSTOMER_LAST_NAME);
        Branch newBranch = new Branch(BRANCH_NAME, BRANCH_ID);

        //when
        boolean removingResult = newBranch.removeCustomer(newCustomer);

        //then
        assertEquals(true, removingResult);
    }

    @Test
    public void queryCustomer() {
        //given
        Customer newCustomer = new Customer(CUSTOMER_FIRST_NAME, CUSTOMER_MIDDLE_NAME, CUSTOMER_LAST_NAME);
        Branch newBranch = new Branch(BRANCH_NAME, BRANCH_ID);
        newBranch.addCustomer(newCustomer);
        //when
        int foundCustomerPosition = newBranch.queryCustomer(CUSTOMER_FIRST_NAME, CUSTOMER_MIDDLE_NAME, CUSTOMER_LAST_NAME);

        //then
        assertEquals(0, foundCustomerPosition);

    }

    @Test
    public void getCustomerFromList() {

        //given
        Customer newCustomer = new Customer(CUSTOMER_FIRST_NAME, CUSTOMER_MIDDLE_NAME, CUSTOMER_LAST_NAME);
        Customer foundCustomer = new Customer();
        Branch newBranch = new Branch(BRANCH_NAME, BRANCH_ID);
        newBranch.addCustomer(newCustomer);

        //when
        foundCustomer = newBranch.getCustomerFromList(0);

        //then
        assertEquals(newCustomer, foundCustomer );
    }

}