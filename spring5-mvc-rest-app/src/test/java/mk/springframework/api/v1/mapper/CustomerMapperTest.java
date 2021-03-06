package mk.springframework.api.v1.mapper;

import mk.springframework.model.CustomerDTO;
import mk.springframework.domain.Customer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerMapperTest {

    public static final String FIRSTNAME = "Jimmy";
    public static final String LASTNAME = "Fallon";
    CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    @Test
    public void customerToCustomerDTO() throws Exception {
        //given
        Customer customer = new Customer();
        customer.setFirstname(FIRSTNAME);
        customer.setLastname(LASTNAME);

        //when
        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);

        //then
        Assert.assertEquals(FIRSTNAME, customerDTO.getFirstname());
        Assert.assertEquals(LASTNAME, customerDTO.getLastname());

    }

}