package Utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerGenerator {
    private static Faker faker = new Faker(new Locale("pt-BR"));//foi o fabricio

    public static String getFirstName(){
        return faker.name().firstName();
    }//aqui nome

    public static String getLastName(){
        return faker.name().lastName();
    }//aqui sobre

    public static String getPostalCode(){
        return faker.address().zipCode();
    }//aqui cep


}
