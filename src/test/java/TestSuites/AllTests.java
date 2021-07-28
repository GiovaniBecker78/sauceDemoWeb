package TestSuites;

import TestCases.RealizaCompraComSucesso;
import TestCases.RealizaCompraComSucessoCsv;
import TestCases.RealizaCompraComSucessoDataProvider;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)

 @SelectPackages("TestCases")//teste por pacotes

//@SelectClasses({RealizaCompraComSucessoCsv.class, RealizaCompraComSucessoDataProvider.class})//Teste por classe

public class AllTests {
}
